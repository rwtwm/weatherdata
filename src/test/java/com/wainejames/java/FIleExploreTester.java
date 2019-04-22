package com.wainejames.java;

import org.junit.Test;


import java.io.IOException;

public class FIleExploreTester {

    private static final String FILE_LOC = "D:\\Documents\\06 Java\\IdeaProjects\\weatherdata2\\resources\\CRUTEM.4.6.0.0.anomalies.nc";

    @Test
    public void testDimensions()
    {
        FileExplorer explorer = new FileExplorer(FILE_LOC);
        System.out.println(explorer.getVariables());
        System.out.println(explorer.getHeader());
        System.out.println(explorer.getLength());
        ;

    }
}
