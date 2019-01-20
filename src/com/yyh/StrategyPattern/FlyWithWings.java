package com.yyh.StrategyPattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("通过翅膀飞行");
    }
}
