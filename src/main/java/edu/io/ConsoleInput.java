package edu.io;

import edu.Equation;

import java.util.Scanner;

public class ConsoleInput {
    public InputData read() {
        InputData data = new InputData();
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите уравнение");
        for (int i = 0; i < Equation.values().length; i++) {
            System.out.println((i+1)+". "+Equation.values()[i]);
        }
        data.setEquation(Equation.values()[input.nextInt()-1]);
        System.out.println("Введите нижнюю границу интегрирования");
        data.setA(input.nextDouble());
        System.out.println("Введите нижнюю границу инетгрирования");
        data.setB(input.nextDouble());
        System.out.println("Введите точность");
        data.setEpsilon(input.nextDouble());
        System.out.println("Выберите метод вычисления");
        for (int i = 0; i < Methods.values().length; i++) {
            System.out.println((i+1)+". "+Methods.values()[i]);
        }
        data.setMethod(Methods.values()[input.nextInt()-1].getMethod());
        return data;
    }
}
