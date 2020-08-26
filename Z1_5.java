//Дано время в целых секундах. Нужно сделать вывод HHч MMмин SSс.

import java.util.Scanner;
public class Z1_5 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.println("Введите целое число секунд, которое необходимо преобразовать");
        int a,a_m, a_h, a_s;
        if (A.hasNextInt()){
            a=A.nextInt();
            a_h=(int) Math.rint(a/3600);

            a=a-3600*a_h;
            if (a>=59){
                a_m=(int)Math.rint(a/60);
                a_s=a-60*a_m;

            } else {
                a_m=0;
                a_s=a;
            }

            System.out.println(" " +a_h +" ч. "+ " " +a_m +" мин." + " " +a_s +" сек.");
        }

    }
}
