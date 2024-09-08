// RockPaperScissor Game
package _01_Basic;
import java.util.Random;
import java.util.Scanner;
public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        
        // to generate random numbers between 1&4 (4 not included)
        int randNum=rand.nextInt(1, 4);
        System.out.println("Enter a no. :\n   1.Rock\n   2.Paper\n   3.Scissor");
        int user=sc.nextInt();
        

        switch (user) {
            case 1:
                if(randNum==3){
                    System.out.println("Win");
                }
                else if(randNum==2){
                    System.out.println("Loss");
                }
                else{
                    System.out.println("Tie");
                }
                System.out.println("against "+randNum);
                break;

                case 2:
                if(randNum==1){
                    System.out.println("Win");
                }
                else if(randNum==3){
                    System.out.println("Loss");
                }
                else{
                    System.out.println("Tie");
                    
                }
                System.out.println("against "+randNum);
                break;

                case 3:
                if(randNum==2){
                    System.out.println("Win");
                }
                else if(randNum==1){
                    System.out.println("Loss");
                }
                else{
                System.out.println("Tie");
            }
            System.out.println("against "+randNum);
            break;

            default:
            System.out.println("Enter a valid no !");
            break;
        }
        sc.close();
       
    }
}
