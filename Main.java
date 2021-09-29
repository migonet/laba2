package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Напишите функцию, которая принимает целое число минут и преобразует его в секунды.
        System.out.println("Enter the number of hours:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("The time:");
        System.out.println(m1(x));

        //Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков, находите окончательные очки для команды и возвращаете это значение.
        System.out.println("Enter the number of 2s:");
        int x2 = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of 3s:");
        int y2 = new Scanner(System.in).nextInt();
        System.out.println("Team points:");
        System.out.println(m2(x2, y2));

        //Создайте функцию, которая принимает количество побед, ничьих и поражений и вычисляет количество очков, набранных футбольной командой на данный момент.
        System.out.println("Enter the number of wins:");
        int x3 = new Scanner(System.in).nextInt();
        System.out.println("enter the number of draws:");
        int y3 = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of games lost:");
        int z3 = new Scanner(System.in).nextInt();
        System.out.println("The number of points scored by the football team:");
        System.out.println(m3(x3, y3, z3));

        //Создайте функцию, которая возвращает true, если целое число равномерно делится на 5, и false в противном случае
        System.out.println("Enter the number:");
        int x4 = new Scanner(System.in).nextInt();
        System.out.println("An integer evenly divisible by 5:");
        System.out.println(m4(x4));

        //В Java есть логический оператор &&. Оператор && принимает два логических значения и возвращает true, если оба значения истинны.
        System.out.println("Enter the boolean 1:");
        boolean a = new Scanner(System.in).nextBoolean();
        System.out.println("Enter the boolean 2:");
        boolean b = new Scanner(System.in).nextBoolean();
        System.out.println("Both values ​​are True:");
        System.out.println(m5(a, b));

        //У меня есть ведро с большим количеством темно-синей краски, и я хотел бы покрасить как можно больше стен. Создайте функцию, которая возвращает количество полных стен, которые я могу покрасить, прежде чем мне нужно будет отправиться в магазины, чтобы купить еще.
        System.out.println("Enter the square meters:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter the width:");
        int w = new Scanner(System.in).nextInt();
        System.out.println("Enter the height:");
        int h = new Scanner(System.in).nextInt();
        System.out.println("The number of full walls:");
        System.out.println(m6(n, w, h));

        //Исправьте код, чтобы решить эту задачу (только синтаксические ошибки). Посмотрите на приведенные ниже примеры, чтобы получить представление о том, что должна делать эта функция.
        System.out.println("Enter the number:");
        int s = new Scanner(System.in).nextInt();
        System.out.println("Answer:");
        System.out.println(squaed(s));

        //Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает true, если prob * prize > pay; в противном случае возвращает false.
        System.out.println("Enter the prob:");
        float prob = new Scanner(System.in).nextFloat();
        System.out.println("Enter the prize:");
        int prize = new Scanner(System.in).nextInt();
        System.out.println("Enter the pay:");
        int pay = new Scanner(System.in).nextInt();
        System.out.println("prob * prize > pay");
        System.out.println(m8(prob, prize, pay));

        //Создайте метод, который возвращает количество кадров, показанных за заданное количество минут для определенного FPS.
        System.out.println("Enter the min:");
        int x9 = new Scanner(System.in).nextInt();
        System.out.println("Enter the fps:");
        int y9 = new Scanner(System.in).nextInt();
        System.out.println("Сadres:");
        System.out.println(m9(x9, y9));

        //Создайте функцию, которая будет работать как оператор модуля % без использования оператора модуля. Оператор модуля-это способ определения остатка операции деления. Вместо того чтобы возвращать результат деления, операция по модулю возвращает остаток целого числа.
        System.out.println("Enter the number 1:");
        int x1 = new Scanner(System.in).nextInt();
        System.out.println("Enter the number 2:");
        int y1 = new Scanner(System.in).nextInt();
        System.out.println("Remainder of the division:");
        System.out.println(m1(x1, y1));



    }
    public static int m1(int x){
        return x*60;
    }

    public static int m2(int x2, int y2){
        return x2*2 + y2*3;
    }

    public static int m3(int x3, int y3, int z3) {
        return x3 * 3 + y3 * 1 + z3 * 0;
    }

    public static boolean m4(int x4) {
        return x4%5==0;
    }

    public static boolean m5(boolean a, boolean b) {
        return a&&b;
    }

    public static int m6(int n, int w, int h) {
        return n / (w * h);
    }

    public static int squaed(int s) {
        return s * s;
    }

    public static boolean m8(float prob, int prize, int pay) {
        return prob * prize > pay;
    }

    public static int m9(int x9, int y9) {
        return 60*x9*y9;
    }

    public static int m1(int x1, int y1){
        return (x1 - ((x1/y1)*y1));
    }
}
