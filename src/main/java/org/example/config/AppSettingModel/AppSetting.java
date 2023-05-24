
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AppSetting {

    @JsonProperty("Kestrel")
    private Kestrel Kestrel;
    private String allowedHosts;
    @JsonProperty("Config")
    private Config Config;
    private Info info;

    @JsonIgnore
    public org.example.config.AppSettingModel.Kestrel getKestrel() {
        return Kestrel;
    }

    @JsonIgnore
    public String getAllowedHosts() {
        return allowedHosts;
    }

    @JsonIgnore
    public org.example.config.AppSettingModel.Config getConfig() {
        return Config;
    }

    @JsonIgnore
    public Info getInfo() {
        return info;
    }
}
