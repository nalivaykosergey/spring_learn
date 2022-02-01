package hibernate_test2;

import hibernate_test2.entityes.Detail;
import hibernate_test2.entityes.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee);

        } finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }
}
