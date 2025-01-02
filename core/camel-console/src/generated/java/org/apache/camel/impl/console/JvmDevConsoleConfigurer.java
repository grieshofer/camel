/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl.console;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.impl.console.JvmDevConsole;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class JvmDevConsoleConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("CamelContext", org.apache.camel.CamelContext.class);
        map.put("ShowClasspath", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.impl.console.JvmDevConsole target = (org.apache.camel.impl.console.JvmDevConsole) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": target.setCamelContext(property(camelContext, org.apache.camel.CamelContext.class, value)); return true;
        case "showclasspath":
        case "showClasspath": target.setShowClasspath(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": return org.apache.camel.CamelContext.class;
        case "showclasspath":
        case "showClasspath": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.impl.console.JvmDevConsole target = (org.apache.camel.impl.console.JvmDevConsole) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "camelContext": return target.getCamelContext();
        case "showclasspath":
        case "showClasspath": return target.isShowClasspath();
        default: return null;
        }
    }
}

