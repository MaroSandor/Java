package RoShamBo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void RoShamBo()
    {
        String player = "";
        String computer = "";

        Scanner sc = new Scanner(System.in);

        int playerScore=0;
        int computerScore=0;

        while(!(player=sc.nextLine()).equals("vege"))
        {
            Random rnd = new  Random();
            int p2 = rnd.nextInt(3);

            switch (p2)
            {
                case 0 -> computer = "ko";
                case 1 -> computer = "papir";
                case 2 -> computer = "ollo";
            }

            System.out.println("A gép választása: " + computer);

            if (player.equals("ko") && computer.equals("papir"))
            {
                computerScore++;
            }
            else if (player.equals("ko") && computer.equals("ollo"))
            {
                playerScore++;
            }

            if (player.equals("papir") && computer.equals("ko"))
            {
                playerScore++;
            }
            else if (player.equals("papir") && computer.equals("ollo"))
            {
                computerScore++;
            }

            if (player.equals("ollo") && computer.equals("ko"))
            {
                computerScore++;
            }
            else if (player.equals("ollo") && computer.equals("papir"))
            {
                playerScore++;
            }
        }

        System.out.println();
        System.out.println("Pontszámok:");
        System.out.println("Játékos: " + playerScore++);
        System.out.println("Gép: " + computerScore++);
        System.out.println();

        if (playerScore>computerScore)
        {
            System.out.println("A felhasználó nyert");
        }
        else if(computerScore>playerScore)
        {
            System.out.println("A gép nyert");
        }
        else
        {
            System.out.println("Döntetlen.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        RoShamBo();
    }
}