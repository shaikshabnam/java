package com.ty.school_controller;

import java.util.Scanner;

import com.ty.school_dao.Student_DAO;
import com.ty.school_dto.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int n = sc.nextInt();

		Student student = new Student();
		Student_DAO student_dao = new Student_DAO();
		switch (n) {
		case 1: {
			student.setName("a");
			student.setPercentage(85.9);
			Student s = student_dao.saveStudent(student);
			
			break;
		}
		case 2: {
			student.setRoll(4);
			student_dao.getStudent(student);
			break;
		}
		case 3: {
			boolean s = student_dao.deleteStudent(4);
			System.out.println(s);
			break;
		}
		case 4: {
			student.setRoll(4);
			student.setName("barath");
			student.setPercentage(55);
			student_dao.updateStudent(student);
			System.out.println("updated");

		}
		}
	}
}
