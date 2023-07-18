package com.hyak4j.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;

    public GraduateStudent(String name, int english, int math, int thesis){
       super(name, english, math);
       this.thesis = thesis;
    }

    @Override
    public void print(){
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + thesis +
                "\t" + getAverage() + "\t" +
                ((getAverage() >= pass) ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
/*        if (getAverage() >= 90 && getAverage() <= 100){
            grading = 'A';
        }else if (getAverage() >= 80 && getAverage() <= 89){
            grading = 'B';
        }else if (getAverage() >= 70 && getAverage() <= 79){
            grading = 'C';
        }else if (getAverage() >= 60 && getAverage() <= 69){
            grading = 'D';
        }*/

        System.out.println(grading);


/*        if (getAverage() >= 60){
            System.out.println("\tPASS");
        }else {
            System.out.println("\tFAILED");
        }*/
    }
}
