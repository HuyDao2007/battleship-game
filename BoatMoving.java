/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BoatMoving
{
    static void MainGrid()
    {
       Scanner kb = new Scanner(System.in);
       
       boolean running = true;
       
       String[][] mainGrid = new String[10][10];
       String[] sideCoord = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
       
       int boatX = 4;
       int boatY = 0;
       int x = 0;
       while(running){
           System.out.print(" ");
           for(int a = 0; a < 10; a++)
           {
            System.out.print(a+1 + " ");
           }
           System.out.println();
           for(int a = 0; a < 10; a++)
           {
                System.out.print(sideCoord[a] + " ");
                for(int b = 0; b < 10; b++)
                {
                mainGrid[a][b] = ".";
                if(b > x && b < boatX+1){
                    mainGrid[boatY][b] = "B";
                }
                System.out.print(mainGrid[a][b] + " ");
                }   
                System.out.println();
           }  
           String input = kb.nextLine();
           if(input.equals("s")){
               boatY += 1;
           }
           else if(input.equals("w")){
               boatY -= 1;
           }
           else if(input.equals("d")){
               boatX += 1;
               x++;
           }
           else if(input.equals("a")){
               boatX -= 1;
               x--;
           }
           System.out.println('\u000c');
       }
    }
    public static void main(String[] args)
    {
        MainGrid();
    }
}