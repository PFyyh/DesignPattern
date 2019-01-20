package com.yyh.observer;

public class TestMain {
    public static void main(String[] args) {
        //创建WeatherData类，主题
        WeatherData weatherData = new WeatherData();
        //创建布告栏
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //修改数据
        weatherData.setMeasurements(80,10,80);

        //修改数据
        weatherData.setMeasurements(70,10,80);

        //修改数据
        weatherData.setMeasurements(70,10,80);
    }
}
