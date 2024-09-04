/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.vault.GcpVaultConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class GcpVaultConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.vault.GcpVaultConfiguration target = (org.apache.camel.vault.GcpVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": target.setKubernetesVaultConfiguration(property(camelContext, org.apache.camel.vault.KubernetesVaultConfiguration.class, value)); return true;
        case "projectid":
        case "projectId": target.setProjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshenabled":
        case "refreshEnabled": target.setRefreshEnabled(property(camelContext, boolean.class, value)); return true;
        case "refreshperiod":
        case "refreshPeriod": target.setRefreshPeriod(property(camelContext, long.class, value)); return true;
        case "secrets": target.setSecrets(property(camelContext, java.lang.String.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": target.setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": target.setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "usedefaultinstance":
        case "useDefaultInstance": target.setUseDefaultInstance(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return org.apache.camel.vault.KubernetesVaultConfiguration.class;
        case "projectid":
        case "projectId": return java.lang.String.class;
        case "refreshenabled":
        case "refreshEnabled": return boolean.class;
        case "refreshperiod":
        case "refreshPeriod": return long.class;
        case "secrets": return java.lang.String.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        case "subscriptionname":
        case "subscriptionName": return java.lang.String.class;
        case "usedefaultinstance":
        case "useDefaultInstance": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.vault.GcpVaultConfiguration target = (org.apache.camel.vault.GcpVaultConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return target.getKubernetesVaultConfiguration();
        case "projectid":
        case "projectId": return target.getProjectId();
        case "refreshenabled":
        case "refreshEnabled": return target.isRefreshEnabled();
        case "refreshperiod":
        case "refreshPeriod": return target.getRefreshPeriod();
        case "secrets": return target.getSecrets();
        case "serviceaccountkey":
        case "serviceAccountKey": return target.getServiceAccountKey();
        case "subscriptionname":
        case "subscriptionName": return target.getSubscriptionName();
        case "usedefaultinstance":
        case "useDefaultInstance": return target.isUseDefaultInstance();
        default: return null;
        }
    }
}

