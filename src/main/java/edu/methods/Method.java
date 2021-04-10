package edu.methods;


import edu.Equation;
import lombok.Getter;

public abstract class Method {

    private final Equation equation;
    private final double a;
    private final double b;
    @Getter
    private final double epsilon;
    private int n;
    private double solution;
    private final double LIMIT = Math.pow(2, 20);

    public Method(double a, double b, Equation equation, double epsilon) {
        this.a = a;
        this.b = b;
        this.equation = equation;
        this.epsilon = epsilon;
        n = 4;
        solve();
    }

    private void solve() {
        solution = useMethod(a, b, equation, n);
        double previousSolution;
        do {
            previousSolution = solution;
            n *= 2;
            solution = useMethod(a, b, equation, n);
        } while (!checkExit(epsilon, previousSolution, solution));
    }

    private boolean checkExit(double epsilon, double previousSolution, double solution) {
        if (n < LIMIT)
            return Math.abs(solution - previousSolution) <= epsilon;
        else {
            System.out.println("Слишком большое количество разбиений");
            return true;
        }
    }

    public final int getN() {
        return n;
    }

    public final double getSolution() {
        return solution;
    }

    protected abstract double useMethod(double a, double b, Equation equation, int n);


}