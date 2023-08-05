package com.wipro.pkg;

import java.util.List;

import java.util.ArrayList;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.hibernate.query.NativeQuery;



import com.wipro.pkg.Models.*;

import javax.persistence.*;

import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Root;




public class StudentMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("student.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            DayScholar dayScholar = new DayScholar();
            dayScholar.setName("John Doe");
            dayScholar.setStudentClass("10A");
            dayScholar.setLockerId("1234");
            session.save(dayScholar);

            Hostelier hostelier = new Hostelier();
            hostelier.setName("Jane Smith");
            hostelier.setStudentClass("12B");
            hostelier.setRoomNo("A102");
            session.save(hostelier);

            String nativeSqlQuery = "SELECT * FROM student WHERE dtype='DS'";
            NativeQuery<DayScholar> nativeQuery = session.createNativeQuery(nativeSqlQuery, DayScholar.class);
            List<DayScholar> dayScholars = nativeQuery.getResultList();
            for (DayScholar dayScholar1 : dayScholars) {
                System.out.println(dayScholar1);
            }

            String hqlQuery = "FROM Student WHERE dtype='DS'";
            TypedQuery<Student> hqlQueryObj = session.createQuery(hqlQuery, Student.class);
            List<Student> students = hqlQueryObj.getResultList();
            for (Student student : students) {
                if (student instanceof DayScholar) {
                    dayScholar = (DayScholar) student;
                    System.out.println(dayScholar);
                } else if (student instanceof Hostelier) {
                    hostelier = (Hostelier) student;
                    System.out.println(hostelier);
                }
            }

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Student> criteriaQuery = cb.createQuery(Student.class);
            Root<Student> root = criteriaQuery.from(Student.class);
            criteriaQuery.select(root).where(cb.like(cb.lower(root.get("name")), "%a"));
            students = session.createQuery(criteriaQuery).getResultList();
            for (Student student : students) {
                System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
            }

            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
}

