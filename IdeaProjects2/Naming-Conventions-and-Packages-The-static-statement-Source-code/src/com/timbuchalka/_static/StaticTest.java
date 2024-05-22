package com.timbuchalka._static;

/**
 * Created by dev on 20/11/2015.
 */
public class StaticTest {
    private static int numInstances = 0;
    //independent of any instances of the class
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
        //it will increase from prev value always a new instance of class is created
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
