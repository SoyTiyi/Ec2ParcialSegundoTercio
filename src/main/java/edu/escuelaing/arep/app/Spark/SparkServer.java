package edu.escuelaing.arep.app.Spark;

import static spark.Spark.*;

import edu.escuelaing.arep.app.Calculator;

/**
 * Hello world!
 *
 */
public class SparkServer 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/sin", (req, res) -> {
            Double value = Double.parseDouble(req.queryParams("value"));
            Calculator calculator = new Calculator();
            return calculator.sin(value);
        });

        get("/asin", (req,res) -> {
            Double value = Double.parseDouble(req.queryParams("value"));
            Calculator calculator = new Calculator();
            return calculator.asin(value);
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
