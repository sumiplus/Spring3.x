package com.baobaotao.circleinject;

public class CircleB {

    private CircleC circleC;

    public CircleB() {
    }

    public CircleB(CircleC circleC) {
        this.circleC = circleC;
    }


    public void setCircleC(CircleC circleC) {
        this.circleC = circleC;
    }
}
