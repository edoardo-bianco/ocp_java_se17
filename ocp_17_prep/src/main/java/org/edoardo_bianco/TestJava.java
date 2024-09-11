package org.edoardo_bianco;

import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestJava {
    private static final Logger logger = Logger.getLogger(TestJava.class.getName());

    public static void main(String[] args) {
        float value = 102.0f;
        
        logger.log(Level.INFO, "Hello world: OCP 17");
        
        Random r = new Random();
        logger.log(Level.INFO, "Random number: {0}", r.nextInt(9, 20));

        String textBox = """
                "Java study Guide "
                  by SCott & Jeanne
                """;
        logger.log(Level.INFO, "text Box : {0}", textBox);
    }
}