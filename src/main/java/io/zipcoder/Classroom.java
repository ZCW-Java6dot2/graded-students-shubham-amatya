package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {

   private Student[] students;                            //Collection of student objects

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] student){
        this.students = student;

    }

    public Classroom(){
        this.students = new Student[30];

    }

    public Student[] getStudents() {

        return students;
    }

   public double getAverageExamScore() {


        double sumOfScores = 0.0;

        for (Student student : students) {
                sumOfScores += student.getAverageExamScore();

        }


        /*for (int i = 0; i < students.length; i++) {
            Student everyStudent =  students[i];     //to first get the score of each student

            for (int j = 0; j < everyStudent.examScores.size(); j++){
                sumOfScores += everyStudent.examScores.get(i);

            }
        }*/

        return sumOfScores;
    }

    public void addStudent(Student student){

       List <Student> aList = Arrays.asList(students);
        aList.add(student);

        students = aList.toArray(new Student [aList.size()]);

    }

   public void removeStudent(String firstName, String lastName){

       for(int i = 0; i < students.length; i++) {
           if(students[i].getFirstName().equals((firstName))
                   && students[i].getLastName().equals((lastName))) {
               students[i] = null;
               break;
           } else {
               continue;
           }
       }





   }


}
