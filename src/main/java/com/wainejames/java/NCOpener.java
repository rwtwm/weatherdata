package com.wainejames.java;

import ucar.nc2.NetcdfFile;
import ucar.nc2.dataset.NetcdfDataset;

import java.io.IOException;

public class NCOpener {
    private NetcdfFile ncFile;
    private NetcdfDataset dataset;

    public NCOpener(String fileLoc) {
        try {
            ncFile = NetcdfFile.open(fileLoc);
            dataset = new NetcdfDataset(ncFile);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public NetcdfFile getFile() {
        return ncFile;
    }

    public NetcdfDataset getData()
    {
        return dataset;
    }

    public void close() {
        if (ncFile != null){
            try {
                dataset.shutdown();
                ncFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
