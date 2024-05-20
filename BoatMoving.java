/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BoatMoving
{
    static void MainGrid(int boatY, int boatX, int boatL, int i)
    {
       Scanner kb = new Scanner(System.in);
       
       String[][] mainGrid = new String[10][10];
       String[] sideCoord = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
       
       while(i == 0){
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
                if(b < boatL && b > boatX-1){
                    mainGrid[boatY][b] = "B";
                }
                System.out.print(mainGrid[a][b] + " ");
                }   
                System.out.println();
           }  
           i++;
       }
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int boatY = 0; int boatX = 0; int boatL = 4;
        boolean running = true;
        MainGrid(boatY, boatX, boatL, 0);
        while(running){
            String input = kb.nextLine();
            if(input.equals("w")){
               boatY--;
            }
            else if(input.equals("s")){
               boatY++;
            }
            else if(input.equals("d")){
               boatX++; boatL++;
            }
            else if(input.equals("a")){
                boatX--; boatL--;
            }
            else{
                running = false;
            }
            System.out.println('\u000c');
            MainGrid(boatY, boatX, boatL, 0);
        }
    }
}
