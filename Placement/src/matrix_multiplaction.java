import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alpit on 05-09-2017.
 */
public class matrix_multiplaction {
    public static void main(String args[])throws IOException{
        int l=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the row and column");
        int a = Integer.parseInt(obj.readLine());
        int b = Integer.parseInt(obj.readLine());
        int c[][]= new int[a][b];
        int d[][]= new int[a][b];
        int m[][]= new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[i][j] = Integer.parseInt(obj.readLine());
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                d[i][j] = Integer.parseInt(obj.readLine());
            }
        }
        for(int r=0;r<a;r++) {
            for (int n = 0; n < a; n++) {
                for (int p = 0; p < b; p++) {
                    m[r][n] += c[r][p] * d[p][n];
                }

            }
        }
for(int y=0;y<a;y++){
    for(int q=0;q<b;q++){
        System.out.print(m[y][q]+" ");
    }
    System.out.println(" ");
}

    }
}
