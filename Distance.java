import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float g = 9.81f ;
        System.out.println("g=9.81"+"metre/second^2");
        System.out.println("enter time in seconds");
        int t =  sc.nextInt();
        float distance = (float)0.5*g*t*t;
        System.out.println("so, distance of an object = "+distance+" metre" ); 


    }
    
}
