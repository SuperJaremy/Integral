package edu;

import edu.methods.*;
import edu.methods.rectangulars.*;

public class Main {
    public static void main(String[] args){
        Method method = new MiddleRectangular(-3,10,Equation.FIRST, 0.001);
        System.out.println(method.getSolution());
        System.out.println(method.getN());
    }
}
