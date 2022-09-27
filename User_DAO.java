package com.ty.school_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school_dto.User;

public class User_DAO {
	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User u = entityManager.find(User.class, 1);
		if (u != null) {
			System.out.println("user id is :" + u.getId());
			System.out.println("user name is :" + u.getName());
			System.out.println("user email is :" + u.getEmail());
			System.out.println("user password is :" + u.getPassword());
			System.out.println("user gender is :" + u.getGender());
			System.out.println("user phone number is :" + u.getPhone());
			return user;
		} else {
			System.out.println("enter a valid id");
		}
		return null;
	}

	public boolean deleteUser(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User u = entityManager.find(User.class, 1);

		if (u != null) {
			entityTransaction.begin();
			entityManager.remove(u);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public User updateUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		return user;
	}
}
