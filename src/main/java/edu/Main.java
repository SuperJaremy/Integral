package edu;

import edu.io.ConsoleInput;
import edu.io.ConsoleOutput;
import edu.io.InputData;
import edu.io.OutputData;
import edu.methods.*;
import edu.methods.rectangulars.*;

public class Main {
    public static void main(String[] args){
        ConsoleInput input = new ConsoleInput();
        InputData data = input.read();
        Method method = data.getMethod().dataToMethod(data);
        OutputData data1 = new OutputData(method);
        ConsoleOutput output = new ConsoleOutput();
        output.write(data1);
    }
}
