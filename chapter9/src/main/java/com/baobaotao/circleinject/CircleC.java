package com.baobaotao.circleinject;

public class CircleC {

    private CircleA circleA;

    public CircleC() {
    }

    public CircleC(CircleA circleA) {
        this.circleA = circleA;
    }

    public void setCircleA(CircleA circleA) {
        this.circleA = circleA;
    }
}
