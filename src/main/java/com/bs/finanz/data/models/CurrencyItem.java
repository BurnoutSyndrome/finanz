package com.bs.finanz.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Data
@Generated("com.robohorse.robopojogenerator")
public class CurrencyItem {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("code")
    private String code;

    @JsonProperty("buying")
    private double buying;

    @JsonProperty("name")
    private String name;

    @JsonProperty("selling")
    private double selling;

    @JsonProperty("currency")
    private int currency;

    @JsonProperty("update_date")
    private int updateDate;

    @JsonProperty("change_rate")
    private double changeRate;

    @Override
    public String toString() {
        return
                "CurrencyItem{" +
                        "full_name = '" + fullName + '\'' +
                        ",code = '" + code + '\'' +
                        ",buying = '" + buying + '\'' +
                        ",name = '" + name + '\'' +
                        ",selling = '" + selling + '\'' +
                        ",currency = '" + currency + '\'' +
                        ",update_date = '" + updateDate + '\'' +
                        ",change_rate = '" + changeRate + '\'' +
                        "}";
    }
}