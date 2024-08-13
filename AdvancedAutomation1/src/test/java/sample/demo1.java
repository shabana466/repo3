package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class demo1 {

	public static void main(String[] args) throws IOException {
		//stet1 get data the java representation object of the physical file
		   FileInputStream fis=new FileInputStream("‪C:\\Users\\shaik shabana\\Desktop\\commondata.properties");
		     //step2 using properties file load from all the keys
		   Properties pObj=new Properties();
		   pObj.load(fis);
		   //step3  get the value based on key
		   System.out.println(pObj.getProperty("url"));

	}

}
