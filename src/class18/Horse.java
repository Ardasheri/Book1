public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;

    }
    void printInfo()

    {
        System.out.println("name " + name + " Breed " + breed + " age " + age + " Weight " + weight);
    }
    public static void main(String[] args){
        Horse horseObject=new Horse("Spirit", "Stallion", 20, 400);
    }
}