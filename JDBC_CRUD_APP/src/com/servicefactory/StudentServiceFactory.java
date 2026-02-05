package com.servicefactory;

import com.service.RStudentService;
import com.service.StudentServiceImpl;

//Connection con = DriverManager.getconnection(url,username,password);
public class StudentServiceFactory {
	//singleton class
	//Make Constructor private to avoid object creation
	private StudentServiceFactory(){
		
	}
	private static RStudentService studentService = null;
	
	public static RStudentService getStudentService() {
		if(studentService==null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
}
