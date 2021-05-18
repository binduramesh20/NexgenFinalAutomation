package com.Nexgen.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author bramesh
 *
 */

public class FileUtilities implements AutoConstant{
	/**
	 * Used to read the data from the property file
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static String getdata(String enterthekey) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilepath));
		String value1 = p.getProperty(enterthekey);
		return value1;
		
	}

}
