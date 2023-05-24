
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectionStrings {

    @JsonProperty("QCS_DB")
    private String QCS_DB;

    @JsonIgnore
    public String getQCS_DB() {
        return QCS_DB;
    }
}
