package readInputFromExternalSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readInputFromProp {

	public static void main(String[] args) throws IOException 
	{
		//Step:1 create obj fro File
		File file = new File("./testData/data.properties");
		
		//Step:2 Create obj for Fis
		FileInputStream fis = new FileInputStream(file);
		
		//Step:3 create obj for properties
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("url"));
		System.out.println(prop.get("email"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("company"));
		System.out.println(prop.get("name"));
	}

}
