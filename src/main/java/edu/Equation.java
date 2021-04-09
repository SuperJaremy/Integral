package edu;

import java.util.function.UnaryOperator;

public enum Equation {
    FIRST("5x^3-2x^2+7x-14",
            x->5*Math.pow(x,3)-2*Math.pow(x,2)+7*x-14);

    private String name;
    private UnaryOperator<Double> function;

    Equation(String name, UnaryOperator<Double> function){
        this.name = name;
        this.function = function;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getValue(double x){
        return function.apply(x);
    }
}
