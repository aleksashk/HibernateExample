package com.philimonov.hibernate;

import com.philimonov.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
//        Student student = new Student();
//        student.setFirstName("Jessica");
//        student.setLastName("Parker");
//        student.setAge(19);

//        session.save(student);

        Student student = session.get(Student.class, 1);
        System.out.println(student);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
