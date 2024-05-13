    
/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainGrid
{
    public static void main(String[] args)
    {
        String[][] mainGrid = new String[10][10];
        String[] sideCoord = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K"};
        String[][] Battleship = new String[1][5];
        
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
                mainGrid[a][b] = "o";
                System.out.print(mainGrid[a][b] + " ");
            }  
            System.out.println();
        }
    }
}
