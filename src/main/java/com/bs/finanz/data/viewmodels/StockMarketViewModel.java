package com.bs.finanz.data.viewmodels;

import lombok.Data;

@Data
public class StockMarketViewModel {
    private String ticker;
    private double firstSeanceLowest;
    private double firstSeanceHighest;
    private double firstSeanceClosing;
    private double changeRate;
    private int updateDate;
    private String fullName;
    private int secondSeanceLowest;
    private String name;
    private int secondSeanceHighest;
    private double previousClosing;
    private double latest;
    private int secondSeanceClosing;

    @Override
    public String toString() {
        return
                "StockMarketViewModel{" +
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
