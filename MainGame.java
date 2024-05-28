/**
 * Battleship game
 *
 * @Huy 
 * @21/05/2024(a version number or a date)
 */
import java.util.Scanner;

public class MainGame
{
    static void Firing(int i, int j)
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
               mainGrid[i][j] = "X";
               System.out.print(mainGrid[a][b] + " ");
                }  
            System.out.println();
           }
    }
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
    static void Moving(int boatY, int boatX, int boatL)
    {
        System.out.println('\u000c');
        
        Scanner kb = new Scanner(System.in);
        boolean running = true;
        
        MainGrid(boatY, boatX, boatL);
        System.out.println("Press P to place the boat once you're ready"); 

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
            //if(input.equals("p")){
                //MainGrid(boatY, boatX, boatL);
               // break;
            //}
            System.out.println('\u000c');
            MainGrid(boatY, boatX, boatL);
            
            System.out.println("Press P to place the boat once you're ready");
        }
    }
    public static void main(String[] args)
    {
        System.out.println('\u000c');
        Scanner kb = new Scanner(System.in);
        String x1;
        boolean shooting = true;
        String[] coord = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k"};
        int a = 0;
        
        System.out.println("Welcome to Battleship!");
        MainGrid(0, 0, 0);
        
        System.out.println("Please select your ship. Press number from 1 - 5 to spawn ships");
        System.out.println("Index: 1 = Destroyer, 2 = Submarine, 3 = Cruiser, 4 = Battleship, 5 = Carrier"); 
        int ans = kb.nextInt();
        if(ans == 1){
            Moving(0,0,5);
        }
        
        while(shooting){
            System.out.println("Please enter your x coord");
            int y = kb.nextInt()-1;
            System.out.println("Please enter your y coord");
            kb.nextLine();
            x1 = kb.nextLine();
            while(!(x1.equals(coord[a]))){
                a++;
            }
            int x = a;
            Firing(x, y);
        }
    }
}

