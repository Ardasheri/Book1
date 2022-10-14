public class Task2 {
    public static void main(String [] args){
        Circle cc= new Circle(10);
        cc.calculateArea();
    }
}
class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius;

    }
}

class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void calculateArea(){
        System.out.println(Math.PI*(2));
    }
}