
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.ipaccesscontrollist.IpAddress
 */
@UriParams
@Configurer
public final class SipIpAccessControlListIpAddressEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String friendlyName;

    @UriParam
    private String ipAddress;

    @UriParam
    private String pathAccountSid;

    @UriParam
    private String pathIpAccessControlListSid;

    @UriParam
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathIpAccessControlListSid() {
        return pathIpAccessControlListSid;
    }

    public void setPathIpAccessControlListSid(String pathIpAccessControlListSid) {
        this.pathIpAccessControlListSid = pathIpAccessControlListSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}