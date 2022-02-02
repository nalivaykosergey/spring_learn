package hibernate_test1;

import hibernate_test1.entityes.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainUpdateData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            emp.setSurname("Anohin");
            emp.setName("Alex");
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }

}
