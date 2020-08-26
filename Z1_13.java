//есть функция, необходимо ввести отрезок [A,B] и шаг h для вычислений значения функции на нем

import java.util.Scanner;
public class Z1_13 {
    public static double func(double x){
        if(x>2){
            return x;
        }else return -x;
    }

    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.print("Введите левую границу отрезка А = ");
        if(A.hasNextDouble()){
            double a=A.nextDouble();
            Scanner B=new Scanner(System.in);
            System.out.print("Введите правую границу отрезка B (она должна быть больше А, той самой которая левая граница) = ");
            if(B.hasNextDouble()){
              double b=B.nextDouble();
              if(b>=a){
                  Scanner H=new Scanner(System.in);
                  System.out.print("Введите шаг h (тоже действительное число), с которым будут вычисляться значения функции на нашем отрезке = ");
                  if(H.hasNextDouble()){
                      double h=H.nextDouble();
                      if(h>0){
                          double i=a;
                          while (i<=b){
                              System.out.println("Текущее значение функции = " +func(i) + "  при значении аргумента = " + i);
                              i+=h;
                          }
                      }else if(h<0){
                          double i=b;
                          while (i>=a){
                              System.out.println("Текущее значение функции = " +func(i) + "  при значении аргумента = " + i);
                              i+=h;
                          }
                      }else {
                          System.out.println("Нахождение значения функции с шагом h =" + h + " невозможно, т.к. подразумевается, что он НЕ равен нулю и двигается по отрезку А,В");
                          System.out.println("В данном случае считаю, что значение функции должно быть единичным F(A) ="+func(a));
                      }
                  }else{
                      String h=H.nextLine();
                      System.out.println("Введенное число h " + h+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
                  }

              }else{
                  System.out.println("К сожалению это невозможно, т.к. введенная правая граница отрезка" +b+" меньше чем левая = " + a);
              }

            }else{
                String b=B.nextLine();
                System.out.println("Введенное число B " + b+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
            }
        }else{
            String a=A.nextLine();
            System.out.println("Введенное число A " + a+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
        }
    }
}
