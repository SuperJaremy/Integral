package edu.methods.rectangulars;

import edu.Equation;
import edu.methods.Rectangular;

public class MiddleRectangular extends Rectangular {
    public MiddleRectangular(double a, double b, Equation equation, double epsilon) {
        super(a, b, equation, epsilon);
    }

    @Override
    protected double sum(Equation equation, double a, double b, double n) {
        double h = (b-a)/n;
        double sum = 0;
        double x = a;
        double previousX;
        for(int i = 1; i<=n;i++){
            previousX = x;
            x+=h;
            sum+=equation.getValue((x+previousX)/2);
        }
        return sum;
    }
}
