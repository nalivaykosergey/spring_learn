package hibernate_test1;

import hibernate_test1.entityes.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainPushData {
    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp =
                    new Employee("Sergey", "Nalivayko", "Nfi", 2000);

            session.beginTransaction();
            session.save(emp);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
