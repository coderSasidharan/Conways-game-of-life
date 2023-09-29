import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception{
    
    System.out.println("\nConway's Game of Life\n\n");
    System.out.println("Enter File Name: ");

    Scanner input = new Scanner(System.in);
    File file = new File(input.nextLine());
    Scanner scanner = new Scanner(file);
    System.out.println("Enter the number of generations: ");
    int numGen = input.nextInt();
    
    int[] gridX = new int[100];
    int[] gridY = new int[100];
    int x = 0;
    int y = 0;

    
    for(int i = 0; i<100; i++){
      if(scanner.hasNext()){
        gridX[i] = scanner.nextInt();
        gridY[i] = scanner.nextInt();
      }
    }
    
    Gameboard initial = new Gameboard(gridX,gridY);

    for(int i = 0; i<numGen;i++){
      Thread.sleep(1000);
      Cell newGame = new Cell(initial.returnGrid());
      Gameboard nextGame  = new Gameboard(newGame.genCells());
      initial = nextGame;

    }
    
  }
}
