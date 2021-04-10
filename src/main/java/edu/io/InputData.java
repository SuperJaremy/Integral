package edu.io;

import edu.Equation;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InputData {

    private Equation equation;

    private double a;

    private double b;

    private double epsilon;

    private DataToMethod method;
}
