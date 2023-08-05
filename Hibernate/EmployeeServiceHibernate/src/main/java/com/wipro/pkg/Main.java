package com.wipro.pkg;

import com.wipro.pkg.Models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // CRUD Operations for Department and Employee
        /*Session session = sessionFactory.openSession();
        try {
            // Transaction begins
            session.beginTransaction();

            // Insert data
            Department department = new Department();
            department.setDeptname("HR");
            Employee employee1 = new Employee();
            employee1.setEmpname("Roshan");
            employee1.setSalary(40000.0);
            employee1.setDepartment(department);
            Employee employee2 = new Employee();
            employee2.setEmpname("Ritik");
            employee2.setSalary(5000.0);
            employee2.setDepartment(department);
            List<Employee> empList = new ArrayList<>();
            empList.add(employee1);
            empList.add(employee2);
            department.setEmployees(empList);

            session.save(department);
            session.save(employee1);
            session.save(employee2);

            // Native SQL Query to retrieve all Employee details
            String nativeSqlQuery = "SELECT * FROM employee";
            Query query = session.createNativeQuery(nativeSqlQuery, Employee.class);
            List<Employee> employees = query.getResultList();

            // Print Employee details
            System.out.println("All Employee Details:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            // HQL Query to retrieve Employees of a specific Department
            int departmentId = 1; // Assuming Department ID 1 exists
            String hqlQuery = "FROM Employee e WHERE e.department.deptid = :deptId";
            TypedQuery<Employee> hqlQueryObj = session.createQuery(hqlQuery, Employee.class);
            hqlQueryObj.setParameter("deptId", departmentId);
            List<Employee> departmentEmployees = hqlQueryObj.getResultList();

            // Print Employees of the Department
            System.out.println("\nEmployees of Department with ID " + departmentId + ":");
            for (Employee employee : departmentEmployees) {
                System.out.println(employee);
            }

            // Criteria Query to return Employees whose salary is greater than 25000
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
            Root<Employee> root = criteriaQuery.from(Employee.class);
            criteriaQuery.select(root)
                    .where(criteriaBuilder.greaterThan(root.get("salary"), 25000));

            List<Employee> highSalaryEmployees = session.createQuery(criteriaQuery).getResultList();

            // Print Employees with salary greater than 25000
            System.out.println("\nEmployees with Salary Greater Than 25000:");
            for (Employee employee : highSalaryEmployees) {
                System.out.println(employee);
            }

            // Transaction commit
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
*/
        // CRUD Operations for Citizen and IDCard
        Session session = sessionFactory.openSession();
        try {
            // Transaction begins
            session.beginTransaction();

            // Insert data
            Citizen citizen = new Citizen();
            IDCard idCard = new IDCard();
            idCard.setCardNumber("4567386098");
            citizen.setName("Ronit");
            citizen.setIdCard(idCard);
            idCard.setCitizen(citizen);

            session.save(citizen);
            session.save(idCard);

             citizen = new Citizen();
             idCard = new IDCard();
            idCard.setCardNumber("456738456");
            citizen.setName("Cena");
            citizen.setIdCard(idCard);
            idCard.setCitizen(citizen);

            session.save(citizen);
            session.save(idCard);

            // Native SQL Query to retrieve all Citizen id and name
            String nativeSqlQuery = "SELECT citizenId, name FROM citizens";
            TypedQuery<Object[]> query = session.createNativeQuery(nativeSqlQuery);
            List<Object[]> results = query.getResultList();

            // Print Citizen details
            System.out.println("\nAll Citizen ID and Name:");
            for (Object[] result : results) {
                int citizenId = (int) result[0];
                String name = (String) result[1];
                System.out.println("Citizen ID: " + citizenId + ", Name: " + name);
            }

            // Criteria Query to return Citizens whose name ends with "a"
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Citizen> criteriaQuery = criteriaBuilder.createQuery(Citizen.class);
            Root<Citizen> root = criteriaQuery.from(Citizen.class);
            criteriaQuery.select(root)
                    .where(criteriaBuilder.like(root.get("name"), "%a"));

            List<Citizen> citizensWithA = session.createQuery(criteriaQuery).getResultList();

            // Print Citizens whose name ends with "a"
            System.out.println("\nCitizens whose name ends with 'a':");
            for (Citizen citizenWithA : citizensWithA) {
                System.out.println(citizenWithA);
            }

            // Transaction commit
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        // Close the SessionFactory
        sessionFactory.close();
    }
}