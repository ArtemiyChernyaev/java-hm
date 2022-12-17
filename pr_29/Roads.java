package pr_29;
import java.util.Scanner;

public class Roads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a matrix size: ");

        int num = sc.nextInt();
        int[][] matrix = new int[num][num];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("(" + i + ";" + j + ") = " );
                matrix[i][j] = sc.nextInt();
            }
        }

        int roads_num = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                if (matrix[i][j] == 1)
                    roads_num += 1;
            }
        }
        System.out.println(roads_num );
        sc.close();
    }
}
