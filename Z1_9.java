//Даны две точки на плоскости. Необходимо проверить лежит ли 3я точка на прямой, образованной первыми двумя.

import java.util.Scanner;
public class Z1_9 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.println("Введите координаты точки A (вещественные числа)");
        System.out.print("Введите X = ");
        if(A.hasNextDouble()){
            double a_x=A.nextDouble();
            Scanner B=new Scanner(System.in);
            System.out.print("Введите Y = ");
            if(B.hasNextDouble()){
                double a_y=B.nextDouble();
                System.out.println("Введите координаты точки B (вещественные числа)");
                Scanner C=new Scanner(System.in);
                System.out.print("Введите X =  ");
                if(C.hasNextDouble()){
                    double b_x=C.nextDouble();
                    Scanner D=new Scanner(System.in);
                    System.out.print("Введите Y = ");
                    if(D.hasNextDouble()){
                        double b_y=D.nextDouble();
                        System.out.println("Введите координаты точки C (вещественные числа)");
                        Scanner E=new Scanner(System.in);
                        System.out.print("Введите X =  ");
                        if(E.hasNextDouble()){
                            double c_x=E.nextDouble();
                            Scanner F=new Scanner(System.in);
                            System.out.print("Введите Y =  ");
                            if(F.hasNextDouble()){
                                double c_y=F.nextDouble();
                                if ((c_x-a_x)/(b_x-a_x)==(c_y-a_y)/(b_y-a_y)  ){
                                    System.out.println("Точка С лежит на на одной прямой с точками А и В");
                                }else System.out.println("Точка С НЕ лежит на на одной прямой с точками А и В");

                            }else {
                                String c_y=F.nextLine();
                                System.out.println("Введенное число c_y " + c_y+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
                            }

                        }else {
                            String c_x=E.nextLine();
                            System.out.println("Введенное число c_x " + c_x+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
                        }
              }else {
                        String b_y = D.nextLine();
                        System.out.println("Введенное число b_y " + b_y + "  не является вещественным числом, если вы ошиблись перезапустите программу");
                    }
                }else {
                    String b_x = C.nextLine();
                    System.out.println("Введенное число b_x " + b_x + "  не является вещественным числом, если вы ошиблись перезапустите программу");
                }
            }else {
                String a_y = B.nextLine();
                System.out.println("Введенное число  a_y " + a_y + "  не является вещественным числом, если вы ошиблись перезапустите программу");
            }
        }else {
            String a_x=A.nextLine();
            System.out.println("Введенное число a_x " + a_x+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
        }

    }
}
