
package org.example.config.AppSettingModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {

    @JsonProperty("ConnectionStrings")
    private ConnectionStrings ConnectionStrings;
    @JsonProperty("GoogleMapBase")
    private String GoogleMapBase;
    @JsonProperty("log")
    private Log Log;
    @JsonProperty("MaxIntervalDay")
    private Long MaxIntervalDay;
    @JsonProperty("OnlineCDRTrack")
    private OnlineCDRTrack OnlineCDRTrack;
    @JsonProperty("TimeDelay")
    private Long TimeDelay;
    @JsonProperty("UI")
    private UI UI;
    @JsonProperty("VerticaConfig")
    private List<VerticaConfig> VerticaConfig;
    @JsonProperty("VerticaQuery")
    private List<VerticaQuery> VerticaQuery;


    @JsonIgnore
    public org.example.config.AppSettingModel.ConnectionStrings getConnectionStrings() {
        return ConnectionStrings;
    }

    @JsonIgnore
    public String getGoogleMapBase() {
        return GoogleMapBase;
    }

    @JsonIgnore
    public org.example.config.AppSettingModel.Log getLog() {
        return Log;
    }

    @JsonIgnore
    public Long getMaxIntervalDay() {
        return MaxIntervalDay;
    }

    @JsonIgnore
    public org.example.config.AppSettingModel.OnlineCDRTrack getOnlineCDRTrack() {
        return OnlineCDRTrack;
    }

    @JsonIgnore
    public Long getTimeDelay() {
        return TimeDelay;
    }

    @JsonIgnore
    public org.example.config.AppSettingModel.UI getUI() {
        return UI;
    }

    @JsonIgnore
    public List<org.example.config.AppSettingModel.VerticaConfig> getVerticaConfig() {
        return VerticaConfig;
    }

    @JsonIgnore
    public List<org.example.config.AppSettingModel.VerticaQuery> getVerticaQuery() {
        return VerticaQuery;
    }
}
