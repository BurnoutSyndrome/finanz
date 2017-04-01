package com.bs.finanz.data.viewmodels;

import lombok.Data;

@Data
public class CurrencyViewModel {
    public double selling;
    public int updateDate;
    public int currency;
    public double buying;
    public double changeRate;
    public String name;
    public String fullName;
    public String code;
}
