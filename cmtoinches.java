import java.util.Scanner;

public class cmtoinches
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Centi-meters");
        double cm = sc.nextInt();
        double R= cm/2.54;
        System.out.println( cm+"CM=  "+ R+"Inc");

    }
}

