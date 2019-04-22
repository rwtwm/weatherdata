package com.wainejames.java;

import ucar.nc2.NetcdfFile;

import java.io.IOException;

public class NCOpener {
    NetcdfFile ncFile;

    public NCOpener(String fileLoc) {
        try {
            ncFile = NetcdfFile.open(fileLoc);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ncFile != null){
                try {
                    ncFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public NetcdfFile getData() {
        return ncFile;
    }
}
