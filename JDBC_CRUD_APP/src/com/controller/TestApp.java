package com.controller;

import java.util.Scanner;

import com.dto.Student;
import com.service.RStudentService;
import com.servicefactory.StudentServiceFactory;

//controller layer
public class TestApp {
	public static void main(String[] args) {
//		Connection con = DriverManager.getConnection(url,username,password);
		Scanner sc = new Scanner(System.in);
		RStudentService studentservice = StudentServiceFactory.getStudentService();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Enter data to insert");
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter address");
				String address = sc.next();
				String msg = studentservice.addStudent(name, age, address);
				if(msg.equalsIgnoreCase("success")) {
					System.out.println("Record Inserted Successfully");
				}
				else {
					System.out.println("Record Insertion Failed");
				}
			}
			//no data found
			else if(choice==2) {
				System.out.println("Enter id to be search");
				int id = sc.nextInt();
				Student s = studentservice.searchStudent(id);
				System.out.println(s);
				if(s != null) {
					int sid = s.getSid();
					int age = s.getSage();
					String name = s.getSname();
					String address = s.getSaddress();
					System.out.println("id:"+sid+",name:"+name+",age:"+age+",address"+address);
				}
				else {
					System.out.println("No data found");
				}
			}
			//null pointer Exception
			else if(choice==3) {
				System.out.println("Enter data to update");
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter address");
				String address = sc.next();
				String msg = studentservice.updateStudent(id,name,age,address);
				if(msg.equalsIgnoreCase("success")) {
				    System.out.println("Record Updated Successfully");
				}
				else if(msg.equalsIgnoreCase("not_found")) {
					System.out.println("No Record found");
				}
				else {
				    System.out.println("Record Updation Failed");
				}
			}
			//null poiter exception
			else if(choice==4) {
				System.out.println("Enter id for delete");
				int id = sc.nextInt();
				String msg = studentservice.deleteStudent(id);
				if(msg.equalsIgnoreCase("success")) {
					System.out.println("Record Deleted Successfully");
				}
				else if(msg.equalsIgnoreCase("not_found")) {
					System.out.println("No Record found");
				}
				else {
					System.out.println("Record deletion Failed");
				}
			}
			else if(choice==5) {
				System.out.println("Exit");
				break;
			}
			else {
				System.out.println("Enter a valid choice");
			}
			
		}
		
	}
}
