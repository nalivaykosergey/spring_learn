package hibernate_test3;

import hibernate_test3.entityes.Department;
import hibernate_test3.entityes.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();




        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            System.out.println(department.getEmps());


            session.getTransaction().commit();


        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
