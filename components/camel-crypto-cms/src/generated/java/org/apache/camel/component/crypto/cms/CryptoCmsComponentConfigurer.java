/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.crypto.cms;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CryptoCmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CryptoCmsComponent target = (CryptoCmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "envelopeddatadecryptorconfiguration":
        case "envelopedDataDecryptorConfiguration": target.setEnvelopedDataDecryptorConfiguration(property(camelContext, org.apache.camel.component.crypto.cms.crypt.EnvelopedDataDecryptorConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "signeddataverifierconfiguration":
        case "signedDataVerifierConfiguration": target.setSignedDataVerifierConfiguration(property(camelContext, org.apache.camel.component.crypto.cms.sig.SignedDataVerifierConfiguration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "envelopeddatadecryptorconfiguration":
        case "envelopedDataDecryptorConfiguration": return org.apache.camel.component.crypto.cms.crypt.EnvelopedDataDecryptorConfiguration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "signeddataverifierconfiguration":
        case "signedDataVerifierConfiguration": return org.apache.camel.component.crypto.cms.sig.SignedDataVerifierConfiguration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CryptoCmsComponent target = (CryptoCmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "envelopeddatadecryptorconfiguration":
        case "envelopedDataDecryptorConfiguration": return target.getEnvelopedDataDecryptorConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "signeddataverifierconfiguration":
        case "signedDataVerifierConfiguration": return target.getSignedDataVerifierConfiguration();
        default: return null;
        }
    }
}

