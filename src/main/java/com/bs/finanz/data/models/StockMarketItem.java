package com.bs.finanz.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Data
@Generated("com.robohorse.robopojogenerator")
public class StockMarketItem {

    @JsonProperty("ticker")
    private String ticker;

    @JsonProperty("first_seance_lowest")
    private double firstSeanceLowest;

    @JsonProperty("first_seance_highest")
    private double firstSeanceHighest;

    @JsonProperty("first_seance_closing")
    private double firstSeanceClosing;

    @JsonProperty("change_rate")
    private double changeRate;

    @JsonProperty("update_date")
    private int updateDate;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("second_seance_lowest")
    private int secondSeanceLowest;

    @JsonProperty("name")
    private String name;

    @JsonProperty("second_seance_highest")
    private int secondSeanceHighest;

    @JsonProperty("previous_closing")
    private double previousClosing;

    @JsonProperty("latest")
    private double latest;

    @JsonProperty("second_seance_closing")
    private int secondSeanceClosing;

    @Override
    public String toString() {
        return
                "StockMarketItem{" +
                        "ticker = '" + ticker + '\'' +
                        ",first_seance_lowest = '" + firstSeanceLowest + '\'' +
                        ",first_seance_highest = '" + firstSeanceHighest + '\'' +
                        ",first_seance_closing = '" + firstSeanceClosing + '\'' +
                        ",change_rate = '" + changeRate + '\'' +
                        ",update_date = '" + updateDate + '\'' +
                        ",full_name = '" + fullName + '\'' +
                        ",second_seance_lowest = '" + secondSeanceLowest + '\'' +
                        ",name = '" + name + '\'' +
                        ",second_seance_highest = '" + secondSeanceHighest + '\'' +
                        ",previous_closing = '" + previousClosing + '\'' +
                        ",latest = '" + latest + '\'' +
                        ",second_seance_closing = '" + secondSeanceClosing + '\'' +
                        "}";
    }
}