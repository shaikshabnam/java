package com.ty.school_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school_dto.ReferenceBook;

public class ReferenceBook_DAO {
	public ReferenceBook saveBook(ReferenceBook book) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}

	public ReferenceBook getBook(ReferenceBook book) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ReferenceBook b = entityManager.find(ReferenceBook.class, 1);
		if (b != null) {
			System.out.println("id is :" + b.getId());
			System.out.println("name is :" + b.getName());
			System.out.println("authour is :" + b.getAuthor());
			System.out.println("subject is :" + b.getSubject());
		} else {
			System.out.println("enter a valid id number");
		}
		return book;
	}

	public boolean deleteBook(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		ReferenceBook b = entityManager.find(ReferenceBook.class, 1);
		if (b != null) {
			entityTransaction.begin();
			entityManager.remove(b);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public ReferenceBook updateBook(ReferenceBook book) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}
}
