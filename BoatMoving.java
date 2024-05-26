/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class BoatMoving
{
    static void MainGrid(int boatY, int boatX, int boatL, int r)
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
                if(b < boatL && b > boatX-1 && r == 0){
                    mainGrid[boatY][b] = "B";
                }
                if(a < boatL && a > boatY-1 && r == 1){
                    mainGrid[a][boatX] = "B";
                }
                System.out.print(mainGrid[a][b] + " ");
                }   
                System.out.println();
       }  
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int boatY = 0; int boatX = 0; int boatL = 4; int r = 0;
        boolean running = true; 
        MainGrid(boatY, boatX, boatL, r);
        while(running){
            String input = kb.nextLine(); 
            if (input.equals("r")){
                r=0;
            }   
            else if(input.equals("t")) {
                r=1;
            }
            if(input.equals("w") && r==1){
                  boatY--; boatL--;
                }
            else if(input.equals("s") && r==1){
                   boatY++; boatL++;
                }
            else if(input.equals("d") && r==1){
                   boatX++; 
                }
            else if(input.equals("a") && r==1){
                    boatX--; 
                }
            if(input.equals("w") && r==0){
                  boatY--;
                }
            else if(input.equals("s") && r==0){
                   boatY++; 
                }
            else if(input.equals("d") && r==0){
                   boatX++; boatL++;
                }
            else if(input.equals("a") && r==0){
                    boatX--; boatL--;
                }
                System.out.println('\u000c');
            MainGrid(boatY, boatX, boatL, r);
            }
    }
}

