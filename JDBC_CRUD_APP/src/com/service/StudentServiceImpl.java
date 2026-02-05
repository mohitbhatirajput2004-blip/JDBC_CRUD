package com.service;

import com.daofactory.StudentDaoFactory;
import com.dto.Student;
import com.persistence.RStudentDao;

public class StudentServiceImpl implements RStudentService {

//	RStudentService stdService;
//	public String addStudent(String sname, Integer sage, String saddress) {
//		stdService=StudentServiceFactory.getStudentService();
//		return stdService.addStudent(sname, sage, saddress);
//	}
	RStudentDao stdService;
	public String addStudent(String sname, Integer sage, String saddress) {
		stdService= StudentDaoFactory.getstudentDao();
		return stdService.addStudent(sname, sage, saddress);
	}

	RStudentDao stdService2;
	public Student searchStudent(Integer sid) {
		stdService2= StudentDaoFactory.getstudentDao();
		return stdService2.searchStudent(sid);
	}

	RStudentDao stdService3;
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		stdService3= StudentDaoFactory.getstudentDao();
		return stdService3.updateStudent(sid, sname, sage, saddress);
	}

	RStudentDao stdService4;
	public String deleteStudent(Integer sid) {
		stdService4= StudentDaoFactory.getstudentDao();
		return stdService4.deleteStudent(sid);
	}

}
