package edu.methods;

import edu.Equation;

public class Trapezoidal extends Method {
    public Trapezoidal(double a, double b, Equation equation, double epsilon) {
        super(a, b, equation, epsilon);
    }

    @Override
    protected double useMethod(double a, double b, Equation equation, int n) {
        double h = (b - a) / n;
        double x = a;
        double sum = equation.getValue(x) / 2;
        for (int i = 1; i < n; i++) {
            x += h;
            sum += equation.getValue(x);
        }
        sum += equation.getValue(b) / 2;
        return h * sum;
    }
}
