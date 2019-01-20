package com.yyh.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    //存储所有的观察者，注意类型是observer，里面有方法update
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 初始化list，方便存储
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>0){
            observers.remove(observer);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer temp = observers.get(i);
            temp.update(temperature,humidity,pressure);
        }
    }

    /**
     * 通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 测试所用手动设置数据，并调用方法
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
