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
    public static void Input(int i)
    {
        Scanner kb = new Scanner(System.in);
        int boatY = 0; int boatX = 0; int boatL = 4; int r = 0;
        boolean running = true; 
        while(running){
            if (i==1){
                r=1;
                String input = kb.nextLine(); 
                if(input.equals("w")){
                  boatY--; boatL--;
                }
                else if(input.equals("s")){
                   boatY++; boatL++;
                }
                else if(input.equals("d")){
                   boatX++; 
                }
                else if(input.equals("a")){
                    boatX--; 
                }
            }
            if(i==0)
            {
                r=0;
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
            }
            System.out.println('\u000c');
            MainGrid(boatY, boatX, boatL, r);
            }
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean running = true;
        int boatY = 0; int boatX = 0; int boatL = 4; int r = 0; int i = 0;
        MainGrid(boatY, boatX, boatL, r);
        String input = kb.nextLine();
        if(input.equals("r")){
                i=0;
        }
        else if(input.equals("t")){
                i=1;
            }
        Input(i);
        }   
    }


