
package org.example.config.AppSettingModel;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FileLog {

    @JsonProperty("Active")
    private Boolean Active;
    @JsonProperty("Address")
    private String Address;
    @JsonProperty("LogTemplate")
    private String LogTemplate;

    @JsonIgnore
    public Boolean getActive() {
        return Active;
    }

    @JsonIgnore
    public String getAddress() {
        return Address;
    }

    @JsonIgnore
    public String getLogTemplate() {
        return LogTemplate;
    }
}
