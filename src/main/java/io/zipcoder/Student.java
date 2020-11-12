package io.zipcoder;


import java.util.ArrayList;

public class Student {


    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;           // a dynamic collection of decimal values represent


    public  Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        for(Double score: testScores){              // you cannot add the entire testScores to the
                                                    // arraylist so iterate through each individual score and
                                                    //push it to the arraylist  examScores
            examScores.add(score);
        }

    }

    public Student(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getExamScores() {

        StringBuilder scoreSheet = new StringBuilder();
        scoreSheet.append("Exam Scores:\n");
        for (int i = 1; i < examScores.size(); i++) {

            String formatter = String.format("%1.0f", examScores.get(i) );
            scoreSheet.append("Exam "+i+ " -> " + formatter+ "\n");
        }

       return scoreSheet.toString();
    }

    public void setNumberOfExamsTaken(){
        int numOfExamsTaken= this.examScores.size();

    }

    public int getNumberOfExamsTaken(){

        return this.examScores.size();
    }


        public void addExamScore(double testScore){

        examScores.add(testScore);
        }


        public void setExamScore(int examNumber, double newScore){

        examScores.set(examNumber, newScore);
        }

        public Double getAverageExamScore(){
        Double sumOfScores = 0.0;
         for(Double A : examScores){
             sumOfScores += A;
         }
            Double averageScore = sumOfScores/examScores.size();
         return averageScore;
        }


       public String toString(){

        StringBuilder fullScoreBoard = new StringBuilder();
        fullScoreBoard.append("Student Name: " + firstName + " "+lastName+"\n");
        fullScoreBoard.append("Average Score: "+ getAverageExamScore()+"\n");
        fullScoreBoard.append(getExamScores());


        return fullScoreBoard.toString();

        }



}
