package tqs.homework.air_quality.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mold_level",
        "aqi",
        "pm10",
        "co",
        "o3",
        "predominant_pollen_type",
        "so2",
        "pollen_level_tree",
        "pollen_level_weed",
        "no2",
        "pm25",
        "pollen_level_grass"
})
public class Data {
    @JsonProperty("mold_level")
    private int mold_level;
    @JsonProperty("aqi")
    private Double aqi;
    @JsonProperty("pm10")
    private Double pm10;
    @JsonProperty("co")
    private Double co;
    @JsonProperty("o3")
    private Double o3;
    @JsonProperty("predominant_pollen_type")
    private String predominant_pollen_type;
    @JsonProperty("so2")
    private Double so2;
    @JsonProperty("pollen_level_tree")
    private int pollen_level_tree;
    @JsonProperty("pollen_level_weed")
    private int pollen_level_weed;
    @JsonProperty("no2")
    private Double no2;
    @JsonProperty("pm25")
    private Double pm25;
    @JsonProperty("pollen_level_grass")
    private int pollen_level_grass;

    @JsonProperty("mold_level")
    public int getMold_level() {
        return mold_level;
    }
    @JsonProperty("mold_level")
    public void setMold_level(int mold_level) {
        this.mold_level = mold_level;
    }
    @JsonProperty("aqi")
    public Double getAqi() {
        return aqi;
    }
    @JsonProperty("aqi")
    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }
    @JsonProperty("pm10")
    public Double getPm10() {
        return pm10;
    }
    @JsonProperty("pm10")
    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }
    @JsonProperty("co")
    public Double getCo() {
        return co;
    }
    @JsonProperty("co")
    public void setCo(Double co) {
        this.co = co;
    }
    @JsonProperty("o3")
    public Double getO3() {
        return o3;
    }
    @JsonProperty("o3")
    public void setO3(Double o3) {
        this.o3 = o3;
    }
    @JsonProperty("predominant_pollen_type")
    public String getPredominant_pollen_type() {
        return predominant_pollen_type;
    }
    @JsonProperty("predominant_pollen_type")
    public void setPredominant_pollen_type(String predominant_pollen_type) {
        this.predominant_pollen_type = predominant_pollen_type;
    }
    @JsonProperty("so2")
    public Double getSo2() {
        return so2;
    }
    @JsonProperty("so2")
    public void setSo2(Double so2) {
        this.so2 = so2;
    }
    @JsonProperty("pollen_level_tree")
    public int getPollen_level_tree() {
        return pollen_level_tree;
    }
    @JsonProperty("pollen_level_tree")
    public void setPollen_level_tree(int pollen_level_tree) {
        this.pollen_level_tree = pollen_level_tree;
    }
    @JsonProperty("pollen_level_weed")
    public int getPollen_level_weed() {
        return pollen_level_weed;
    }
    @JsonProperty("pollen_level_weed")
    public void setPollen_level_weed(int pollen_level_weed) {
        this.pollen_level_weed = pollen_level_weed;
    }
    @JsonProperty("no2")
    public Double getNo2() {
        return no2;
    }
    @JsonProperty("no2")
    public void setNo2(Double no2) {
        this.no2 = no2;
    }
    @JsonProperty("pm25")
    public Double getPm25() {
        return pm25;
    }
    @JsonProperty("pm25")
    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }
    @JsonProperty("pollen_level_grass")
    public int getPollen_level_grass() {
        return pollen_level_grass;
    }
    @JsonProperty("pollen_level_grass")
    public void setPollen_level_grass(int pollen_level_grass) {
        this.pollen_level_grass = pollen_level_grass;
    }
}
