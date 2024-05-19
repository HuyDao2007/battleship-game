/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MainGrid
{
    static void MainGrid()
    {
       Scanner kb = new Scanner(System.in);
        
        String[][] mainGrid = new String[10][10];
        String[] sideCoord = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
        
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
                if(b < 4){
                    mainGrid[0][b] = "B";
                }
                if(b < 5){
                    mainGrid[1][b] = "C";
                }
                if(b < 3){
                    mainGrid[2][b] = "C";
                }
                if(b < 2){
                    mainGrid[3][b] = "S";
                }
                if(b < 2){
                    mainGrid[4][b] = "D";
                }
                System.out.print(mainGrid[a][b] + " ");
            }
            System.out.println();
       } 
    }
    public static void main(String[] args)
    {
        
    }
}
