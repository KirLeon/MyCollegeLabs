package Laba4_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrixes1 {
    int[][] scores;
    final int n;
    final int m;
    public Matrixes1(int a, int b){
        n = a;
        m = b;
        scores = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                int prom = (int) (7.4 + Math.random()*4.3);
                if(prom>10){
                    scores[i][j] = prom-3;
                }
                else{
                    scores[i][j] = prom;
                }

            }
        }

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }



    }
    public void check_marks(){
        System.out.println("Otlichniki:");
        for(int i=0; i<n; i++){
            boolean otlichnik = true;
            for(int j = 0; j<m; j++){
                if(scores[i][j]<8){
                    otlichnik = false;
                    break;
                }
            }
            if(otlichnik){
                for(int i1=0; i1<m; i1++){
                    System.out.print(scores[i][i1] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount of students");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter amount of subjects");
        int b = Integer.parseInt(reader2.readLine());
        System.out.println("Ok");
        Matrixes1 matrix1 = new Matrixes1(a, b);
        matrix1.check_marks();



    }
}