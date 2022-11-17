import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 2.6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * +e));
        result = -1 * result;
        System.out.println(result);
        System.out.println("Задача 2.7");
        int a1 = 5;
        int b2 = 7;
        a1 = a1 + b2 - a1;
        System.out.println(a1);
        a1 = 5;
        b2 = (a1 + b2) - b2;
        System.out.println(b2);
        System.out.println("Задача 2.8");
        int a8 = 259;
        int b8 = a8 / 10 % 10;
        System.out.println(b8);
        System.out.println("Задача 3.6");
        int age = 19;
        int salary = 50_000;
        double creditLimit = 0;
        if (age < 23) {
            creditLimit = salary * 2;
        }
        if (age >= 23) {
            creditLimit = salary * 3;
        } else if (salary >= 50_000) ;
        {
            creditLimit = creditLimit * 1.2;
        }
        if (salary > 80) {
            creditLimit = creditLimit * 1.5;
        }
        System.out.println(creditLimit);


        System.out.println("Задача 4.4");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ":ping");
            }
            if (i % 5 == 0) {
                System.out.println(i + ":pong");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":ping pong");
            } else {
                System.out.println(i + ":");
            }
        }
        System.out.println("Задача 5.5");
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[1][0] = 0;
        array[1][1] = 1;
        array[1][2] = 0;
        array[2][0] = 0;
        array[2][1] = 0;
        array[2][2] = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Задача 5.6");
        int[] f = {5, 4, 3, 2, 1};
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        for (int i = f.length - 1; i >= 0; i--) {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        System.out.println("Задача 5.7");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        System.out.println("Задача 6.5, 6.6");
        String fullName = " ivanov ivan ivanovich";
        String upperCaseLine = "";
        Scanner lineScan = new Scanner(fullName);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println("ФИО " + upperCaseLine);
        String[] words = upperCaseLine.split(" ");
        String fN = words[1];
        String mN = words[2];
        String lN = words[0];
        System.out.println("Имя сотрудника - " + fN);
        System.out.println("Фамилия сотрудника - " + lN);
        System.out.println("Отчество сотрудника - " + mN);
        System.out.println("Задача 6,7");
        String numbers1 = "135";
        StringBuilder numbers2 = new StringBuilder("246");
        numbers2.append(numbers1);
        numbers2.setCharAt(0, '1');
        numbers2.setCharAt(1, '2');
        numbers2.setCharAt(2, '3');
        numbers2.setCharAt(3, '4');
        numbers2.setCharAt(4, '5');
        numbers2.setCharAt(5, '5');
        System.out.println(numbers2);
        System.out.println("Задача 6.7 вариант 2");
        String firstString = "135";
        String secondString = "246";
        String unitedString;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            sb.append(firstString.charAt(i)).append(secondString.charAt(i));
        }
        unitedString = sb.toString();
        System.out.println(unitedString);
        System.out.println("Задача 6,8");
        String sortSymbols = "aabccddefgghiijjkk";
        String sortDublicatedSymbols;
        char [] symbolsArray = sortSymbols.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        char dublicated = ' ';
        for (int i = 0; i < symbolsArray.length; i++) {
            if (symbolsArray[i] == dublicated) {
                sb1.append(symbolsArray[i]);
            }
            dublicated = symbolsArray[i];
        }
        sortDublicatedSymbols = sb1.toString();
        System.out.println(sortDublicatedSymbols);


    }
}