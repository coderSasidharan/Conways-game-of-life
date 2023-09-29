
public class Gameboard {
  int[][] grid = new int[20][20];
  int alive = 0;
  
  public Gameboard(int[] gridX, int[] gridY) {
    System.out.print("\033[H\033[2J");
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
        grid[i][j] = 0;
      }
    }
    
    for (int i = 0; i < 100; i++) {
      grid[gridX[i] - 1][gridY[i] - 1] = 1;
    }
    System.out.println("   1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20");
    for(int i = 0; i<20; i++){
      if (i < 9) {
        System.out.print(" " + (i+1) + " ");
      } else {
        System.out.print((i+1) + " ");
      }
      for(int j = 0; j<20; j++){
        if(grid[i][j] == 0) {
          System.out.print("   ");
        } else {
          System.out.print("*  ");
          alive = alive + 1;
        }
      }
      System.out.println();
    }
    System.out.println("Amount alive: " + alive);
    System.out.println("Amount alive in row 10: " + totalRow(grid,10));
    System.out.println("Amount alive in column 10: " + totalColumn(grid,10));


    
  }

  public Gameboard(int[][] newGrid) {
    System.out.print("\033[H\033[2J");

    grid = newGrid;

    System.out.println("   1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20");
    for(int i = 0; i<20; i++){
      if (i < 9) {
        System.out.print(" " + (i+1) + " ");
      } else {
        System.out.print((i+1) + " ");
      }
      for(int j = 0; j<20; j++){
        if(grid[i][j] == 0) {
          System.out.print("   ");
        } else {
          System.out.print("*  ");
          alive = alive + 1;
        }
      }
      System.out.println();
    }
    System.out.println("Amount alive: " + alive);
    System.out.println("Amount alive in row 10: " + totalRow(grid,10));
    System.out.println("Amount alive in column 10: " + totalColumn(grid,10));
    
  }

  public int totalRow(int[][] grid, int row){
    int counter = 0;
    for(int i = 0; i<20; i++){
      if(grid[row-1][i] == 1){
        counter++;
      }
    }
    return counter;
  }

  public int totalColumn(int[][] grid, int col) {
    int counter = 0;
    for(int i = 0; i < 20; i++) {
      if (grid[i][col-1] == 1) {
        counter++;
      }
    }
    return counter;
  }

  public int[][] returnGrid() {
    return grid;
  }


}
