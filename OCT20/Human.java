package OCT20;

public class Human {

   private String name;
   private int dateOfBirth;
   private double height;



    public Human (String name, int dateOfBirth, double height){

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfBirth = dateOfBirth; 

    }
            //name setter and getter
            public void setName(String name){
                this.name = name;
            }

            public String getName(){
                return name; 
            }
            
            //date of birth setter and getter 
            public void setDateOfBirth(int dateOfBirth){
                this.dateOfBirth = dateOfBirth;
            }
            
            public int getDateOfBirth(){
                return dateOfBirth;
            }

            // Height setter and getter 
            public void setHeight(double Height){
                this.height = height;
            }

            public double getHeight(){
                return height;
            }

            public void printdetails(){
                System.out.println("Name: " + name +  "   Date of Birth: " + dateOfBirth + "   Height: " + height);
            }



}