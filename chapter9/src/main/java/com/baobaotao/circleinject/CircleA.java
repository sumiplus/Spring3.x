package com.baobaotao.circleinject;

public class CircleA {

    private CircleB circleB;

    public CircleA() {
    }

    public CircleA(CircleB circleB) {
        this.circleB = circleB;
    }


    public void setCircleB(CircleB circleB) {
        this.circleB = circleB;
    }
}
