import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice, ch;
        double a, b, c;
        
        System.out.println("Wlecom to PythagoreanTheorem");
        
        try{
        do {
        System.out.println("Calculate the side length of a right triangle:");
        System.out.println("You can choice one(1, 2 or 3): ");
        System.out.println("1. Calculate the hypotenuse(c)");
        System.out.println("2. Calculate the right angle side(a)");
        System.out.println("3. Calculate the right angle side(b)");

        choice = keyboard.nextLine();
        
        if (choice.trim().equals("1")) { 
            System.out.print("The length of the right angle side a: ");
            a = keyboard.nextDouble();
            System.out.print("The length of the right angle side b: ");
            b = keyboard.nextDouble();
            c = Math.sqrt(a * a + b * b);
            System.out.println("The length of the hypotenuse is: " + c);
            System.out.print("Do you want to try again(Y/N)?");
            ch = keyboard.next();
            if(ch.toLowerCase().equals( "y")||ch.toLowerCase().equals("yes")){
                choice = "";
                choice = keyboard.nextLine();
            }else{
                break;
            }

        }
        else if ( choice.trim().equals("2") ) {
            System.out.print("The length of the hypotenuse c: ");
            c = keyboard.nextDouble();
            System.out.print("The length of the right angle side b: ");
            b = keyboard.nextDouble();
            a = Math.sqrt(c * c - b * b);
            System.out.println("The length of the right angle side a: " + a);
            System.out.print("Do you want to try again(Y/N)?");
            ch = keyboard.next();
            if(ch.toLowerCase().equals( "y")||ch.toLowerCase().equals("yes")){
                choice = "";
                choice = keyboard.nextLine();
            }else{
                break;
            }
        }
        else if ( choice.trim().equals("3") ) {
            System.out.print("The length of the hypotenuse c: ");
            c = keyboard.nextDouble();
            System.out.print("The length of the right angle side a: ");
            a = keyboard.nextDouble();
            b = Math.sqrt(c * c - a * a);
            System.out.println("The length of the right angle side b: " + b);
            System.out.print("Do you want to try again(Y/N)?");
            ch = keyboard.next();
            if(ch.toLowerCase().equals( "y")||ch.toLowerCase().equals("yes")){
                choice = "";
                choice = keyboard.nextLine();
            }else{
                break;
            }
        }
        else{
            System.out.println("Please input again");
        }
    }
    while ( !choice.trim().equals("1") && !choice.trim().equals("2") && !choice.trim().equals("3") );
    }
    catch(Exception e){
        System.err.println(e);}

    }
}
 
