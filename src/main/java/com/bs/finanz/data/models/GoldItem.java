package com.bs.finanz.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Data
@Generated("com.robohorse.robopojogenerator")
public class GoldItem {

    @JsonProperty("gold")
    private String gold;

    @JsonProperty("source_full_name")
    private String sourceFullName;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("buying")
    private int buying;

    @JsonProperty("name")
    private String name;

    @JsonProperty("selling")
    private int selling;

    @JsonProperty("short_name")
    private String shortName;

    @JsonProperty("source")
    private String source;

    @JsonProperty("update_date")
    private int updateDate;

    @JsonProperty("change_rate")
    private double changeRate;

    @JsonProperty("source_name")
    private String sourceName;

    @Override
    public String toString() {
        return
                "GoldItem{" +
                        "gold = '" + gold + '\'' +
                        ",source_full_name = '" + sourceFullName + '\'' +
                        ",full_name = '" + fullName + '\'' +
                        ",buying = '" + buying + '\'' +
                        ",name = '" + name + '\'' +
                        ",selling = '" + selling + '\'' +
                        ",short_name = '" + shortName + '\'' +
                        ",source = '" + source + '\'' +
                        ",update_date = '" + updateDate + '\'' +
                        ",change_rate = '" + changeRate + '\'' +
                        ",source_name = '" + sourceName + '\'' +
                        "}";
    }
}