package Dararya.Laba3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrixes2 {
    public static int[] sort(int[] arr){
        int length = arr.length;
        for(int a =0; a<length; a++){
            for(int b =0; b<(length-1); b++){
                if((arr[b] % 2 == 1) && (arr[b+1] % 2 == 0)){
                    int c = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = c;
                }
            }
        }
//        for(int i=0; i<length; i++){
//            System.out.println(arr[i]);;
//        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter n:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        }
        System.out.println("Before:");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        array = Matrixes2.sort(array);
        System.out.println();
        System.out.println("After:");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}