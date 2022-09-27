package com.ty.school_controller;

import java.util.Scanner;

import com.ty.school_dao.ReferenceBook_DAO;
import com.ty.school_dto.ReferenceBook;

public class ReferenceBookDriver {
	public static void main(String[] args) {
		ReferenceBook book = new ReferenceBook();
		ReferenceBook_DAO book_dao = new ReferenceBook_DAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			book.setName("harrypotter");
			book.setAuthor("j k rowling");
			book.setSubject("novel");
			book_dao.saveBook(book);
			break;
		}
		case 2: {
			book.setId(1);
			book_dao.getBook(book);
			break;
		}
		case 3: {
			boolean b = book_dao.deleteBook(1);
			System.out.println(b);
			System.out.println("deleted");
			break;
		}
		case 4: {
			book.setId(1);
			book.setName("harrypotter1");
			book.setAuthor("j k rowling");
			book.setSubject("novel");
			book_dao.updateBook(book);
			break;
		}
		}
	}
}
