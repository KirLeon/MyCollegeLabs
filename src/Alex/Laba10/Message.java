package Alex.Laba10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Message {

    public Message() {
        System.out.println("Введите сообщение для шифровки, используя русские буквы. Текст не должен содержать цифр");
        this.message = read_message();
        System.out.println("Введите ключевое слово, используя русские буквы. Текст не должен содержать цифр");
        this.code_word = read_message();
        System.out.println("Введите ключ для шифровки в диапазоне от 1 до 31");
        this.key = readKey();
    }
    public Message(int a){
        System.out.println("Введите зашифрованное слово, используя русские буквы. Текст не должен содержать цифр");
        this.coded_message = read_message();
        System.out.println("Введите ключевое слово, используя русские буквы. Текст не должен содержать цифр");
        this.code_word = read_message();
        System.out.println("Введите ключ для дешифровки в диапазоне от 1 до 31");
        this.key = readKey();
    }

    private String code_word;
    private String message;
    private int key;
    private String coded_message;

    public String getCoded_message() {
        return coded_message;
    }

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }

    public String getCode_word() {
        return code_word;
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

    public String read_message() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            if (str != null) {
                char[] char_arr = str.toCharArray();
                for (char c : char_arr) {
                    if (Character.isDigit(c)) {
                        System.out.println("Шифр Цезаря работает только с текстом. Во введённой строке встречено значение: " + c);
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

    public static void main(String[] args) {
        char[] array = new char[]{'b', 'b', 'd'};
        System.out.println(array);
    }
}
