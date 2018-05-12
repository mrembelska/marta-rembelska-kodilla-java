package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@ContextConfiguration
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        TaskList taskList1 = (TaskList) context.getBean("List1");
        TaskList taskList2 = (TaskList) context.getBean("List2");
        TaskList taskList3 = (TaskList) context.getBean("List3");

        taskList1.tasks.add("run");
        taskList2.tasks.add("runn");
        taskList3.tasks.add("runb");

        //When Then
        System.out.println(taskList1.tasks.get(0));
        System.out.println(taskList2.tasks.get(0));
        System.out.println(taskList3.tasks.get(0));
    }
}
