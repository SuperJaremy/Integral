package edu.io;

import edu.methods.Method;

@FunctionalInterface
public interface DataToMethod {
    Method dataToMethod(InputData data);
}
