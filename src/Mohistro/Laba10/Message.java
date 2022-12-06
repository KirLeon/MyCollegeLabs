package Mohistro.Laba10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Message {
    public Message() {
        System.out.println("Введите сообщение для шифровки, используя русские буквы. Текст не должен содержать цифр");
        this.message = read_message();
        this.length = this.message.length();
//        System.out.println("Введите ключевое слово 1 , используя русские буквы. Текст не должен содержать цифр");
//        this.code_word1 = read_message();
//        System.out.println("Введите ключевое слово 2, используя русские буквы. Текст не должен содержать цифр");
//        this.code_word2 = read_message();
    }

    public Message(int a) {
        System.out.println("Введите зашифрованное слово, используя русские буквы. Текст не должен содержать цифр");
        this.coded_message = read_message();
//        System.out.println("Введите ключевое слово 1 , используя русские буквы. Текст не должен содержать цифр");
//        this.code_word1 = read_message();
//        System.out.println("Введите ключевое слово 2, используя русские буквы. Текст не должен содержать цифр");
//        this.code_word2 = read_message();
    }

    private String code_word1;
    private String code_word2;
    private String message;
    private String coded_message;
    private int length;

    public String getCoded_message() {
        return coded_message;
    }


    public int readKey() {
        Scanner scanner = new Scanner(System.in);
        int curr_key = scanner.nextInt();
        if (curr_key > 0 && curr_key < 32) {
            System.out.println("Ключ получен и передан для обработки");
            return curr_key;
        } else {
            System.out.println("Ключ введён некорректно. Допустимые значения: от 1 до 31. Введено: " + curr_key);
            System.out.println("Попробуйте снова");
            return 0;
        }
    }

    public String getCode_word1() {
        return code_word1;
    }

    public String getCode_word2() {
        return code_word2;
    }

    public String getMessage() {
        return message;
    }

    public int getLength() {
        return length;
    }

    public String read_message() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            if (str != null) {
                char[] char_arr = str.toCharArray();
                for (char c : char_arr) {
                    if (Character.isDigit(c)) {
                        System.out.println("Шифр работает только с текстом. Во введённой строке встречено значение: " + c);
                        return "";
                    }
                }
                str = str.toLowerCase();
                System.out.println("Сообщение получено и передано для обработки");
                return str;
            } else {
                System.out.println("Текст введён некорректно. Попробуйте снова");
                return "";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}