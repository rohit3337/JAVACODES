import java.util.Scanner;
public class PenGame3 {
    public static int getrandomnumber(int max,int min)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the pen game");
        int pens = getrandomnumber(80,40);
        System.out.println("initial no. of pens: "+pens);
        int picklimit = getrandomnumber(7,3);
        System.out.println("initial pick limit: "+picklimit);
        System.out.println(" do you want to start a game : yes/no");
        String userfirst = sc.nextLine().trim().toLowerCase();
        int userturn = userfirst.equals("yes") ? 1:0;
        while(pens>0)

        {
                if(userturn==1)
                {
                    
                    
                        System.out.println("your turn please choose pens 1 to "+picklimit);
                        int userpick = sc.nextInt();
                        sc.nextLine();
                        if(userpick<1||userpick>picklimit)
                        {
                            System.out.println("invalid input. please choose pens between 1 to "+picklimit);
                        }
                        else if(userpick>picklimit)
                        {
                            
                            System.out.println("Invalid choice. You can't pick more pens than are remaining.");
                        }
                        else
                        {
                            pens = pens-userpick;
                            System.out.println("pens remaining "+pens);
                            userturn=0;
                            picklimit= (picklimit -3 +1 )%5 +3 ;
                        }

                    
                }
                else
                {
                    int computerpick = getrandomnumber(picklimit,1);
                    System.out.println("computer picks "+computerpick);
                    pens = pens - computerpick;
                    System.out.println("remaining pens "+pens);
                    userturn=1;
                    picklimit = (picklimit -3 +1 )%5+3;
                }
        }
        if(userturn==1)
        {
            if(pens==0)
            {
                System.out.println("computer wins");
            }
        }
        else
        {
            if(pens==0)
            {
                System.out.println("you win");
            }
            else
            {
                System.out.println("pick according to remaining pens");
            }
        }

        
    }
}
