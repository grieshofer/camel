
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.Call
 */
@UriParams
@Configurer
public final class CallEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "ApplicationSid that configures from where to fetch TwiML")
    private String applicationSid;
    @UriParam(description = "Twilio number from which to originate the call")
    private com.twilio.type.PhoneNumber from;
    @UriParam(description = "The account_sid")
    private String pathAccountSid;
    @UriParam(description = "Call Sid that uniquely identifies the Call to delete")
    private String pathSid;
    @UriParam(description = "Phone number, SIP address or client identifier to call")
    private com.twilio.type.Endpoint to;
    @UriParam(description = "Url from which to fetch TwiML")
    private java.net.URI url;

    public String getApplicationSid() {
        return applicationSid;
    }

    public void setApplicationSid(String applicationSid) {
        this.applicationSid = applicationSid;
    }

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.type.Endpoint getTo() {
        return to;
    }

    public void setTo(com.twilio.type.Endpoint to) {
        this.to = to;
    }

    public java.net.URI getUrl() {
        return url;
    }

    public void setUrl(java.net.URI url) {
        this.url = url;
    }
}
