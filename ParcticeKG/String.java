package ParcticeKG;
import java.util.*;


class Sstring{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the string again: ");
        String str1=sc.nextLine();
        if (str.equals(str1)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}


// toString method

class car{
    int noOfWheels;
    int noOfDoor;
    int maxSpeed;
    String name;
    String modelNumebr;
    String company;

    public car(int noOfWheels, int noOfDoor, int maxSpeed, String name, String modelNumbers, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoor = noOfDoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumebr = modelNumbers;
        this.company = company;
    }
    @Override
    public String toString() {
        return "my car name is " + name;
    }
    public static void main(String[] args) {
        car swift=new car(4,4,180,"swift","vdi","maruti");
        System.out.println("Details of "+swift.name+"\nNumber of wheels: "+swift.noOfWheels+"\nNumber of doors: "+swift.noOfDoor+"\nMax speed: "+swift.maxSpeed+"\nModel number: "+swift.modelNumebr+"\nCompany: "+swift.company);

        System.out.println(swift); // hashcode generation
    }
};


