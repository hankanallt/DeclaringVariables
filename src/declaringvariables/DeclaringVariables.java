//This is the name of the Package
package declaringvariables;

//This is the class, always start with capital letter.
public class DeclaringVariables {

    
     public void testMethod(String a, int b, double c){
            
         for (int i = 0; i < 10; i++) {
             int age = 0;
         }
         
         boolean loop = true;
         while (loop){
             System.out.println("i am always true");
         }
        }
    int id;

    public static int counter;
    public double price = 45.5;
    String name = "Batman";

    public static void main(String[] args) {
        
       

    }
}
//The Global variables are declared at class level and assigned a default value if not given any. 
//They are: counter, id, price, name
//Some of the Global variables belong to the class and can be accessed trough class name. They are static and referred to as class variables. 
//Some belong to objects we create from the class. They are called instance variables and are non static.
//  String name; //Null
//  int number;// 0

//The class variables: counter
//The instance variables: id, price, name
//Parameters in methods are also local variables and accessible only within the method they are declared. 
//Their value gets set when the method gets called with arguments.
//testMethod("Pink Panter",1964) sets the value of 'a' to "Pink Panter" and the value of 'b' to "1964".
//The local variables are: a, b, z, i, age, c, loop
//The parameters are: a, b
// This is the main mthond
//Public, the access specifier means from every where we can access it;
//Static, static -access modifier means we can call this method directly using a class name without creating an object of it;
// Void, its the return type; 
// Main - method name string [] args - it accepts only string type of argument...
// public static void (string int) 
//private static boolean myMethod(){}, this takes nothing and returns a Boolean
//public void myMethod(String s, int num), This take one STring and one INt and returns nothing.

