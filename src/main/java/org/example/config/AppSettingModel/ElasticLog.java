
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElasticLog {

    @JsonProperty("Active")
    private Boolean Active;
    @JsonProperty("BufferBaseFilename")
    private String BufferBaseFilename;
    @JsonProperty("BufferFileCountLimit")
    private Long BufferFileCountLimit;
    @JsonProperty("BufferLogShippingInterval")
    private Long BufferLogShippingInterval;
    @JsonProperty("IndexFormat")
    private String IndexFormat;
    @JsonProperty("Uri")
    private String Uri;

    @JsonIgnore
    public Boolean getActive() {
        return Active;
    }

    @JsonIgnore
    public String getBufferBaseFilename() {
        return BufferBaseFilename;
    }

    @JsonIgnore
    public Long getBufferFileCountLimit() {
        return BufferFileCountLimit;
    }

    @JsonIgnore
    public Long getBufferLogShippingInterval() {
        return BufferLogShippingInterval;
    }

    @JsonIgnore
    public String getIndexFormat() {
        return IndexFormat;
    }

    @JsonIgnore
    public String getUri() {
        return Uri;
    }
}
