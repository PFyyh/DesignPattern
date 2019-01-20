package com.yyh.StrategyPattern;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("坐火箭，惊了~~");
    }
}
