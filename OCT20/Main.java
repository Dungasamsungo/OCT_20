package OCT20;
import java.time.LocalDate;
public class Main {
    
    public static void main(String[] args) {

        LocalDate toDay = LocalDate.now();
              System.out.println("Curent Date: " + toDay);
           Human student1 = new Human("Sam", 1988, 8.9);
           student1.setName("John");

           System.out.println("Student's Details");
           System.out.println(); student1.printdetails(); 

           Human student2 = new Human("Sam", 1992, 6.7);
              student2.setName("Micheal");
              student2.setDateOfBirth(1934);
              student2.setHeight(9.4);

            System.out.println();student2.printdetails();
             
       
        
           
        
      
      
      
      /*  Person Person1 = new Person ("Sam", 40, 9.7); 
        Person Person2 = new Person ("James", 39, 8.7); 

        System.out.println(Person1.name + "\n" + Person1.age);

        Person1.sing();
        Person2.dance();*/
    }
}