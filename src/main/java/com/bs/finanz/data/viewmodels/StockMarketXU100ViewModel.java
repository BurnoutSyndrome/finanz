package com.bs.finanz.data.viewmodels;

import lombok.Data;

@Data
public class StockMarketXU100ViewModel {
    public String ticker;
    public String name;
    public String fullName;
    public double latest;
    public double firstSeanceLowest;
    public int secondSeanceLowest;
    public int firstSeanceHighest;
    public int secondSeanceHighest;
    public double firstSeanceClosing;
    public int secondSeanceClosing;
    public double previousClosing;
    public double changeRate;
    public int updateDate;
}
