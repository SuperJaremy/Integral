package edu.io;

import edu.methods.Method;
import lombok.Getter;

public class OutputData {
    @Getter
    private final double solution;
    @Getter
    private final int stepCount;
    @Getter
    private final double epsilon;
    public OutputData(Method method){
        solution = method.getSolution();
        stepCount = method.getN();
        epsilon = method.getEpsilon();
    }
}
