import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine().toUpperCase();
        input = input.replaceAll("\\s+", ""); 
        String operation = input.substring(0, input.indexOf('('));
        String numbers = input.substring(input.indexOf('(') + 1, input.indexOf(')'));
        String[] nums = numbers.split(",");
        int x1 = Integer.parseInt(nums[0]);
        int x2 = Integer.parseInt(nums[1]);

        int result = 0;

        switch (operation) {
            case "ADD":
                result = x1 + x2;
                break;
            case "SUB":
                result = x1 - x2;
                break;
            case "MUL":
                result = x1 * x2;
                break;
            case "DIV":
                result = x1 / x2;
                break;
            case "POW":
                result = (int) Math.pow(x1, x2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Output: " + result);
    }
}
