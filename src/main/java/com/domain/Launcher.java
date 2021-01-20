package com.domain;

public class Launcher {

    public static int operate(int operandA,int operandB, InterfaceFonctionnelle1 myInterface){
        return myInterface.operation(operandA,operandB);
    }

}
