package class18;

public class Student {

    String name;
    double subj1;
    double subj2;
    double subj3;

    Student(String name, double sub1, double sub2,double sub3){

        subj1=sub1;
        subj2=sub2;
        subj3=sub3;

    }
    void calculatePrintAvgGrade(){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }
    public static void main(String [] args){
        new Student("Sabah", 99, 98, 97.5).calculatePrintAvgGrade();

    }
}
