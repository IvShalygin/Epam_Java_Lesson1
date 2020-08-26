//Найти функцию z=((a-3)*b/2)+c

import java.util.Scanner;
public class Z1_1 {
    public static void main(String[] args) {
        double a=0,b=0,c=0;

        Scanner A=new Scanner(System.in);
        boolean a1=true;
        System.out.println("Задача. Нам необходимо найти значение функции Z=((a-3)*b/2)+c");
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

                double z=((a-3)*b/2)+c;
                System.out.println("\n Искомая функция Z =  "+ z);

            } else {
                String a_a=C.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод c");
            }
        }


    }

}
