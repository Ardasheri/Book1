package class20;

public class Teacher {
    protected String name;
    protected int age;
    protected int yearsOfExperience;
    Teacher(String name,int age,int yearsOfExperience){
        this.age=age;
        this.name=name;
        this.yearsOfExperience=yearsOfExperience;

    }
    void teach(){
        System.out.println(name+ " is teaching");
    }
    public static void main(String [] args){

        Teacher cc= new Teacher("anusha",123,123);
        cc.teach();

    }
}

    class MathTeacher extends Teacher{

        MathTeacher(){
            super("adrn",54,6);
        }


}
