import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("please enter a number");
            num=scanner.nextInt();
        }while (num!=5);
    }
}
