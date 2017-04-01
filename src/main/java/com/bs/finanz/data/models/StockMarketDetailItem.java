package com.bs.finanz.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Data
@Generated("com.robohorse.robopojogenerator")
public class StockMarketDetailItem {

    @JsonProperty("ticker")
    private String ticker;

    @JsonProperty("capital")
    private long capital;

    @JsonProperty("best_buying_offer")
    private double bestBuyingOffer;

    @JsonProperty("ceil")
    private double ceil;

    @JsonProperty("volume_try")
    private int volumeTry;

    @JsonProperty("supply")
    private double supply;

    @JsonProperty("lowest")
    private double lowest;

    @JsonProperty("change_rate")
    private double changeRate;

    @JsonProperty("update_date")
    private int updateDate;

    @JsonProperty("market")
    private String market;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("previous_first_seance_closing")
    private double previousFirstSeanceClosing;

    @JsonProperty("highest")
    private double highest;

    @JsonProperty("best_selling_offer")
    private double bestSellingOffer;

    @JsonProperty("volume_lot")
    private int volumeLot;

    @JsonProperty("name")
    private String name;

    @JsonProperty("difference")
    private double difference;

    @JsonProperty("capital_stock")
    private long capitalStock;

    @JsonProperty("net")
    private double net;

    @JsonProperty("floor")
    private double floor;

    @JsonProperty("profit")
    private long profit;

    @JsonProperty("previous_second_seance_closing")
    private double previousSecondSeanceClosing;

    @JsonProperty("latest")
    private double latest;

    @Override
    public String toString() {
        return
                "StockMarketDetailItem{" +
                        "ticker = '" + ticker + '\'' +
                        ",capital = '" + capital + '\'' +
                        ",best_buying_offer = '" + bestBuyingOffer + '\'' +
                        ",ceil = '" + ceil + '\'' +
                        ",volume_try = '" + volumeTry + '\'' +
                        ",supply = '" + supply + '\'' +
                        ",lowest = '" + lowest + '\'' +
                        ",change_rate = '" + changeRate + '\'' +
                        ",update_date = '" + updateDate + '\'' +
                        ",market = '" + market + '\'' +
                        ",full_name = '" + fullName + '\'' +
                        ",previous_first_seance_closing = '" + previousFirstSeanceClosing + '\'' +
                        ",highest = '" + highest + '\'' +
                        ",best_selling_offer = '" + bestSellingOffer + '\'' +
                        ",volume_lot = '" + volumeLot + '\'' +
                        ",name = '" + name + '\'' +
                        ",difference = '" + difference + '\'' +
                        ",capital_stock = '" + capitalStock + '\'' +
                        ",net = '" + net + '\'' +
                        ",floor = '" + floor + '\'' +
                        ",profit = '" + profit + '\'' +
                        ",previous_second_seance_closing = '" + previousSecondSeanceClosing + '\'' +
                        ",latest = '" + latest + '\'' +
                        "}";
    }
}