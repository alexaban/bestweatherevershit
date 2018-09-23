package com.forecast;

public class WeatherData {
    private String temperature;
    private String symbol;

    private String temperatureTomorrow;
    private String symbolTomorrow;

    public WeatherData(String temperature, String symbol, String temperatureTomorrow, String symbolTomorrow) {
        this.temperature = temperature;
        this.symbol = symbol;
        this.temperatureTomorrow = temperatureTomorrow;
        this.symbolTomorrow = symbolTomorrow;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTemperatureTomorrow() {
        return temperatureTomorrow;
    }

    public String getSymbolTomorrow() {
        return symbolTomorrow;
    }
}