/**
 * Battleship game
 *
 * @Huy 
 * @21/05/2024(a version number or a date)
 */
import java.util.Scanner;

public class MainGame
{
    static void MainGrid(int boatY, int boatX, int boatL)
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
                if(b < boatL && b > boatX-1){
                    mainGrid[boatY][b] = "B";
                }
                System.out.print(mainGrid[a][b] + " ");
                }   
                System.out.println();
       }  
    }
    static void Input(int boatY, int boatX, int boatL)
    {
        System.out.println('\u000c');
        
        Scanner kb = new Scanner(System.in);
        boolean running = true;
        
        MainGrid(boatY, boatX, boatL);
        
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
            MainGrid(boatY, boatX, boatL);
        }
    }
    public static void main(String[] args)
    {
        System.out.println('\u000c');
                
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Welcome to Battleship!");
        MainGrid(0, 0, 0);

        System.out.println("Please select your ship. Press number from 1 - 5 to spawn ships");
        System.out.println("Index: 1 = Destroyer, 2 = Submarine, 3 = Cruiser, 4 = Battleship, 5 = Carrier"); 
        int ans = kb.nextInt();
        switch(ans){
            case 1:
                Input(0, 0, 2);
            case 2:
                Input(0, 0, 2);
            case 3:
                Input(0, 0, 3);
            case 4:
                Input(0, 0, 4);
            case 5:
                Input(0, 0, 5);
        }
    }
}
