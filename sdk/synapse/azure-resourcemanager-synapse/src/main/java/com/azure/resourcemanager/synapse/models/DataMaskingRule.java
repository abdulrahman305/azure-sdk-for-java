// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.DataMaskingRuleInner;

/**
 * An immutable client-side representation of DataMaskingRule.
 */
public interface DataMaskingRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The location of the data masking rule.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the kind property: The kind of Data Masking Rule. Metadata, used for Azure portal.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the idPropertiesId property: The rule Id.
     * 
     * @return the idPropertiesId value.
     */
    String idPropertiesId();

    /**
     * Gets the aliasName property: The alias name. This is a legacy parameter and is no longer used.
     * 
     * @return the aliasName value.
     */
    String aliasName();

    /**
     * Gets the ruleState property: The rule state. Used to delete a rule. To delete an existing rule, specify the
     * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule
     * doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value
     * of ruleState.
     * 
     * @return the ruleState value.
     */
    DataMaskingRuleState ruleState();

    /**
     * Gets the schemaName property: The schema name on which the data masking rule is applied.
     * 
     * @return the schemaName value.
     */
    String schemaName();

    /**
     * Gets the tableName property: The table name on which the data masking rule is applied.
     * 
     * @return the tableName value.
     */
    String tableName();

    /**
     * Gets the columnName property: The column name on which the data masking rule is applied.
     * 
     * @return the columnName value.
     */
    String columnName();

    /**
     * Gets the maskingFunction property: The masking function that is used for the data masking rule.
     * 
     * @return the maskingFunction value.
     */
    DataMaskingFunction maskingFunction();

    /**
     * Gets the numberFrom property: The numberFrom property of the masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @return the numberFrom value.
     */
    String numberFrom();

    /**
     * Gets the numberTo property: The numberTo property of the data masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @return the numberTo value.
     */
    String numberTo();

    /**
     * Gets the prefixSize property: If maskingFunction is set to Text, the number of characters to show unmasked in the
     * beginning of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the prefixSize value.
     */
    String prefixSize();

    /**
     * Gets the suffixSize property: If maskingFunction is set to Text, the number of characters to show unmasked at the
     * end of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the suffixSize value.
     */
    String suffixSize();

    /**
     * Gets the replacementString property: If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the replacementString value.
     */
    String replacementString();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.DataMaskingRuleInner object.
     * 
     * @return the inner object.
     */
    DataMaskingRuleInner innerModel();

    /**
     * The entirety of the DataMaskingRule definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The DataMaskingRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the DataMaskingRule definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, sqlPoolName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param sqlPoolName SQL pool name.
             * @return the next definition stage.
             */
            WithCreate withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName);
        }

        /**
         * The stage of the DataMaskingRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithAliasName, DefinitionStages.WithRuleState,
            DefinitionStages.WithSchemaName, DefinitionStages.WithTableName, DefinitionStages.WithColumnName,
            DefinitionStages.WithMaskingFunction, DefinitionStages.WithNumberFrom, DefinitionStages.WithNumberTo,
            DefinitionStages.WithPrefixSize, DefinitionStages.WithSuffixSize, DefinitionStages.WithReplacementString {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            DataMaskingRule create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataMaskingRule create(Context context);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify aliasName.
         */
        interface WithAliasName {
            /**
             * Specifies the aliasName property: The alias name. This is a legacy parameter and is no longer used..
             * 
             * @param aliasName The alias name. This is a legacy parameter and is no longer used.
             * @return the next definition stage.
             */
            WithCreate withAliasName(String aliasName);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify ruleState.
         */
        interface WithRuleState {
            /**
             * Specifies the ruleState property: The rule state. Used to delete a rule. To delete an existing rule,
             * specify the schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled.
             * However, if the rule doesn't already exist, the rule will be created with ruleState set to enabled,
             * regardless of the provided value of ruleState..
             * 
             * @param ruleState The rule state. Used to delete a rule. To delete an existing rule, specify the
             * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the
             * rule doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the
             * provided value of ruleState.
             * @return the next definition stage.
             */
            WithCreate withRuleState(DataMaskingRuleState ruleState);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify schemaName.
         */
        interface WithSchemaName {
            /**
             * Specifies the schemaName property: The schema name on which the data masking rule is applied..
             * 
             * @param schemaName The schema name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            WithCreate withSchemaName(String schemaName);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify tableName.
         */
        interface WithTableName {
            /**
             * Specifies the tableName property: The table name on which the data masking rule is applied..
             * 
             * @param tableName The table name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            WithCreate withTableName(String tableName);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify columnName.
         */
        interface WithColumnName {
            /**
             * Specifies the columnName property: The column name on which the data masking rule is applied..
             * 
             * @param columnName The column name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            WithCreate withColumnName(String columnName);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify maskingFunction.
         */
        interface WithMaskingFunction {
            /**
             * Specifies the maskingFunction property: The masking function that is used for the data masking rule..
             * 
             * @param maskingFunction The masking function that is used for the data masking rule.
             * @return the next definition stage.
             */
            WithCreate withMaskingFunction(DataMaskingFunction maskingFunction);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify numberFrom.
         */
        interface WithNumberFrom {
            /**
             * Specifies the numberFrom property: The numberFrom property of the masking rule. Required if
             * maskingFunction is set to Number, otherwise this parameter will be ignored..
             * 
             * @param numberFrom The numberFrom property of the masking rule. Required if maskingFunction is set to
             * Number, otherwise this parameter will be ignored.
             * @return the next definition stage.
             */
            WithCreate withNumberFrom(String numberFrom);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify numberTo.
         */
        interface WithNumberTo {
            /**
             * Specifies the numberTo property: The numberTo property of the data masking rule. Required if
             * maskingFunction is set to Number, otherwise this parameter will be ignored..
             * 
             * @param numberTo The numberTo property of the data masking rule. Required if maskingFunction is set to
             * Number, otherwise this parameter will be ignored.
             * @return the next definition stage.
             */
            WithCreate withNumberTo(String numberTo);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify prefixSize.
         */
        interface WithPrefixSize {
            /**
             * Specifies the prefixSize property: If maskingFunction is set to Text, the number of characters to show
             * unmasked in the beginning of the string. Otherwise, this parameter will be ignored..
             * 
             * @param prefixSize If maskingFunction is set to Text, the number of characters to show unmasked in the
             * beginning of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            WithCreate withPrefixSize(String prefixSize);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify suffixSize.
         */
        interface WithSuffixSize {
            /**
             * Specifies the suffixSize property: If maskingFunction is set to Text, the number of characters to show
             * unmasked at the end of the string. Otherwise, this parameter will be ignored..
             * 
             * @param suffixSize If maskingFunction is set to Text, the number of characters to show unmasked at the end
             * of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            WithCreate withSuffixSize(String suffixSize);
        }

        /**
         * The stage of the DataMaskingRule definition allowing to specify replacementString.
         */
        interface WithReplacementString {
            /**
             * Specifies the replacementString property: If maskingFunction is set to Text, the character to use for
             * masking the unexposed part of the string. Otherwise, this parameter will be ignored..
             * 
             * @param replacementString If maskingFunction is set to Text, the character to use for masking the
             * unexposed part of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            WithCreate withReplacementString(String replacementString);
        }
    }

    /**
     * Begins update for the DataMaskingRule resource.
     * 
     * @return the stage of resource update.
     */
    DataMaskingRule.Update update();

    /**
     * The template for DataMaskingRule update.
     */
    interface Update extends UpdateStages.WithAliasName, UpdateStages.WithRuleState, UpdateStages.WithSchemaName,
        UpdateStages.WithTableName, UpdateStages.WithColumnName, UpdateStages.WithMaskingFunction,
        UpdateStages.WithNumberFrom, UpdateStages.WithNumberTo, UpdateStages.WithPrefixSize,
        UpdateStages.WithSuffixSize, UpdateStages.WithReplacementString {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        DataMaskingRule apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataMaskingRule apply(Context context);
    }

    /**
     * The DataMaskingRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the DataMaskingRule update allowing to specify aliasName.
         */
        interface WithAliasName {
            /**
             * Specifies the aliasName property: The alias name. This is a legacy parameter and is no longer used..
             * 
             * @param aliasName The alias name. This is a legacy parameter and is no longer used.
             * @return the next definition stage.
             */
            Update withAliasName(String aliasName);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify ruleState.
         */
        interface WithRuleState {
            /**
             * Specifies the ruleState property: The rule state. Used to delete a rule. To delete an existing rule,
             * specify the schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled.
             * However, if the rule doesn't already exist, the rule will be created with ruleState set to enabled,
             * regardless of the provided value of ruleState..
             * 
             * @param ruleState The rule state. Used to delete a rule. To delete an existing rule, specify the
             * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the
             * rule doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the
             * provided value of ruleState.
             * @return the next definition stage.
             */
            Update withRuleState(DataMaskingRuleState ruleState);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify schemaName.
         */
        interface WithSchemaName {
            /**
             * Specifies the schemaName property: The schema name on which the data masking rule is applied..
             * 
             * @param schemaName The schema name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            Update withSchemaName(String schemaName);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify tableName.
         */
        interface WithTableName {
            /**
             * Specifies the tableName property: The table name on which the data masking rule is applied..
             * 
             * @param tableName The table name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            Update withTableName(String tableName);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify columnName.
         */
        interface WithColumnName {
            /**
             * Specifies the columnName property: The column name on which the data masking rule is applied..
             * 
             * @param columnName The column name on which the data masking rule is applied.
             * @return the next definition stage.
             */
            Update withColumnName(String columnName);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify maskingFunction.
         */
        interface WithMaskingFunction {
            /**
             * Specifies the maskingFunction property: The masking function that is used for the data masking rule..
             * 
             * @param maskingFunction The masking function that is used for the data masking rule.
             * @return the next definition stage.
             */
            Update withMaskingFunction(DataMaskingFunction maskingFunction);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify numberFrom.
         */
        interface WithNumberFrom {
            /**
             * Specifies the numberFrom property: The numberFrom property of the masking rule. Required if
             * maskingFunction is set to Number, otherwise this parameter will be ignored..
             * 
             * @param numberFrom The numberFrom property of the masking rule. Required if maskingFunction is set to
             * Number, otherwise this parameter will be ignored.
             * @return the next definition stage.
             */
            Update withNumberFrom(String numberFrom);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify numberTo.
         */
        interface WithNumberTo {
            /**
             * Specifies the numberTo property: The numberTo property of the data masking rule. Required if
             * maskingFunction is set to Number, otherwise this parameter will be ignored..
             * 
             * @param numberTo The numberTo property of the data masking rule. Required if maskingFunction is set to
             * Number, otherwise this parameter will be ignored.
             * @return the next definition stage.
             */
            Update withNumberTo(String numberTo);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify prefixSize.
         */
        interface WithPrefixSize {
            /**
             * Specifies the prefixSize property: If maskingFunction is set to Text, the number of characters to show
             * unmasked in the beginning of the string. Otherwise, this parameter will be ignored..
             * 
             * @param prefixSize If maskingFunction is set to Text, the number of characters to show unmasked in the
             * beginning of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            Update withPrefixSize(String prefixSize);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify suffixSize.
         */
        interface WithSuffixSize {
            /**
             * Specifies the suffixSize property: If maskingFunction is set to Text, the number of characters to show
             * unmasked at the end of the string. Otherwise, this parameter will be ignored..
             * 
             * @param suffixSize If maskingFunction is set to Text, the number of characters to show unmasked at the end
             * of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            Update withSuffixSize(String suffixSize);
        }

        /**
         * The stage of the DataMaskingRule update allowing to specify replacementString.
         */
        interface WithReplacementString {
            /**
             * Specifies the replacementString property: If maskingFunction is set to Text, the character to use for
             * masking the unexposed part of the string. Otherwise, this parameter will be ignored..
             * 
             * @param replacementString If maskingFunction is set to Text, the character to use for masking the
             * unexposed part of the string. Otherwise, this parameter will be ignored.
             * @return the next definition stage.
             */
            Update withReplacementString(String replacementString);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    DataMaskingRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataMaskingRule refresh(Context context);
}
