import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        for(int i = 0; i < height ; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < width ; j++)
            {
                System.out.print("* " );
            }
        }

    }
}
