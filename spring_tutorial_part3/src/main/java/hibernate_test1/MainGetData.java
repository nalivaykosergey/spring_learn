package hibernate_test1;

import hibernate_test1.entityes.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class MainGetData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            ArrayList<Employee> employee = (ArrayList<Employee>) session
                    .createQuery("from Employee where id > 1").getResultList();
            for(Employee l: employee)
                System.out.println(l);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }

}
