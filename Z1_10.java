//Дано отверствие с параметрами А, В. Есть кирпич с параметрами (x,y,z)
//Необходимо проверить пролазил ли кирпич в отверстие

import java.util.Scanner;
public class Z1_10 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        System.out.println("Введите параметры проема A,B (вещественные числа, большие нуля)");
        System.out.print("Введите A = ");
        if(A.hasNextDouble()){
            double a=A.nextDouble();
            if(a<=0) {
                System.out.print("Введенное число "+a+" меньше либо равно нулю, длины не могут быть такими ");
            }else{
                //***
                Scanner B=new Scanner(System.in);
                System.out.print("Введите B = ");
                if(B.hasNextDouble()){
                    double b=B.nextDouble();
                    if(b<=0) {
                        System.out.print("Введенное число "+b+"  меньше либо равно нулю, длины не могут быть такими ");
                    }else{
                        //**
                        System.out.println("Введите параметры кирпича x,y,z (вещественные числа, большие нуля)");
                        Scanner X=new Scanner(System.in);
                        System.out.print("Введите X =  ");
                        if(X.hasNextDouble()){
                            double x=X.nextDouble();
                            if(x<=0) {
                                System.out.print("Введенное число "+x+"  меньше либо равно нулю, длины не могут быть такими ");
                            }else {
                                //**
                                Scanner Y=new Scanner(System.in);
                                System.out.print("Введите Y = ");
                                if(Y.hasNextDouble()){
                                    double y=Y.nextDouble();
                                    if(y<=0) {
                                        System.out.print("Введенное число "+y+"  меньше либо равно нулю, длины не могут быть такими ");
                                    }else {
                                        //**
                                        Scanner Z=new Scanner(System.in);
                                        System.out.print("Введите Z =  ");
                                        if(Z.hasNextDouble()){
                                            double z=Z.nextDouble();
                                            if(z<=0) {
                                                System.out.print("Введенное число "+z+"  меньше либо равно нулю, длины не могут быть такими ");
                                            }else {
                                                if (((z<b)&&((y<a)||(x<a)))||((y<b)&&((z<a)||(x<a)))||(x<b)&&((y<a)||(z<a))){
                                                    System.out.println("Урааа!!!! Кирпич пролазит");
                                                }else System.out.println("Кирпич НЕ пролазит");
                                            }
                                      }else {
                                            String e=Z.nextLine();
                                            System.out.println("Введенное число z " + e+ "  не является вещественным числом, большим нуля. Если вы ошиблись перезапустите программу");
                                        }
                                        //**
                                    }

                                }else {
                                    String d = Y.nextLine();
                                    System.out.println("Введенное число y " + d + "  не является вещественным числом, большим нуля. Если  вы ошиблись перезапустите программу");
                                }
                                //**
                            }

                        }else {
                            String c = X.nextLine();
                            System.out.println("Введенное число x " + c + "  не является вещественным числом, большим нуля. Если  вы ошиблись перезапустите программу");
                        }
                         //**
                    }
                }else {
                    String b = B.nextLine();
                    System.out.println("Введенное число B " + b + "  не является вещественным числом, если вы ошиблись перезапустите программу");
                }
                //***
            }
        }else {
            String a=A.nextLine();
            System.out.println("Введенное число A " + a+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
        }
    }
}
