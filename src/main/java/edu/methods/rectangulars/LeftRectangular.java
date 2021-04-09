package edu.methods.rectangulars;

import edu.Equation;
import edu.methods.Rectangular;

public class LeftRectangular extends Rectangular {
    public LeftRectangular(double a, double b, Equation equation, double epsilon) {
        super(a, b, equation, epsilon);
    }

    @Override
    protected double sum(Equation equation, double a, double b, double n) {
        double h = (b - a) / n;
        double x = a;
        double sum = equation.getValue(x);
        for (int i = 1; i < n; i++) {
            x+=h;
            sum+=equation.getValue(x);
        }
        return sum;
    }
}
