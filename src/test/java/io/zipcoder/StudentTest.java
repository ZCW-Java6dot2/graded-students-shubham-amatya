package io.zipcoder;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test

    public void testSetFirstName(){
        String expected = "Christian";
        Student testStudent = new Student();
        testStudent.setFirstName(expected);
        Assertions.assertEquals(expected, testStudent.getFirstName());
    }

    @Test

    public void testSetLastName(){
        String expected = "Pulisic";
        Student testStudent = new Student();
        testStudent.setLastName(expected);
        Assertions.assertEquals(expected, testStudent.getLastName());
    }

    @Test

    public void testNumOfExamsTaken(){
        Student testStudent = new Student();
        int expected = 5;



        int actual = testStudent.getNumberOfExamsTaken();
        Assertions.assertEquals(expected, actual);
    }

     @Test

    public void getExamScores(){

        String firstName = "Hakim";
        String lastName ="Ziyech";
        Double [] examScores = {99.00, 69.50, 89.00 };

        String expected = "Exam Scores: \nExam 1 -> 99.00\nExam 2 -> 69.50\nExam 3 -> 89.00";

         Student testStudent = new Student(firstName, lastName, examScores);
         String actual = testStudent.getExamScores();

         Assertions.assertEquals(expected, actual);
     }


     }




