import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0 ;
        for(int i = 1; i<= a; i++) {
            if (  i % 2 != 0 ) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
