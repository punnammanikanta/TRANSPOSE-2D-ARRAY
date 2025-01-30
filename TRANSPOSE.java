import java.util.Scanner;

public class TRANSPOSE{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);{

System.out.print("Enter the number of rows and columns: ");
 int rows = scanner.nextInt();
int cols = scanner.nextInt();
int[][] array = new int[rows][cols];

 System.out.println("Enter elements of the array:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print("Enter element [" + i + "][" + j + "]: ");
 array[i][j] = scanner.nextInt();
 }
 }

 System.out.println(" Array:");
 for (int[] row : array) {
 for (int element : row) {
 System.out.print(element + "\t");
 }
 System.out.println();
 }

 int[][] transpose = new int[cols][rows];
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
transpose[j][i] = array[i][j];
 }
 }

 System.out.println("Transposed Array:");
for (int[] row : transpose) {
 for (int element : row) {
System.out.print(element + "\t");
}
System.out.println();
}

}
}
}

