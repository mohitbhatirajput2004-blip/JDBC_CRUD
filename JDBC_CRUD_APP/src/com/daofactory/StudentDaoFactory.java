package com.daofactory;

import com.persistence.RStudentDao;
import com.persistence.StudentDaoImpl;

public class StudentDaoFactory {
	private StudentDaoFactory() {
		
	}
	
	private static RStudentDao studentDao = null;
	
	public static RStudentDao getstudentDao() {
		if(studentDao==null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
