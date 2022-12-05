package Mohistro.Laba10;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    Matrix(Message message) {
        this.message = message;
        int[] prom = declar();
        this.x = prom[0];
        this.y = prom[1];
        System.out.println(x);
        System.out.println(y);
        matrix = new char[x][y];
    }

    private char[][] matrix;
    private Message message;
    private int x;
    private int y;
    private String code_word1;
    private String code_word2;
    private boolean probel = false;

    public char[][] getMatrix() {
        return matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCode_word1() {
        return code_word1;
    }

    public String getCode_word2() {
        return code_word2;
    }

    public int[] declar() {
        int n = message.getLength();
        int curr = 0;
        boolean size = false;
        ArrayList<Integer> choices = new ArrayList<>(message.getLength());
        System.out.println("Выберите размер матрицы для шифровки вашего сообщения. Подходящие размеры: ");
        for (int i = 3; i < n / 2; i++) {
            if (n % i == 0) {
                size = true;
                System.out.println("Вариант " + (curr + 1) + ": " + i + "x" + n / i);
                choices.add(i);
                choices.add(n / i);
                curr++;
            }
        }
        if (size) {
            System.out.println("Введите цифру: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("Выбран вариант: " + choice);
            choice--;
            int a[] = new int[2];
            a[0] = choices.get(choice * 2);
            a[1] = choices.get(choice * 2 + 1);
            return a;
        } else {
            probel = true;
            while (!size) {
                choices.clear();
                curr = 0;
                System.out.println("Под размер не была подобрана матрица, повторяем с пробелом в конце");
                n++;
                System.out.println(n);
                for (int i = 3; i < n / 2; i++) {
                    if (n % i == 0) {
                        size = true;
                        System.out.println("Вариант " + (curr + 1) + ": " + i + "x" + n / i);
                        choices.add(i);
                        choices.add(n / i);
                        curr++;
                    }
                }
            }
            System.out.println("Введите цифру: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("Выбран вариант: " + choice);
            choice--;
            int a[] = new int[2];
            a[0] = choices.get(choice * 2);
            a[1] = choices.get(choice * 2 + 1);
            return a;
        }

    }
    public void full_massive(){
        System.out.println(probel);
        char[]mess = message.getMessage().toCharArray();
        ArrayList<Character> mess_array = new ArrayList<>(message.getLength()+2);
        for(char c: mess){
            mess_array.add(c);
        }
        System.out.println(message.getLength());
        System.out.println(mess_array);
        int index = 0;
        OUTER: for(int i = 0; i<x; i++){
            for (int j = 0; j<y; j++){
                if((index == message.getLength()) && probel){
                    System.out.println("пробел");
                    matrix[i][j] = ' ';
                    System.out.println();
                    break OUTER;
                }
                matrix[i][j] = mess_array.get(index);
                index++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//    public void declaration(@NotNull Message message) {
//        int n = message.getLength();
//        int curr = 0;
//        boolean size = false;
//        ArrayList<Integer> choices = new ArrayList<Integer>(message.getLength());
//        System.out.println("Выберите размер матрицы для шифровки вашего сообщения. Подходящие размеры: ");
//        for (int i = 1; i < n / 2; i++) {
//            if (n % i == 0) {
//                size = true;
//                System.out.println("Вариант " + (curr + 1) + ": " + i + "x" + n % i);
//                choices.add(i);
//                choices.add(n % i);
//            }
//            curr++;
//        }
//        if (!size) {
//            System.out.println("Под размер не была подобрана матрица, повторяем с пробелом в конце");
//            n++;
//            curr = 0;
//            for (int i = 1; i < n / 2; i++) {
//                if (n % i == 0) {
//                    size = true;
//                    System.out.println("Вариант " + (curr + 1) + ": " + i + "x" + n % i);
//                    choices.add(i);
//                    choices.add(n % i);
//                }
//                curr++;
//            }
//        }
//        System.out.println("Введите цифру: ");
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            int choice = Integer.parseInt(reader.readLine());
//            System.out.println("Выбран вариант: ");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public void insert_keys(){
        boolean correct = false;
        while (!correct){
            System.out.println("Введите первое ключевое слово длинной: " + x);
            try{
                String code_word_before = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                if(code_word_before.length() == x){
                    code_word1 = code_word_before;
                    correct = true;
                    break;
                }
                else {
                    System.out.println("Длина ключевого слова не соответствует длине. Введено букв: " + code_word_before.length());
                    System.out.println("Требуется: " + x);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        correct = false;
        while (!correct){
            System.out.println("Введите второе ключевое слово длинной: " + y);
            try{
                String code_word_before = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                if(code_word_before.length() == y){
                    code_word2 = code_word_before;
                    correct = true;
                    break;
                }
                else {
                    System.out.println("Длина ключевого слова не соответствует длине. Введено букв: " + code_word_before.length());
                    System.out.println("Требуется: " + y);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Message message = new Message();
        Matrix matrix = new Matrix(message);
        matrix.insert_keys();
        System.out.println(matrix.getCode_word1());
        System.out.println(matrix.getCode_word2());
        matrix.full_massive();
    }
}
