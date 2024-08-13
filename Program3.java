//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args) {
        //need to make a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //create my variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        //ask the user for some input values
        System.out.println("Please enter the length: ");
        length = myScanner.nextInt();

        System.out.println("Please enter the width: ");
        //get input
        width = myScanner.nextInt();
        //calculate
        area = (length*width);
        perimeter= (2*length + 2*width);
        //output
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
            }
}



//Paste console output below:
/*
Please enter the length: 
45
Please enter the width: 
60
The length is: 45
The width is: 60
The area is: 2700
The perimeter is: 210


*/
