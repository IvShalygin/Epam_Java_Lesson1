//вычислить значение функции
//если x<=3, то y=x^2-3*x+9
//в остальном, y=1/(x^3+6)

import java.util.Scanner;
public class Z1_11 {
    public static void main(String[] args){
        double y,x;
     Scanner A=new Scanner(System.in);
     System.out.print("Введите вещественное число  X = ");
     if(A.hasNextDouble()){
          x=A.nextDouble();
         if(x<=3){
           y=Math.pow(x,2)-3*x+9;
         }else{
            y=1/(Math.pow(x,3)+6);
         }
         System.out.println("Значении Y = "+y);
     }else {
         String a=A.nextLine();
         System.out.println("Введенное число A " + a+ "  не является вещественным числом, если вы ошиблись перезапустите программу");
     }
    }
}
