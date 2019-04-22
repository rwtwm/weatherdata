Exploration of the CRUtemp dataset and working with .NC files in Java.

Core data from [UEA climatic research unit](http://www.cru.uea.ac.uk/data/). Source data is CRUTEM4

Details of using netCDF at [https://www.unidata.ucar.edu/software/thredds/current/netcdf-java/tutorial/]() 

___

The file explorer class can be used with a netCDF file as is (22/04/19) to review the dimensions and variables in a netCDF file. `FileExplorer.getVariables()` and `FileExplorer.getDimensions()` return lists of each. 

