package com.kodilla.spring.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
//@SpringBootTest
@ContextConfiguration
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDB();
        //Then
        //do nothing
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When & Then
        System.out.println("==== Beans list: === >>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("==== Beans list: === >>");

    }
}
