package io.zipcoder;

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


    }




}
