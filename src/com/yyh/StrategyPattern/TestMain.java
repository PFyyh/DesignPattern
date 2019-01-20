package com.yyh.StrategyPattern;

public class TestMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.setFlyBehavior(new FlyWithWings());
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        System.out.println("mallardDuck:");
        mallardDuck.getFlyBehavior().fly();
        System.out.println("redheadDuck:");
        redheadDuck.getFlyBehavior().fly();
        System.out.println("rubberDuck:");
        rubberDuck.getFlyBehavior().fly();
        System.out.println("==动态修改状态====:");
        //坐火箭上天
        redheadDuck.setFlyBehavior(new FlyWithRocket());
        System.out.println("redheadDuck:");
        redheadDuck.getFlyBehavior().fly();
    }
}
