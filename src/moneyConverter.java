import java.util.Scanner;

public class moneyConverter {
    public static void main(String[] args){
        final int rate = 23000;
        float dollar, vnd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter money in US dollars: ");
        dollar = sc.nextFloat();
        if (dollar <= 0){
            System.out.println("Invalid input");
        } else {
            vnd = dollar * rate;
            System.out.printf("The equivalent amount in VND is: " + vnd);
        }
    }
}
