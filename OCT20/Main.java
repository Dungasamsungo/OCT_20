package OCT20;

public class Main {
    
    public static void main(String[] args) {


        Person Person1 = new Person ("Sam", 40, 9.7); 
        Person Person2 = new Person ("James", 39, 8.7); 

        System.out.println(Person1.name + "\n" + Person1.age);

        Person1.sing();
        Person2.dance();
    }
}