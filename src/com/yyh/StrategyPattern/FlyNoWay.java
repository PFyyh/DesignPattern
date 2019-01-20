package com.yyh.StrategyPattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("原地蹦跶了一下");
    }
}
