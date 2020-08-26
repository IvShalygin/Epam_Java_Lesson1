//Найти функцию z=tg(x*y)*(sin(x)+cos(y))/(cos(x)-sin(y))

import java.util.Scanner;
public class Z1_3 {
    public static void main(String[] args) {
        double a=0,b=0,c=0;

        Scanner A=new Scanner(System.in);
        boolean a1=true;
        System.out.println("Задача. Нам необходимо найти значение функции Z=tg(x*y)*(sin(x)+cos(y))/(cos(x)-sin(y)");
        System.out.println("Стоит заметить, что числа, стоящие в функции, те что вводятся, будут пониматься как радианы, а не градусы!!! потому что есть разница");
        System.out.println("Введите действительное число x (пример 5,9)");

        while(a1) {
            if (A.hasNextDouble()) {
                a = A.nextDouble();
                a1=false;
                //System.out.println(" a = " +a);
            } else {
                String a_a=A.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод x");
            }
        }
        a1=true;
        System.out.println("Введите действительное число y  (пример 5,9)");
        Scanner B=new Scanner(System.in);
        while(a1) {
            if (B.hasNextDouble()) {
                b = B.nextDouble();
                a1=false;
                // Z=tg(x*y)*(sin(x)+cos(y))/(cos(x)-sin(y)
                double z=Math.tan(a*b)*(Math.sin(a)+Math.cos(b))/(Math.cos(a)-Math.sin(b));
                System.out.println("\n Искомая функция Z =  "+ z);

            } else {
                String a_a=B.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод y");
            }
        }




    }




}
