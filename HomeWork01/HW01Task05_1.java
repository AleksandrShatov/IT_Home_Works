package HomeWork01;

import java.util.Objects;
import java.util.Scanner;

public class HW01Task05_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scan.nextLine();

        if(Objects.equals("Вася", userName)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }
        if(Objects.equals("Анастасия", userName)){
            System.out.println("Я тебя так долго ждал.");
        }
        if(!Objects.equals("Вася", userName) && !Objects.equals("Анастасия", userName)){
            System.out.println("Добрый день, а вы кто?");
        }

    }
}