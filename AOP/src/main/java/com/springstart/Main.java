package com.springstart;

import com.springstart.classes.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("library", Library.class);
        library.getBook("Master and Margarite");
        library.getMagazine("Forbes");
        context.close();

    }
}
