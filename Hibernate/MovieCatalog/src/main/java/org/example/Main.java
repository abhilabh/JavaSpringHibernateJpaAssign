package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize Hibernate and get the session factory
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Perform CRUD operations
        createStudent(sessionFactory, "Vivek", 30);
        createStudent(sessionFactory, "Manak", 70);
        createStudent(sessionFactory, "Ritesh", 80);
        createStudent(sessionFactory, "Rumik", 35);
        readStudents(sessionFactory);
        updateStudent(sessionFactory, 1, "Vivek", 44);
        deleteStudent(sessionFactory, 2);

        // Retrieve students with score above 50 using HQL query
        retrieveStudentsAbove50(sessionFactory);

        // Close the session factory
        sessionFactory.close();
    }

    // Create a new student
    private static void createStudent(SessionFactory sessionFactory, String studentName, int score) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(studentName, score);
        session.save(student);

        tx.commit();
        session.close();
    }

    // Read all students
    private static void readStudents(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();

        List<Student> students = session.createQuery("FROM Student", Student.class).list();
        for (Student student : students) {
            System.out.println(student);
        }

        session.close();
    }

    // Update a student's name and score by studentId
    private static void updateStudent(SessionFactory sessionFactory, int studentId, String newName, int newScore) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, studentId);
        if (student != null) {
            student.setStudentName(newName);
            student.setScore(newScore);
            session.update(student);
        }

        tx.commit();
        session.close();
    }

    // Delete a student by studentId
    private static void deleteStudent(SessionFactory sessionFactory, int studentId) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, studentId);
        if (student != null) {
            session.delete(student);
        }

        tx.commit();
        session.close();
    }

    // Retrieve students with score above 50 using HQL query
    private static void retrieveStudentsAbove50(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();

        List<Student> students = session.createQuery("FROM Student WHERE score > 50", Student.class).list();
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Student Name: " + student.getStudentName());
        }

        session.close();
    }
}
