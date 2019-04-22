package com.wainejames.java;

import ucar.ma2.Array;
import ucar.nc2.Dimension;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;
import ucar.nc2.dataset.NetcdfDataset;

import java.io.IOException;
import java.util.List;

public class FileExplorer {

    NetcdfDataset dataset;

    public FileExplorer(String fileLoc) {
        NCOpener opener = new NCOpener(fileLoc);
        dataset = opener.getData();

    }

    public String getHeader() {
        return null;
    }

    public List<Dimension> getDimensions()
    {
        return dataset.getDimensions();
    }

    public List<Variable> getVariables()
    {
        return dataset.getVariables();
    }

    public Array getVariable(String varName)
    {
        Array returnArray = null;
        try{
            Variable v = dataset.findVariable(varName);
            returnArray =  v.read();
        } catch (IOException e){
            e.printStackTrace();
        }

        return returnArray;
    }



    public int getLength() {
        return 0;
    }
}
