//Найти функцию z=((b+(b^2+4*a*c)^0,5)/(2*a))-a^3*c+b^(-2)

import java.util.Scanner;

public class Z1_2 {
    public static void main(String[] args) {
        double a=0,b=0,c=0;

        Scanner A=new Scanner(System.in);
        boolean a1=true;
        System.out.println("Задача. Нам необходимо найти значение функции Z=((b+(b^2+4*a*c)^0,5)/(2*a))-a^3*c+b^(-2)");
        System.out.println("Введите действительное число a (пример 5,9)");

        while(a1) {
            if (A.hasNextDouble()) {
                a = A.nextDouble();
                a1=false;
                //System.out.println(" a = " +a);
            } else {
                String a_a=A.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод a");
            }
        }
        a1=true;
        System.out.println("Введите действительное число b  (пример 5,9)");
        Scanner B=new Scanner(System.in);
        while(a1) {
            if (B.hasNextDouble()) {
                b = B.nextDouble();
                a1=false;
            } else {
                String a_a=B.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод b");
            }
        }

        a1=true;
        Scanner C=new Scanner(System.in);
        System.out.println("Введите действительное число c  (пример 5,9)");
        while(a1) {
            if (C.hasNextDouble()) {
                c = C.nextDouble();
                a1=false;
                double z1=Math.pow(b,2)+4*a*c;

                double z=(b+Math.pow(z1,0.5)/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
                System.out.println("\n Искомая функция Z =  "+ z);

            } else {
                String a_a=C.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод c");
            }
        }


    }

}
