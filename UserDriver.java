package com.ty.school_controller;

import java.util.Scanner;

import com.ty.school_dao.User_DAO;
import com.ty.school_dto.User;

public class UserDriver {
	public static void main(String[] args) {
		User user=new User();
		User_DAO user_dao=new User_DAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		switch(n) {
		case 1:{user.setId(2);
		user.setName("zoy");
		user.setEmail("zoya@gmail.com");
		user.setPassword("zoya@123");
		user.setPhone(12345678);
		user.setGender("female");
		user_dao.saveUser(user);
		System.out.println("inserted");
		break;
	}
		case 2:{
			user.setId(1);
			user_dao.getUser(user);
			break;
		}
		case 3:{
			
			boolean u=user_dao.deleteUser(1);
			System.out.println(u);
			break;
		}
		case 4:{
			user.setId(2);
			user.setName("zoya shaik");
			user.setEmail("zoya@gmail.com");
			user.setPassword("zoya@123");
			user.setPhone(12345678);
			user.setGender("female");
			user_dao.updateUser(user);
			System.out.println("updated");
			break;
		}
		}}
}
