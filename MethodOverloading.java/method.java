// Polymorphism: The ability of an entity to take on multiple forms.
// In programming, it allows methods to perform different tasks based on input parameters.

// Method Overloading: A form of polymorphism where multiple methods share the same name
// but differ in the number or type of parameters. This allows methods to handle various
// data types or numbers of inputs gracefully.

// Compile-Time Polymorphism: Method overloading is resolved during compile time,
// meaning the compiler determines which method to invoke based on the method signature.
// This is why it's also known as early binding or static binding.
// we are human being we are also on of the example of polynorphism 


public class method {

    public static void main(String[] args) {


        // System.out.println(args);
        // Calculator calc = new Calculator();
        // calc.add();             // Calls add() with no parameters
        // calc.add(10, 15);       // Calls add(int, int)
        // calc.add(10, 15.5);     // Calls add(int, double)
        
                      

                    // PaymentProcessor paymentProcesss =  new PaymentProcessor();
                    // // paymentProcess.processPayment("52352562",250.00);
                    // paymentProcesss.processPayment("325235235",":001",150);
                    // paymentProcesss.processPayment("555555555555555566",1000,"paypal");

                    //   getArea findArea =  new getArea();
                    //   findArea.area(4);
                    //   findArea.area(4,5);
                    // findArea.area(5,4,6);

                             Exercise temp = new Exercise();
                                temp.plus("what we can ", "may thing we can do ");
                                temp.plus("a", 4 +"this is string + int ");
                                temp.plus("aaa",5.5+"this is double ");
                    
                               
                                // paymentProcessor.processPayment("1234567890123456", 250.00); // Credit card payment
                                // paymentProcessor.processPayment("987654321", "001", 150.00); // Bank account payment
                                // paymentProcessor.processPayment("5556667777", 100.00, "PayPal"); // Mobile wallet payment
                        }
                    
                        private static void paymentProcess(String string, int i) {
                            // TODO Auto-generated method stub
                            throw new UnsupportedOperationException("Unimplemented method 'paymentProcess'");
                        }
}

class Calculator {
    // Method with no parameters
    void add() {
        System.out.println(100 + 200);
    }

    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method with one integer and one double parameter
    void add(int a, double b) {
        System.out.println(a + b);
    }
}

// Key Points:
// - All 'add' methods share the same name but differ in parameter lists.
// - The compiler determines which 'add' method to call based on the arguments provided.
// - This enhances code readability and flexibility by allowing the same method name to handle different data types and numbers of parameters.

// Real-World Example: Method Overloading in a Payment System
class PaymentProcessor {
    // Process payment using a credit card
    void processPayment(String creditCardNumber, double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    // Process payment using a bank account
    void processPayment(String bankAccountNumber, String bankCode, double amount) {
        System.out.println("Processing bank account payment of $" + amount);
    }

    // Process payment using a mobile wallet
    void processPayment(String mobileNumber, double amount, String walletProvider) {
        System.out.println("Processing " + walletProvider + " wallet payment of $" + amount);
    }
}



// In this example, the 'processPayment' method is overloaded to handle different payment methods,
// each with a different set of parameters. This demonstrates method overloading in a real-world scenario.

// Real-World Example: Method Overloading in a Human Context
class Person {
    // Method to display a person's role as a son
    void displayRole(String parentName) {
        System.out.println("Son of " + parentName);
    }

    // Method to display a person's role as a brother
    void displayRole(String siblingName, int siblingAge) {
        System.out.println("Brother of " + siblingName + ", who is " + siblingAge + " years old");
    }

    // Method to display a person's role as a husband
    void displayRole(String spouseName, String anniversaryDate) {
        System.out.println("Husband of " + spouseName + ", anniversary on " + anniversaryDate);
    }
}

// Example Usage:
// Person person = new Person();
// person.displayRole("John"); // Displays: Son of John
// person.displayRole("Emily", 25); // Displays: Brother of Emily, who is 25 years old
// person.displayRole("Sophia", "June 15"); // Displays: Husband of Sophia, anniversary on June 15

// In this example, the 'displayRole' method is overloaded to represent different familial roles
// of a person, each with a different set of parameters. This showcases method overloading in a human context.
/* 
 -----------------------------------------------------------------------------------------------------------------------
                                                Exercise                     
------------------------------------------------------------------------------------------------------------------------

 */












class getArea {
                    void area(int radius){
                        double areaIs = 3.14 * radius*radius;
                        System.out.println("the radius of circle is "+ areaIs);

                    }
                    void area(int lenght , int breadth ){
                        System.out.println("the area of rectange is  "+lenght*breadth);
                    }
                    void area(int lenght , int breadth , int height ){
                            System.out.println("the area of triangel  is  "+lenght*breadth*height);
                    }
                    
};






            class Exercise {
                                // Create a class with an overloaded method concatenate() that:
                                // Concatenates two strings.
                                // Concatenates a string and an integer.
                                // Concatenates a string and a double.
                                // Best Practices for Revising and Practicing Method Overloading:

                                void plus(String a , String b ){
                                    System.out.println(a+b);
                                }
                                void plus(String a , int b ){
                                    System.out.println(a+b);
                                }

                                void plus(String a , double b ){
                                    System.out.println(a+b);
                                }                            };







// Coding Exercises:

// Overload a method to calculate the area of different shapes:

// Create a class Shape with overloaded methods area() to calculate the area of a circle, rectangle, and triangle.
// Overload constructors for a Person class:

// Implement multiple constructors for a Person class:
// A default constructor.
// A constructor that takes only the name.
// A constructor that takes name and age.
// Overload a method to concatenate different types:

// Create a class with an overloaded method concatenate() that:
// Concatenates two strings.
// Concatenates a string and an integer.
// Concatenates a string and a double.
// Best Practices for Revising and Practicing Method Overloading:

// Implement Real-World Scenarios: Think of real-world objects and behaviors that can be modeled using method overloading, such as payment processing methods that accept different payment types.

// Practice with Data Structures: Overload methods to handle different data structures, like arrays and lists, to perform similar operations.

// Explore Standard Libraries: Review how standard libraries use method overloading to provide flexible APIs.

// Write Test Cases: Develop test cases to ensure that overloaded methods behave as expected with various input types and numbers of parameters.