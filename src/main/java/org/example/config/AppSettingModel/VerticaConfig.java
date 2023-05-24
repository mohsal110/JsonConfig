
package org.example.config.AppSettingModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerticaConfig {

    @JsonProperty("Address")
    private List<String> Address;
    @JsonProperty("DataBase")
    private String DataBase;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Password")
    private String Password;
    @JsonProperty("Table")
    private String Table;
    @JsonProperty("Timeout")
    private Long Timeout;
    @JsonProperty("UserName")
    private String UserName;

    @JsonIgnore
    public List<String> getAddress() {
        return Address;
    }

    @JsonIgnore
    public String getDataBase() {
        return DataBase;
    }

    @JsonIgnore
    public String getName() {
        return Name;
    }

    @JsonIgnore
    public String getPassword() {
        return Password;
    }

    @JsonIgnore
    public String getTable() {
        return Table;
    }

    @JsonIgnore
    public Long getTimeout() {
        return Timeout;
    }

    @JsonIgnore
    public String getUserName() {
        return UserName;
    }
}
