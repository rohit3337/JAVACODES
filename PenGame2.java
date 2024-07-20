import java.util.Scanner;
public class PenGame2 {
    public static int getrandomnumber(int max,int min){
        return (int)(Math.random()*(max-min+1)+min);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the pen game");
        int pens =getrandomnumber(80,40);
        System.out.println("Initial number of pens: " + pens);
        System.out.print("Do you want to play first? (yes/no): ");
        String userFirst = sc.nextLine().trim().toLowerCase();
        int userturn = userFirst.equals("yes") ? 1 : 0 ;

        while(pens>0){
            if(userturn==1)
            {
                System.out.print("Your turn. Pick 1, 2, or 3 pens: ");
                int userpick = sc.nextInt();
                sc.nextLine();
                if(userpick<1||userpick>3)
                {
                    System.out.println("Invalid choice. You must pick 1, 2, or 3 pens");
                }
                else if(userpick>pens)
                {
                    System.out.println("nvalid choice. You can't pick pens more than remaining pens");
                }
                else
                {
                    pens = pens-userpick;
                    System.out.println("remaining pens " + pens);
                    userturn = 0;
                }
            }
            else
            {
                int computerpick = (pens % 4 == 0) ? 1 : pens % 4;
                System.out.println("computer picks " + computerpick);
                pens = pens-computerpick;
                System.out.println("rermaining pens " + pens);
                userturn = 1;
               
            }

        }
        if (userturn==1) 
        {
            if(pens==0)
            {
            System.out.println("Computer wins!");
            }
           
        } 
        else
        {
            if(pens==0)
           { System.out.println("You win!");
           }
           else 
           {
            System.out.println("pick according to remaining pens");
           }
       }
        

    }
}
