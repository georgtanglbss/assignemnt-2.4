import java.util.Scanner;

class RunningTally {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        
        for(int input = 0;input >=0;input = sc.nextInt()){
            System.out.print("Add: ");
            if (input >= 0) {
                total = total + input;   
            }
        }
        System.out.println("Your total is " + total + ".");
    }
}