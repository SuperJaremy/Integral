package edu.io;

import org.decimal4j.util.DoubleRounder;

import java.math.BigDecimal;

public class ConsoleOutput {
    public void write(OutputData data) {
        BigDecimal epsilon = BigDecimal.valueOf(data.getEpsilon());
        int precision = epsilon.scale();
        double result = DoubleRounder.round(data.getSolution(), precision);
        System.out.println("Полученное значение: "+result);
        System.out.println("Количество разбиений: "+data.getStepCount());
    }
}
