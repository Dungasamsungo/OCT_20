package OCT20;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {

    
           Human objHuman = new Human();
               objHuman.setName(JOptionPane.showInputDialog(null, "Enter Your Name"));

               DateTimeFormatter formatBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               String dateOfBirth = JOptionPane.showInputDialog(null, "Enter Your Date Of Birth");
               objHuman.setDateOfBirth(LocalDate.parse(dateOfBirth,formatBr));

               objHuman.setHeight(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Your Height")));


               JOptionPane.showMessageDialog(null, objHuman.toString());




           
           

           
           
           
           
           /*Human student2 = new Human("Sam", 1992, 6.7);
              student2.setName("Micheal");
              student2.setDateOfBirth(1934);
              student2.setHeight(9.4);

            System.out.println();student2.printdetails();*/
             
       
        
           
        
      
      
      
      /*  Person Person1 = new Person ("Sam", 40, 9.7); 
        Person Person2 = new Person ("James", 39, 8.7); 

        System.out.println(Person1.name + "\n" + Person1.age);

        Person1.sing();
        Person2.dance();*/
    }
}