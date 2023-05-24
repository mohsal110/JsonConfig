
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnlineCDRTrack {

    @JsonProperty("Active")
    private Boolean Active;
    @JsonProperty("Address")
    private String Address;
    @JsonProperty("Port")
    private Long Port;
    @JsonProperty("Timeoute")
    private Long Timeoute;


    @JsonIgnore
    public Boolean getActive() {
        return Active;
    }

    @JsonIgnore
    public String getAddress() {
        return Address;
    }

    @JsonIgnore
    public Long getPort() {
        return Port;
    }

    @JsonIgnore
    public Long getTimeoute() {
        return Timeoute;
    }
}
