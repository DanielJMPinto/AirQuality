package tqs.homework.air_quality.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data",
        "city_name",
        "lon",
        "timezone",
        "lat",
        "country_code",
        "state_code"
})
public class AQResponse {

    @JsonProperty("data")
    private java.util.List<Data> data = null;
    @JsonProperty("city_name")
    private String city_name;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("country_code")
    private String country_code;
    @JsonProperty("state_code")
    private String state_code;

    @JsonProperty("data")
    public List<Data> getData() {
        return data;
    }
    @JsonProperty("data")
    public void setData(List<Data> data) {
        this.data = data;
    }
    @JsonProperty("city_name")
    public String getCity_name() {
        return city_name;
    }
    @JsonProperty("city_name")
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }
    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }
    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }
    @JsonProperty("country_code")
    public String getCountry_code() {
        return country_code;
    }
    @JsonProperty("country_code")
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    @JsonProperty("state_code")
    public String getState_code() {
        return state_code;
    }
    @JsonProperty("state_code")
    public void setState_code(String state_code) {
        this.state_code = state_code;
    }
}