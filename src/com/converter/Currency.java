package com.converter;

public class Currency {
    String nameOfCurrency;
    String valueOfCurrency;

    public Currency(String nameOfCurrency, String valueOfCurrency) {
        this.nameOfCurrency = nameOfCurrency;
        this.valueOfCurrency = valueOfCurrency;
    }

    public Currency() {
    }

    public String getNameOfCurrency() {
        return nameOfCurrency;
    }

    public void setNameOfCurrency(String nameOfCurrency) {
        this.nameOfCurrency = nameOfCurrency;
    }

    public String getValueOfCurrency() {
        return valueOfCurrency;
    }

    public void setValueOfCurrency(String valueOfCurrency) {
        this.valueOfCurrency = valueOfCurrency;
    }
}
