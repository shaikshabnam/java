package com.ty.school_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school_dto.Student;

public class Student_DAO {
	public Student saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public Student getStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student s = entityManager.find(Student.class, 1);
		if (student != null) {
			System.out.println("student roll is :" + s.getRoll());
			System.out.println("student name is :" + s.getName());
			System.out.println("student percentage is :" + s.getPercentage());
		}
		return s;
	}

	public boolean deleteStudent(int roll) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = entityManager.find(Student.class, 1);
		if (s != null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Student updateStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
}
