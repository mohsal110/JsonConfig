
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Kestrel {

    @JsonProperty("Endpoints")
    private Endpoints Endpoints;

    @JsonIgnore
    public org.example.config.AppSettingModel.Endpoints getEndpoints() {
        return Endpoints;
    }
}
