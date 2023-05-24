
package org.example.config.AppSettingModel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log {

    @JsonProperty("AgentName")
    private String agentName;
    @JsonProperty("ConsoleLog")
    private ConsoleLog consoleLog;
    @JsonProperty("ElasticLog")
    private ElasticLog elasticLog;
    @JsonProperty("FileLog")
    private FileLog fileLog;

    @JsonIgnore
    public String getAgentName() {
        return agentName;
    }

    @JsonIgnore
    public ConsoleLog getConsoleLog() {
        return consoleLog;
    }

    @JsonIgnore
    public ElasticLog getElasticLog() {
        return elasticLog;
    }

    @JsonIgnore
    public FileLog getFileLog() {
        return fileLog;
    }
}
