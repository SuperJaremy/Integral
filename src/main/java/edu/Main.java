package edu;

import edu.io.ConsoleInput;
import edu.io.InputData;
import edu.methods.*;
import edu.methods.rectangulars.*;

public class Main {
    public static void main(String[] args){
//        Method method = new MiddleRectangular(-3,10,Equation.FIRST, 0.001);
//        System.out.println(method.getSolution());
//        System.out.println(method.getN());
        ConsoleInput input = new ConsoleInput();
        InputData data = input.read();
        Method method = data.getMethod().dataToMethod(data);
        System.out.println(method.getSolution());
    }
}
