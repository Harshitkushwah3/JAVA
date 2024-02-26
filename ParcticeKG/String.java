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

class StringF{
    public static void main(String[] args) {
        String name="Harshit";
        int marks =90;
        System.out.printf("Hello %S you got %d percent",name,marks);
    }
}

class sb{
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("TG ");
        s.append("HK ");
        System.out.println(s);
    }
}

class finalk{

    final double PI= 3.1412;

    void testing(){

    }
    public static void main(String[] args) {
        
    }
}

class jc{
    String name;
    String house;
    String  color;
    int age;
    
    public jc(String name, String house, String color, int age) {
        this.name = name;
        this.house = house;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "jc [name=" + name + ", house=" + house + ", color=" + color + ", age=" + age + "]";
    }
    public static void main(String[] args) {
        jc j1 = new jc("John", "Doe House", "Black", 25);
        System.out.println(j1);
    }
    
}
