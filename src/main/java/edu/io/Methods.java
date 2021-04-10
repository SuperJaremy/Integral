package edu.io;


import edu.methods.Simpson;
import edu.methods.Trapezoidal;
import edu.methods.rectangulars.*;
import lombok.Getter;

public enum Methods {
    LEFT_RECTANGULAR("Метод левых прямоугольников",
            data -> new LeftRectangular(data.getA(), data.getB(), data.getEquation(), data.getEpsilon())),
    MIDDLE_RECTANGULAR("Метод средних прямоугольников",
            data -> new MiddleRectangular(data.getA(), data.getB(), data.getEquation(), data.getEpsilon())),
    RIGHT_RECTANGULAR("Метод правых прямоугольников",
            data -> new RightRectangular(data.getA(), data.getB(), data.getEquation(), data.getEpsilon())),
    TRAPEZOIDAL("Метод трапеций",
            data -> new Trapezoidal(data.getA(), data.getB(), data.getEquation(), data.getEpsilon())),
    SIMPSON("Метод Симпсона",
            data -> new Simpson(data.getA(), data.getB(), data.getEquation(), data.getEpsilon()));

    private final String name;

    @Getter
    private final DataToMethod method;

    Methods(String name, DataToMethod method) {
        this.name = name;
        this.method = method;
    }

    @Override
    public String toString() {
        return name;
    }
}
