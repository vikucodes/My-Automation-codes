package Automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
	
	@Test
	
	void openapp()
	{
		System.out.println("apen app");
	}
	
	@DataProvider (name="dp")
	
    Object [][] loginData()
    {
	Object [][] data= {	
		{"abc@gmail.com" , "test113"},
		{"efg@gmail.com" , "test1234"}
	};
		
		return data;
	}	
	}

