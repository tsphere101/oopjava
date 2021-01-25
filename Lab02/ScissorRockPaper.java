import java.util.Scanner;
import java.lang.Math;
public class ScissorRockPaper {
    public static void main(String[] args) {
        int computer = 0;
        int player = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");

        computer = (int)(Math.random() * 3);
        player = sc.nextInt();

        sc.close();

        if(computer == 0)
        {
            if (player == 0)
            {
                System.out.println("Computer is Scissor. You are Scissor too. It is a draw");
            }
            else if (player == 1)
            {
                System.out.println("Computer is Scissor. You are Rock. You won");
            }
            else 
            {
                System.out.println("Computer is Scissor. You are Paper. You lose");
            }
        }
        if(computer == 1)
        {
            if (player == 0)
            {
                System.out.println("Computer is Rock. You are Scissor. You lose");
            }
            else if (player == 1)
            {
                System.out.println("Computer is Rock. You are Rock too. It is a draw");
            }
            else 
            {
                System.out.println("Computer is Rock. You are Paper. You won");
            }
        }
        if(computer == 2)
        {
            if (player == 0)
            {
                System.out.println("Computer is Paper. You are Scissor. You won");
            }
            else if (player == 1)
            {
                System.out.println("Computer is Paper. You are Rock. You lose");
            }
            else 
            {
                System.out.println("Computer is Paper. You are Paper too. It is a draw");
            }
        }

    }
}
