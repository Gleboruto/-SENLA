package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controler controler = new Controler();
        Scanner scanner = new Scanner(System.in);
        String answer, string, sss;
        System.out.println("***Введите 0 для выхода из программы***");
        while (true) {
            System.out.print("Введите номер задания: ");
            try {
                int task = scanner.nextInt();
                if (task == 0) {
                    break;
                }
                int variable;
                switch (task) {
                    case 1:
                        System.out.print("Введите число: ");
                        variable = scanner.nextInt();
                        answer = controler.taskOne(variable);
                        System.out.println("Простые числа: " + answer);
                        break;
                    case 2:
                        System.out.print("Введите число: ");
                        variable = scanner.nextInt();
                        answer = String.valueOf(controler.taskTwo(variable));
                        System.out.println("Первые " + variable + " чисел Фибоначчи: " + answer);
                        break;
                    case 3:
                        float x1, x2, y1, y2, a1, a2, b2, b1;
                        System.out.println("Введите числа первой точки первого отрезка:");
                        System.out.print("x1 = ");
                        x1 = scanner.nextInt();
                        System.out.print("y1 = ");
                        y1 = scanner.nextInt();
                        System.out.println("Окей, а теперь второй точки:");
                        System.out.print("x2 = ");
                        x2 = scanner.nextInt();
                        System.out.print("y2 = ");
                        y2 = scanner.nextInt();
                        System.out.println("Отлично! А теперь введите числа первой точки второго отрезка:");
                        System.out.print("a1 = ");
                        a1 = scanner.nextInt();
                        System.out.print("b1 = ");
                        b1 = scanner.nextInt();
                        System.out.println("Супер, а теперь второй точки:");
                        System.out.print("a2 = ");
                        a2 = scanner.nextInt();
                        System.out.print("b2 = ");
                        b2 = scanner.nextInt();
                        float[] Koordinati = {x1, y1, x2, y2, a1, b1, a2, b2};
                        answer = controler.taskThree(Koordinati);
                        break;
                    case 4:
                        int a, b;
                        System.out.print("Введите первое число: ");
                        a = scanner.nextInt();
                        System.out.print("Введите второе число: ");
                        b = scanner.nextInt();
                        answer = Controler.taskFour(a, b);
                        System.out.println(answer);
                        break;
                    case 5:
                        sss = scanner.nextLine();
                        System.out.print("Введите строку для проверки на палиндромность: ");
                        string = scanner.nextLine();
                        answer = Controler.taskFive(string);
                        System.out.println("Палиндромно? Ответ: " + answer);
                        break;
                    case 6:
                        sss = scanner.nextLine();
                        System.out.print("Введите строку для удаления из неё чисел: ");
                        string = scanner.nextLine();
                        answer = controler.taskSix(string);
                        System.out.println("Обработанная строка: " + answer);
                        break;
                }
                System.out.println();
            }catch (NumberFormatException e){
                System.out.println("Возникла ошибка " + e.getMessage());
                System.out.println("Зачем тебе этот символ... Ну теперь пиши всё заново!");
            }
        }
    }
}
