package com.yyh.StrategyPattern;

public class RedheadDuck extends Duck {
    private FlyBehavior flyBehavior;
    @Override
    public void display(){
        System.out.println("RedheadDuck.红头");
    }
}
