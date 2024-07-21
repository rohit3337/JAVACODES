import java.util.Scanner;
public class EncryptedString {
    public static String EncryptedString(String input)
    {
        int len = input.length();
        char c[] = new char[len];
        int first=0;
        int last = len -1;
        int index=0;
        while(first<=last)
        {
            if(index<len)
            {
                c[index++]=input.charAt(first++);
            }
            if(index<len)
            {
                c[index++]=input.charAt(last--);
            }

        }
        return new String(c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String input = sc.nextLine().toUpperCase();
        System.out.println(EncryptedString(input));
    }
}
