package edu.methods;

import edu.Equation;

public class Simpson extends Method{
    public Simpson(double a, double b, Equation equation, double epsilon) {
        super(a, b, equation, epsilon);
    }

    @Override
    public double useMethod(double a, double b, Equation equation, int n) {
        double h = (b-a)/n;
        double x = a;
        double sum = equation.getValue(a);
        for(int i=1; i<n; i++){
            x+=h;
            if(i%2==0)
                sum+=2*equation.getValue(x);
            else
                sum+=4*equation.getValue(x);
        }
        return h/3*(sum+equation.getValue(b));
    }

}
