import java.util.Arrays;

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
                    System.out.println(i + ":ping pong");}

                else {System.out.println(i + ":");}
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
        int [] f = {5,4,3,2,1};
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }System.out.println();
        for (int i = f.length-1; i >= 0 ; i--) {
            System.out.print( f[i] + " ");
            }System.out.println();
        System.out.println("Задача 5.7");
        int [] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        System.out.println("Задача 6.5");
        String fullName = " Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        String fN = words[2];
        String mN = words[3];
        String lN = words[1];
        System.out.println("Имя сотрудника - " + fN);
        System.out.println("Фамилия сотрудника - " + lN);
        System.out.println("Отчество сотрудника - " + mN);
    }
}