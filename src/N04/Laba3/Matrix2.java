package N04.Laba3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n>1){
            int[][] matr = new int[n][n];
            for(int i = 0; i<n; i++){
                for (int j = 0; j<n; j++){
                    matr[i][j] = (int) (Math.random()*11);
                    System.out.print(matr[i][j] + " ");
                }
                System.out.println();
            }
            int sum = 0;
            for(int i = 0; i<n; i++){
                for (int j = 0; j<n; j++){
                    if((i == j) || ((i+j+1) == n)){
                        sum+= matr[i][j];
                    }
                }
            }
            System.out.println("Result is: " + sum);
        }
        else if(n==0){
            System.out.println("Result is: " + 0);
        }
        else{
            System.out.println("Error: n < 0");
        }

    }
}
