
/**
 * Write a description of class CharMatrix here.
 *
 * @author Erica Lee
 * @version Nov 15, 2023
 */
public class CharMatrix{
    //instance variable
    private char[][] grid;
    
    //constructors
    public CharMatrix(int rows, int cols){
        grid = new char[rows][cols];
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                grid[r][c] = ' ';
            }
        }
    }
    public CharMatrix(int rows, int cols, char fill){
        grid = new char[rows][cols];
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                grid[r][c] = fill;
            }
        }
    }
    
    //methods
    public void display(){
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
    }
    public int numRows(){
        return grid.length;
    }
    public int numCols(){
        return grid[0].length;
    }
    public char charAt(int row, int col){
        char character = grid[row][col];
        return character;
    }
    public void setCharAt(int row, int col, char ch){
        grid[row][col] = ch;
    }
    public boolean isEmpty(int row, int col){
        if(grid[row][col] == ' ') return true;
        return false;
    }
    public void fillRect(int row0, int col0, int row1, int col1, char fill){
        for(int r=row0; r<=row1; r++){
            for(int c=col0; c<=col1; c++){
                grid[r][c]=fill;
            }
        }
    }
    public void clearRect(int row0, int col0, int row1, int col1){
        for(int r=row0; r<=row1; r++){
            for(int c=col0; c<=col1; c++){
                grid[r][c]=' ';
            }
        }
    }
    public int countInRow(int row){
        int count=0;
        for(int c=0; c<grid[0].length; c++){
            if(grid[row][c]!=' ') count++;
        }
        return count;
    }
    public int countInCol(int col){
        int count=0;
        for(int r=0; r<grid.length; r++){
            if(grid[r][col]!=' ') count++;
        }
        return count;
    }
}
