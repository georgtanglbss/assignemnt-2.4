import java.util.Scanner;

class D6 {

    public static void main (String[] args) {
        
    
        Scanner sc  = new Scanner(System.in);
        int num = 0;
        int value = 0;
        int total   = 0;
        String ans  = "yes";
        while (ans.equals("yes")) {
        System.out.print("How many D6's do you want to roll? ");
            num = sc.nextInt();
            
        System.out.print("You rolled: ");
        for (int i = 0; i < num; i++) {
            value = (int) (Math.random()*6)+1;
            total = total + value;
            System.out.print(value);
        }
        System.out.println("");
        System.out.println("Total:"+ total);
        System.out.println("");
        
        System.out.print("Again? [yes,no] ");
        ans = sc.next();
        }
        if(ans!= "yes"){
            System.out.println("Goooood-byeeee!");
        }
    }
}