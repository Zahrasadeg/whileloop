import java.util.Scanner;

public class whileDemo {
    public static void main(String[] args) {
        boolean con=true;
        Scanner scan=new Scanner(System.in);
        int num=15;
        while(con){
            System.out.println("please enter a number between 10 to 20");
            int a=scan.nextInt();
            if(a>num){
                System.out.println("your entered num is greater");
            }else if(a<num){
                System.out.println("your entered number is smaller");
            }else{
                System.out.println("you won!!!");
                con=false;
            }
        }
    }
}
