//даны два угла треугольника в градусной мере.
//Определить существованрие такого треугольника, и если ДА, то будет ли он прямоугольным

import  java.util.Scanner;
public class Z1_7 {
    public static void main(String[] args){
        Scanner A=new Scanner(System.in);
        Scanner B=new Scanner(System.in);
        System.out.println("Введите градусну меру первого угла");
        if(A.hasNextFloat()){
            float a=A.nextFloat();
            System.out.println("Введите градусну меру второго угла");
            if (B.hasNextFloat()){
                float b=B.nextFloat();
                if (a+b<180){
                    System.out.println("Треугольник, основанный на введенных углах существует");
                    if (a+b==90||a==90||b==90){
                        System.out.println("Треугольник, основанный на введенных углах, является прямоугольным");
                    } else System.out.println("Треугольник, основанный на введенных углах, НЕ является прямоугольным");

                }else System.out.println("Не существует треугольника, основанного на введенных углах ");

            }else{
                String b=B.nextLine();
                System.out.println("Введенный угол " + b+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
            }
        }else {
          String a=A.nextLine();
            System.out.println("Введенный угол " + a+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
        }
    }
}
