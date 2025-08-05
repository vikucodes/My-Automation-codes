package com.Qa_test_utils;

import java.util.Date;

public class Utilities {
	
	public static String generateEmailWithTimeStamp() {
		
		Date date=new Date();
	String Timestamp=	date.toString().replace(" ", "_").replace(":", "_");
		return "vikas"+Timestamp+"@gmail.com";
	}

}
