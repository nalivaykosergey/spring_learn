package hibernate_test4;

import hibernate_test4.entity.Child;
import hibernate_test4.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;



        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 1);
            Section section = session.get(Section.class, 2);
            child.addSectionToChild(section);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
