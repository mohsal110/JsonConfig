
package org.example.config.AppSettingModel;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
    @JsonProperty("Info")
    private String Info;

    @JsonIgnore
    public String getInfo() {
        return Info;
    }
}
