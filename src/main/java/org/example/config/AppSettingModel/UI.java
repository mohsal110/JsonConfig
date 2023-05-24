
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UI {

    @JsonProperty("Active")
    private Boolean Active;
    @JsonProperty("ApiAddress")
    private String ApiAddress;
    @JsonProperty("DevMode")
    private Boolean DevMode;
    @JsonProperty("TileServer")
    private String TileServer;

    @JsonIgnore
    public Boolean getActive() {
        return Active;
    }

    @JsonIgnore
    public String getApiAddress() {
        return ApiAddress;
    }

    @JsonIgnore
    public Boolean getDevMode() {
        return DevMode;
    }

    @JsonIgnore
    public String getTileServer() {
        return TileServer;
    }
}
