package Mohistro.Laba10;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("Выберите режим: 1 для шифрования, 2 для дешифрования, 3 для выхода");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Coder.code();
            } else if (choice == 2) {
                Coder.decode();
            } else {
                run = false;
                break;
            }
        }
    }
}
