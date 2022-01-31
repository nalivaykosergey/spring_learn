package spring_intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    int age;

    public Dog() {
        age = 0;
    }
    public Dog(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void say(){
        System.out.println("Гав-гав");
    }
}
