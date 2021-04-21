package edu;

import java.util.function.UnaryOperator;

public enum Equation {
    FIRST("5x^3-2x^2+3x-15",
            x -> 5 * Math.pow(x, 3) - 2 * Math.pow(x, 2) + 3 * x - 15),
    SECOND("xsin(3x)-23x+14e^(-x)",
            x -> x * Math.sin(3 * x) - 23 * x + 14 * Math.exp(-x)),
    THIRD("cos(-15x)*sin(11x)*e^(-3x)",
            x -> Math.cos(-15 * x) * Math.sin(11 * x) * Math.exp(-3 * x)),
    FORTH("x^(1/3)*e^(sin(x)*cos(-2*x))",
            x -> Math.cbrt(x) * Math.exp(Math.sin(x) * Math.cos(-2 * x)));
    private final String name;
    private final UnaryOperator<Double> function;

    Equation(String name, UnaryOperator<Double> function) {
        this.name = name;
        this.function = function;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getValue(double x) {
        return function.apply(x);
    }
}
