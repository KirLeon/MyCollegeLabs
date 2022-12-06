package Mohistro.Laba10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    Matrix(Message message) {
        this.message = message;
        declar();
        matrix = full_massive();
        insert_keys();
        full_code_matr();
    }

    Matrix() {
        System.out.println("Введите зашифрованное письмо");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            coded = reader.readLine();
            System.out.println("Введите первое ключевое слово: ");
            code_word1 = reader.readLine();
            x = code_word1.length();
            System.out.println("Введите второе ключевое слово: ");
            code_word2 = reader.readLine();
            y = code_word2.length();
            coded_matrix = new char[x][y];
            matrix = new char[x][y];
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private char[][] matrix;
    private Message message;
    private int x;
    private int y;
    private String code_word1;
    private String code_word2;
    private boolean probel = false;
    private char[][] coded_matrix;
    private String coded;

    public void switch_columns() {
        char[] ch = code_word2.toCharArray();
        System.out.println("Меняем местами столбцы");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    char sw = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = sw;
                    for (int f = 0; f < x; f++) {
                        char switch_char = coded_matrix[f][j];
                        coded_matrix[f][j] = coded_matrix[f][j + 1];
                        coded_matrix[f][j + 1] = switch_char;
                    }
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(coded_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void switch_rows() {
        System.out.println("Меняем местами строки");
        char[] code_word = code_word1.toCharArray();
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < x - 1; b++) {
                if (code_word[b] > code_word[b + 1]) {
                    char switch_1 = code_word[b + 1];
                    code_word[b + 1] = code_word[b];
                    code_word[b] = switch_1;
                    char[] switch_char_arr = coded_matrix[b];
                    coded_matrix[b] = coded_matrix[b + 1];
                    coded_matrix[b + 1] = switch_char_arr;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(coded_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Character> full_arr(String s) {
        ArrayList<Character> ar = new ArrayList<>(70);
        for (int i = 0; i < s.length(); i++) {
            ar.add(s.charAt(i));
        }
        return ar;
    }

    public void normalize_arr() {
        ArrayList<Character> coded_word_orig1 = full_arr(code_word1);
        ArrayList<Character> coded_word_orig2 = full_arr(code_word2);
        ArrayList<Character> coded_word1 = str_to_char_arr(code_word1);
        ArrayList<Character> coded_word2 = str_to_char_arr(code_word2);
        for (int i = 0; i < x; i++) {
            int n = coded_word_orig1.indexOf(coded_word1.get(i));
            coded_word_orig1.set(n, '?');
            matrix[n] = coded_matrix[i];
        }

        System.out.println("Дешифруем строки");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Дешифруем столбцы");

        char[][] matrix_prom = new char[x][y];

        for (int i = 0; i < y; i++) {
            int n = coded_word2.indexOf(coded_word_orig2.get(i)); //3
            coded_word2.set(n, '?');
            for (int j = 0; j < x; j++) {
                matrix_prom[j][i] = matrix[j][n];
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix_prom[i][j] + " ");
            }
            System.out.println();
        }
        StringBuilder sb = new StringBuilder(70);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sb.append(matrix_prom[i][j]);
            }
        }
        System.out.println("Расшифровано: " + sb);

    }

    public ArrayList<Character> str_to_char_arr(String s) {
        ArrayList<Character> ar = new ArrayList<>(70);
        char[] a1 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ar.add(s.charAt(i));
            a1[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int a = 0; a < s.length() - 1; a++) {
                if (ar.get(a) > ar.get(a + 1)) {
                    char sw = ar.get(a);
                    ar.set(a, ar.get(a + 1));
                    ar.set(a + 1, sw);
                }
            }
        }
        return ar;
    }

    public void arr_to_str() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sb.append(coded_matrix[i][j]);
            }
        }
        System.out.println("Результат шифровки: " + sb);
    }

    public int declar() {
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
            x = choices.get(choice * 2);
            y = choices.get(choice * 2 + 1);
            matrix = new char[x][y];
            coded_matrix = new char[x][y];
            return 0;
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
            x = choices.get(choice * 2);
            y = choices.get(choice * 2 + 1);
            matrix = new char[x][y];
            coded_matrix = new char[x][y];
            return 0;
        }
    }

    public void full_code_matr() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                coded_matrix[i][j] = matrix[i][j];
                System.out.print(coded_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char[][] full_massive() {
        char[] mess = message.getMessage().toCharArray();
        ArrayList<Character> mess_array = new ArrayList<>(message.getLength() + 2);
        for (char c : mess) {
            mess_array.add(c);
        }
        int index = 0;
        OUTER:
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((index == message.getLength()) && probel) {
                    System.out.println("пробел");
                    matrix[i][j] = ' ';
                    break OUTER;
                }
                matrix[i][j] = mess_array.get(index);
                index++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    //
    public void insert_keys() {
        boolean correct = false;
        while (!correct) {
            System.out.println("Введите первое ключевое слово длинной: " + x);
            try {
                String code_word_before = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                if (code_word_before.length() == x) {
                    code_word1 = code_word_before;
                    correct = true;
                    break;
                } else {
                    System.out.println("Длина ключевого слова не соответствует длине. Введено букв: " + code_word_before.length());
                    System.out.println("Требуется: " + x);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        correct = false;
        while (!correct) {
            System.out.println("Введите второе ключевое слово длинной: " + y);
            try {
                String code_word_before = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                if (code_word_before.length() == y) {
                    code_word2 = code_word_before;
                    correct = true;
                    break;
                } else {
                    System.out.println("Длина ключевого слова не соответствует длине. Введено букв: " + code_word_before.length());
                    System.out.println("Требуется: " + y);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ключи приняты");
    }

    public void code_to_arr() {
        int index = 0;
        OUTER:
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //if(index==coded.length()) break OUTER;
                coded_matrix[i][j] = coded.charAt(index);
                index++;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(coded_matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

}
