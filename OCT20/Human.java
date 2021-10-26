package OCT20;



import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Human {

   private String name;
   private LocalDate dateOfBirth;
   private double height;



    
            //name setter and getter
            public void setName(String name){
                this.name = name;
            }

            public String getName(){
                return name; 
            }
            
            //date of birth setter and getter 
            public void setDateOfBirth( localDate dateOfBirth){
                this.dateOfBirth = dateOfBirth;
            }
            
            public LocalDate getDateOfBirth(){
                return dateOfBirth;
            }

            // Height setter and getter 
            public void setHeight(double height){
                this.height = height;
            }

            public double getHeight(){
                return height;
            }


            public int age(){
                DateTimeFormatter formatDateYYYY = DateTimeFormatter.ofPattern("yyyy");
                LocalDate actualdate = LocalDate.now();
                int yearOfBirth = Integer.parseInt(dateOfBirth.format(formatDateYYYY));
                int actualYear = Integer.parseInt(actualdate.format(formatDateYYYY));
                int age = actualYear - yearOfBirth;

                DateTimeFormatter formatterMMdd =DateTimeFormatter.ofPattern(MMdd);
                int monthDayOfBirth = Integer.parseInt(dateOfBirth.format(formatterMMdd));
                int monthDayActual = Integer.parseInt(dateActual.format(formatterMMdd));

                if (monthDayOfBirth > monthDayActual) {
                    age = age - 1;
                }
                
                return age;
            }
            @Override
            public String toString() {
                DateTimeFormatter formatBr = DateTimeFormatter.ofPattern("dd,MM,yyyy");
                return          "Name: " + name + "\n"+
                                "Date of Birth: " + dateOfBirth + "\n"+
                                "Height: " + height + "\n"+
                                "Age: " + age();
            }

            



}