package com.yyh.StrategyPattern;

/**
 * 抽象父类
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    public void swimming(){
        System.out.println("duck.swimming");
    }

    public void quack(){
        System.out.println("duck.quack");
    }

    public abstract void display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
