import java.util.Scanner;

class Bar {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String  i; 
        int j = 0;
        
        System.out.print("What character do you want your bar made of? ");
        i  = sc.next();
        System.out.print("How long do you want your bar? ");
        j = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("Here's your bar!");
        
        System.out.println("");
        
        for (int k = 0; k < j; k++) {
            System.out.print(i);
        }
    }
}