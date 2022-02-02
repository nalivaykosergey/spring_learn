package spring_intro;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);




        Person person = context.getBean("person", Person.class);
        System.out.println(person.getAge());
        person.callYourPet();
        context.close();
    }
}
