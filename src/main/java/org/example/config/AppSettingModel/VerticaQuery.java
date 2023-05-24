
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerticaQuery {

    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Query")
    private String Query;

    @JsonIgnore
    public String getName() {
        return Name;
    }

    @JsonIgnore
    public String getQuery() {
        return Query;
    }
}
