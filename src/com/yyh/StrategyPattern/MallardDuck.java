package com.yyh.StrategyPattern;

public class MallardDuck extends Duck {
    private FlyBehavior flyBehavior;
    @Override
    public void display(){
        System.out.println("MallardDuck.绿头");
    }
}
