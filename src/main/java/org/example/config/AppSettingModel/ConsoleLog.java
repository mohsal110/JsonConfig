
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsoleLog {

    @JsonProperty("Active")
    private Boolean Active;

    @JsonIgnore
    public Boolean getActive() {
        return Active;
    }
}
