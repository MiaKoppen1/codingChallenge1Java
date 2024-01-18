
import java.util.Scanner; //using the scanner class

public class Main
    {
        public static void main(String[] args, Object If)
        {
        System.out.println("Hello, this is a calculator application");
        Scanner scannername = new Scanner(System.in); //to get user input.
        System.out.println("enter two numbers");

        double firstnum = scannername.nextDouble();
        double secondnum = scannername.nextDouble();
        
        System.out.println("what would you like to do with your numbers?");
        System.out.println("these are your choices: divide, multiply, add, subtract");
       
        String operation = scannername.nextLine();

        if(operation == "add") //if the user wants to add them.
            {
            System.out.println("adding the numbers...");
            System.out.println("results:");
            System.out.println(firstnum + secondnum);
            }

        else if(operation == "subtract") //if the user wants to subtract them.
            {
            System.out.print("would you like to 1: subtract the first number from the second or 2: second number from the first?");
            String answer = scannername.nextLine();
            if(answer == "1")
            {
            System.out.println("subtracting the numbers...");
            System.out.println("results:");
            System.out.println(secondnum - firstnum); 
            }
            else if(answer == "2")
            {
            System.out.println("subtracting the numbers...");
            System.out.println("results:");
            System.out.println(firstnum - secondnum);    
            }
            }
        else if(operation == "multiply") //if the user wants to multiply them.
            {
            System.out.println("multiplying the numbers...");
            System.out.println("results:");
            System.out.println(firstnum * secondnum);
            }   
        else if(operation == "divide") //if the user wants to divide them.
            {
            System.out.println("would you like to 1: divide the first by the second, or 2: divide the second by the first?");
            String danswer = scannername.nextLine();
            if(danswer == "1")
             {
             System.out.println("dividing the numbers...");
             System.out.println("results: ");
             System.out.println(firstnum / secondnum);
             }
            else if(danswer == "2")
             {
             System.out.println("dividing the numbers...");
             System.out.println("results: ");
             System.out.println(secondnum / firstnum);
             }
            }
        }
       /*  private void divide()
        {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
        }

    private void multiply() 
        {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
        }

    private void add() 
        {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
        }

    private void subtract() 
        {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
        }
         */
        Scanner.close();
        }     
    

   


