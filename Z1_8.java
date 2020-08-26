//найти МАХ( МИН(а,б) , МИН(с, д) )

import java.util.Scanner;
public class Z1_8 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.println("помним, что запятая отделяет целу часть от дробной, вдруг это важно");
        System.out.print("Введите вещественное число  а = ");
        if(A.hasNextDouble()){
            double a=A.nextDouble();
            Scanner B=new Scanner(System.in);
            System.out.print("Введите вещественное число  b = ");
            if(B.hasNextDouble()){
                double b=B.nextDouble();
                Scanner C=new Scanner(System.in);
                System.out.print("Введите вещественное число  c = ");
                if(C.hasNextDouble()){
                    double c=C.nextDouble();
                    Scanner D=new Scanner(System.in);
                    System.out.print("Введите вещественное число  d = ");
                    if(D.hasNextDouble()){
                        double d=D.nextDouble();
                        double z=Math.max(Math.min(a,b),Math.min(c,d));
                        System.out.println("Искомое число Z = МАХ( МИН(а,б) , МИН(с, д) ) равно = " +z);
                    }else {
                        String d = D.nextLine();
                        System.out.println("Введенное число а " + d + "  не является вещественным числом, если вы ошиблись перезапустите программу");
                    }
                }else {
                    String c = C.nextLine();
                    System.out.println("Введенное число c " + c + "  не является вещественным числом, если вы ошиблись перезапустите программу");
                }
            }else {
                String b = B.nextLine();
                System.out.println("Введенное число b " + b + "  не является вещественным числом, если вы ошиблись перезапустите программу");
            }
        }else {
            String a=A.nextLine();
            System.out.println("Введенное число а " + a+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
        }
    }
}
