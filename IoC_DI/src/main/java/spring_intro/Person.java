package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
        pet = null;
    }

    @Autowired
    public Person(@Qualifier("cat")Pet pet){
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my pet!");
        pet.say();
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }
}
