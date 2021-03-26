package edu.escuelaing.arep.app;
import java.lang.Math;

public class Calculator {
    
    public String sin(Double value){
        String operation = "sin";
        Double result = Math.sin(value);
        return "{\"operation\":" +operation + ", \"input\":" + value + ", \"output\":" + result +"}";
    }

    public String asin(Double value){
        String operation = "asin";
        Double result = Math.asin(value);
        return "{\"operation\":" +operation + ", \"input\":" + value + ", \"output\":" + result +"}";
    }

}
