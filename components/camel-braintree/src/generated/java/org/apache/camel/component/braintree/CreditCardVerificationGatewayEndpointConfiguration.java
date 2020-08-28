
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.CreditCardVerificationGateway
 */
@UriParams
@Configurer
public final class CreditCardVerificationGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    private String id;
    @UriParam
    private com.braintreegateway.CreditCardVerificationSearchRequest query;
    @UriParam
    private com.braintreegateway.CreditCardVerificationRequest request;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.CreditCardVerificationSearchRequest getQuery() {
        return query;
    }

    public void setQuery(com.braintreegateway.CreditCardVerificationSearchRequest query) {
        this.query = query;
    }

    public com.braintreegateway.CreditCardVerificationRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.CreditCardVerificationRequest request) {
        this.request = request;
    }
}
