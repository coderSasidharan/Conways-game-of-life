
public class Cell {

  int[][] grid;
  int[][] tempgrid = new int[20][20];

  public Cell(int[][] gameBoard) {

    grid = gameBoard;
    
  }


  public int[][] genCells() {

    tempgrid = new int[20][20];
    
    for (int i = 0; i < 20; i++) {
      for(int j = 0; j<20; j++) {

        
        isAliveGen(i,j);


        /*   if (grid[i][j] == 0 && (touchCell(i,j) == 3)){
          grid[i][j] = 1;
        }else if(grid[i][j] == 1 && (touchCell(i,j) == 2 || touchCell(i,j) == 3)){ 
          grid[i][j] = 1;
        }else if(grid[i][j] == 1 && (touchCell(i,j) < 2 || touchCell(i,j) > 3)){ 
          grid[i][j] = 0;
        }*/
      }
    }
    return tempgrid;
  }

  public void isAliveGen(int row, int col){
    int counter = 0;
    for(int k = -1; k<2; k++){
      for(int l = -1; l<2; l++){
        try {
          if((grid[row+k][col+l] == 1)&&((k!=0)||(l!=0))){
            counter++;
          }
        } catch (Exception e){
        }   
      }
    }
    //return counter;
    if(grid[row][col]==0){
          if(counter==3){
            tempgrid[row][col] = 1;
          }else{
            tempgrid[row][col] = 0;
          }
        }else{
          if(counter <= 1){
            tempgrid[row][col] = 0;
          }else if(counter >= 4){
            tempgrid[row][col] = 0;
          }else{
            tempgrid[row][col] = 1;
          }
          
        }
  }
  
/*  public int touchCell(int row, int col) {
    int counter = 0;

    if (row > 0 && row < 19) {
      if (col > 0 && col < 19) {
        if (grid[row-1][col+1] == 1) {
          counter++;
        }
        if (grid[row-1][col-1] == 1) {
          counter++;
        }
        if (grid[row-1][col] == 1) {
          counter++;
        }
        if (grid[row+1][col+1] == 1) {
          counter++;
        }
        if (grid[row+1][col-1] == 1) {
          counter++;
        }
        if (grid[row+1][col] == 1) {
          counter++;
        }
        if (grid[row][col-1] == 1) {
          counter++;
        }
        if (grid[row][col+1] == 1) {
          counter++;
        }
      } else if (col == 0) {
        if (grid[row][col+1] == 1) {
          counter++;
        }
        if (grid[row+1][col+1] == 1) {
          counter++;
        }
        if (grid[row-1][col+1] == 1) {
          counter++;
        }
        if (grid[row-1][col] == 1) {
          counter++;
        }
        if (grid[row+1][col] == 1) {
          counter++;
        }
      } else {
          if (grid[row][col-1] == 1) {
            counter++;
          }
          if (grid[row+1][col-1] == 1) {
            counter++;
          }
          if (grid[row-1][col-1] == 1) {
            counter++;
          }
          if (grid[row-1][col] == 1) {
            counter++;
          }
          if (grid[row+1][col] == 1) {
            counter++;
          }
      }
    } else if(row ==0) { 

        if(col > 0 && col < 19){
          if (grid[row][col-1] == 1) {
            counter++;
          }
          if (grid[row][col+1] == 1) {
            counter++;
          }
          if (grid[row+1][col+1] == 1) {
            counter++;
          }
          if (grid[row+1][col] == 1) {
            counter++;
          }
          if (grid[row+1][col-1] == 1) {
            counter++;
          }
        }else if(col ==0){
          if (grid[row][col+1] == 1) {
            counter++;
          }
          if (grid[row+1][col] == 1) {
            counter++;
          }
          if (grid[row+1][col+1] == 1) {
            counter++;
          }
        }else{
          if (grid[row][col-1] == 1) {
            counter++;
          }
          if (grid[row+1][col] == 1) {
            counter++;
          }
          if (grid[row+1][col-1] == 1) {
            counter++;
          }
            
        }
      
    }else{

      if(col > 0 && col < 19){
        if (grid[row][col-1] == 1) {
          counter++;
        }
        if (grid[row][col+1] == 1) {
          counter++;
        }
        if (grid[row-1][col+1] == 1) {
          counter++;
        }
        if (grid[row-1][col] == 1) {
          counter++;
        }
        if (grid[row-1][col-1] == 1) {
          counter++;
        }     
      }else if(col ==0){
          if (grid[row][col+1] == 1) {
            counter++;
          }
          if (grid[row-1][col] == 1) {
            counter++;
          }
          if (grid[row-1][col+1] == 1) {
            counter++;
          }
        }else{
          if (grid[row][col-1] == 1) {
            counter++;
          }
          if (grid[row-1][col] == 1) {
            counter++;
          }
          if (grid[row-1][col-1] == 1) {
            counter++;
          }
            
        }


      
    }
    return counter;
  }*/
}
