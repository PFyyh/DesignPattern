package com.yyh.observer;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 更新观察者
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature,float humidity,float pressure);
}
