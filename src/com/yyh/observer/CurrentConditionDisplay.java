package com.yyh.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    //方便观察者注册和删除
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        //注册当前布告板
        subject.registerObserver(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        //设置参数
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        //显示数据
        display();
    }
}
