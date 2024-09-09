package org.edoardo_bianco;

import java.util.Random;

//Add any necessary import statement here
public class TestJava {
    public static void main(String [] args){
        //add teste code here
        float value = 102.0f;
        //add any print statement here
        System.out.println("Hello world: OCP 17 ");
        Random r = new Random();
        System.out.println("Random numeber: "+r.nextInt(9, 20));

        String textBox = """
                "Java study Guide "
                  by SCott & Jeanne
                """;
        System.out.println("text Box : "+ textBox); 
           

    }
}