import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.PackageCustomization;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Node;
import org.slf4j.Logger;

public class RenderCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.render.models");

        // customize maptileset
        customizeMapTileset(models);

        // customize region copyrights country
        customizeRegionCopyrightsCountry(models);

        // customize map tile size
        customizeMapTileSize(models);

        customizeRegionCopyrights(models);
    }

    private void customizeRegionCopyrights(PackageCustomization models) {
        models.getClass("RegionCopyrights").customizeAst(ast -> ast.getClassByName("RegionCopyrights")
            .ifPresent(clazz -> clazz.getMethodsByName("fromJson")
                .forEach(method -> method.setBody(StaticJavaParser.parseBlock("{ return jsonReader.readObject(reader -> { reader.nextToken(); reader.nextToken(); RegionCopyrights deserializedRegionCopyrights = new RegionCopyrights(); while (reader.nextToken() != JsonToken.END_OBJECT) { String fieldName = reader.getFieldName(); reader.nextToken(); if (\"copyrights\".equals(fieldName)) {List<String> copyrights = reader.readArray(reader1 -> reader1.getString());deserializedRegionCopyrights.copyrights = copyrights;} else if (\"country\".equals(fieldName)) {deserializedRegionCopyrights.country = RegionCopyrightsCountry.fromJson(reader);} else {reader.skipChildren();}} return deserializedRegionCopyrights;});}")))));
    }

    // Customizes the MapTileset class
    private void customizeMapTileset(PackageCustomization models) {
        models.getClass("MapTileset").customizeAst(ast -> {
            ast.addImport("com.azure.core.models.GeoBoundingBox");
            ast.addImport("com.azure.core.models.GeoPosition");

            ast.getClassByName("MapTileset").ifPresent(clazz -> {
                clazz.getMethodsByName("setBounds").forEach(Node::remove);
                clazz.getMethodsByName("setCenter").forEach(Node::remove);

                clazz.getMethodsByName("getBounds").forEach(method -> method.setType("GeoBoundingBox")
                    .setBody(StaticJavaParser.parseBlock("{ return new GeoBoundingBox(this.bounds.get(0), this.bounds.get(1), this.bounds.get(2), this.bounds.get(3)); }")));

                clazz.getMethodsByName("getCenter").forEach(method -> method.setType("GeoPosition")
                    .setBody(StaticJavaParser.parseBlock("{ return new GeoPosition(this.center.get(0).doubleValue(), this.center.get(1).doubleValue(), this.center.get(2).doubleValue()); }")));
            });
        });
    }

    // Customizes the RegionCopyrightsCountry class
    private void customizeRegionCopyrightsCountry(PackageCustomization models) {
        models.getClass("RegionCopyrightsCountry").customizeAst(ast -> ast.getClassByName("RegionCopyrightsCountry")
            .ifPresent(clazz -> clazz.getMethodsByName("getISO3").forEach(method -> method.setName("getIso3"))));
    }

    // Customizes the MapTileSize class
    private void customizeMapTileSize(PackageCustomization models) {
        models.getClass("MapTileSize").customizeAst(ast -> ast.getClassByName("MapTileSize").ifPresent(clazz -> {
            clazz.getFieldByName("SIZE256").ifPresent(field -> field.getVariable(0).setName("SIZE_256"));
            clazz.getFieldByName("SIZE512").ifPresent(field -> field.getVariable(0).setName("SIZE_512"));
        }));
    }
}
