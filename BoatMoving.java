/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BoatMoving
{
    static void MainGrid(int boatY1, int boatX1, int boatL1, int boatY2, int boatX2, int boatL2, int r)
    {       
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
                if(b < boatL1 && b > boatX1-1 && r == 0){
                    mainGrid[boatY1][b] = "B";
                }
                if(a < boatL2 && a > boatY2-1 && r == 1){
                    mainGrid[a][boatX2] = "B";
                }
                System.out.print(mainGrid[a][b] + " ");
                }   
                System.out.println();
       }  
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int boatY1 = 0; int boatX1 = 0; int boatL1 = 4; int r = 0;
        int boatY2 = 0; int boatX2 = 0; int boatL2 = 4;
        boolean running = true; 
        MainGrid(0, 0, 4, 0, 0, 4, r);
        while(running){
            String input = kb.nextLine(); 
            if (input.equals("r")){
                r=0;
            }   
            else if(input.equals("t")) {
                r=1;
            }
            
            if(input.equals("w") && r==1){
                  boatY2--; boatL2--;
                }
            else if(input.equals("s") && r==1){
                   boatY2++; boatL2++;
                }
            else if(input.equals("d") && r==1){
                   boatX2++; 
                }
            else if(input.equals("a") && r==1){
                    boatX2--; 
                }
            if(input.equals("w") && r==0){
                  boatY1--;
                }
            else if(input.equals("s") && r==0){
                   boatY1++; 
                }
            else if(input.equals("d") && r==0){
                   boatX1++; boatL1++;
                }
            else if(input.equals("a") && r==0){
                    boatX1--; boatL1--;
                }
                System.out.println('\u000c');
            MainGrid(boatY1, boatX1, boatL1, boatY2, boatX2, boatL2, r);
        }
    }
}