import java.util.Scanner;

public class Nim{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sticks do you want to use?");
        int sticks = scanner.nextInt();
        boolean user = true;
        int choice = 10;

        while (sticks>1) {
            
                user = true;
                choice = 3;

                    while (choice != 2 && choice != 1)  {
                        if (sticks>2){
                            System.out.println("Do you want to take 1 or 2 sticks? There are "+sticks+" remaining");
                            choice = scanner.nextInt();
                            if (choice == 1 || choice ==2) {
                                sticks = sticks-choice;
                                System.out.println("There are "+sticks+" sticks remaining");
                                if (sticks == 1){
                                    user = false;
                                    break;}
                                }
                            else {
                                System.out.println("Pick 1 or 2");}
                }
                        else{
                            System.out.println("As there are only two sticks left, you pick one stick");
                            user = false;
                            sticks = sticks-1;
                            break;
                }
            
                if (sticks > 3) {

                    if (Math.random() > 0.5) {
                        System.out.println("The computer picked two sticks. There are "+(sticks-2)+" sticks remaining");
                        sticks = sticks-2; 
                    
                }   else {
                        System.out.println("The computer picked one stick. There are "+(sticks-1)+" sticks remaining");
                        sticks = sticks-1; } }
                else {
                    user = true;
                    if (sticks == 3) {
                        System.out.println("The computer picked two sticks. There is one stick remaining"); 
                        sticks = sticks-2;}
                    else { 
                        System.out.println("The computer picked one stick. There is one stick remaining"); 
                        sticks = sticks-1; }}
                    }
                     
                }    
        if (user){
            System.out.println("There is one stick remaining! You lost");
        }
        else {
            System.out.println("There is one stick remaining! You Win");
        }
        
        
        
        
    }
}