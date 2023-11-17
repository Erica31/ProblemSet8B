
/**
 * Write a description of class CharMatrixDriver here.
 *
 * @author Erica Lee
 * @version Nov 15, 2023
 */
public class CharMatrixDriver{
       public static void main (String[] args) {

      System.out.println("Create a CharMatrix filled with m's ...");
      CharMatrix matrix = new CharMatrix(5, 4, 'A');
      matrix.display();

      System.out.println("Testing setCharAt ...");
      System.out.println("  CharMatrix before method call:");
      matrix.display();
      
      System.out.println(matrix.charAt(2,1));
      
      matrix.setCharAt(0, 0, 'k');
      matrix.fillRect(1, 1, 3, 3, 'D');
      matrix.clearRect(1, 0, 2, 3);
      
      
      System.out.println("  CharMatrix after method call:");
      matrix.display();
      
      System.out.println(matrix.countInRow(1));
      System.out.println(matrix.countInCol(1));
      System.out.println(matrix.isEmpty(0,1));
        
   } 

}
