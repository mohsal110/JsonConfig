
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Endpoints {

    @JsonProperty("Http")
    private Http Http;

    @JsonIgnore
    public org.example.config.AppSettingModel.Http getHttp() {
        return Http;
    }
}
