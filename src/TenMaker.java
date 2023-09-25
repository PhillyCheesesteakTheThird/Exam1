import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your first number!");
        int firstNum = scanner.nextInt();
        System.out.println("Give me your second number!");
        int secondNum = scanner.nextInt();
        if (makes10(firstNum, secondNum)){
            System.out.println("The numbers you inputted (" + firstNum + ", " + secondNum + ") equal ten when added!");
        }
        else {
            System.out.println("The numbers you inputted (" + firstNum + ", " + secondNum + ") do not equal ten when added!");
        }
    }
    public static boolean makes10(int firstNum, int secondNum) {
        return (firstNum + secondNum) == 10;
    }
}
