package com.bs.finanz.data.viewmodels;

import lombok.Data;

@Data
public class StockMarketDetailViewModel {
    public String ticker;
    public String name;
    public String fullName;
    public String market;
    public double supply;
    public long capital;
    public long capitalStock;
    public long profit;
    public double net;
    public double previousFirstSeanceClosing;
    public double previousSecondSeanceClosing;
    public double bestBuyingOffer;
    public double bestSellingOffer;
    public double difference;
    public double latest;
    public double changeRate;
    public double lowest;
    public double highest;
    public double floor;
    public double ceil;
    public int volumeLot;
    public double volumeTry;
    public int updateDate;
}
