//Вводим любое целое положительное число =N, Результат -- суммирование всех чисел от 1 до N

import java.util.Scanner;
public class Z1_12 {
    public static void main(String [] args) {
        Scanner N=new Scanner(System.in);
        System.out.println("Напоминаю, необходимо найти сумму числе от 1 ДО N  ");
        System.out.print("Введите целое положительное число N = ");
        if (N.hasNextInt()){
            int n=N.nextInt() ;
            if (n>0){
                int i=1, sum=0;
                while(i<n){
                    sum+=i;
                    i++;
                }
                System.out.print("Искомая сумма = "+sum);
            }else{
                System.out.print("Введенное число МЕНЬШЕ либо равно нулю!!! А это нарушает условие задачи");
            }
         }else{
            String n=N.nextLine();
            System.out.print("Введенное число НЕ является целым!!! А это нарушает условие задачи " +n);
        }
    }
}

