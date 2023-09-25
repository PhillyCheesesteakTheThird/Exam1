import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use summer?");
        String newNumber = scanner.nextLine().toLowerCase();
        if (newNumber.equals("y") ){
            Summer.summerRunner();}
        }
    public static void summerRunner() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        System.out.println("Give me a number");
        int startNum = scanner.nextInt();

        while(isTrue) {
            System.out.println("Give me a number");
            int num = scanner.nextInt();
            int endNum = startNum + num;
            startNum = endNum;
            System.out.println("Those numbers summed together are: \n"+endNum);
            isTrue =  (num !=0);
        }
    }
}
