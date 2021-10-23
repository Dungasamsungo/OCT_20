package OCT20;

public class Person {
    String name;
    int age;
    double height;

    public Person (String name, int age, double height){

        this.name = name;
        this.age = age;
        this.height = height;

    }

        void sing(){
            System.out.println(this.name + " is singing");
        }

        void dance(){
            System.out.println(this.name + " is Dancing");
        }
}

    
