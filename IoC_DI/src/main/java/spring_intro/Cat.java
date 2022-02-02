package spring_intro;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    int age;

    public Cat() {
        age = 0;
    }
    public Cat(int age) {
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
        System.out.println("Мяу-мяу");
    }
}
