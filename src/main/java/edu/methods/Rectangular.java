package edu.methods;

import edu.Equation;

public abstract class Rectangular extends Method {
    public Rectangular(double a, double b, Equation equation, double epsilon) {
        super(a, b, equation, epsilon);
    }

    @Override
    protected double useMethod(double a, double b, Equation equation, int n) {
        double h = (b - a) / n;
        return sum(equation, a, b, n) * h;
    }

    protected abstract double sum(Equation equation, double a, double b, double n);
}
