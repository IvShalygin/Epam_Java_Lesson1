//Введите координаты точки, если ввыеденные координаты попадают в область, то переменная становится TRUE иначе FALSE

import java.util.Scanner;
public class Z1_6 {
    public static void main(String[] args){
        boolean tr=false;
        float a,b;
        Scanner A=new Scanner(System.in);
        System.out.println("Введите координаты точки (x, y) ");
        System.out.println("Введите координаты  X");
        if (A.hasNextFloat()){
            a=A.nextFloat();
            Scanner B=new Scanner(System.in);
            System.out.println("Введите координаты Y");
            if (B.hasNextFloat()){
                b=B.nextFloat();

                if((b<=4 & b>=0)&(a>=-2 & a<=2)){
                    tr=true;
                }
                if((b<=0 & b>=-3)&(a>=-4 & a<=4)){
                    tr=true;
                }
               if (tr) {
                   System.out.println("Введенная точка с координатами (" + a + "," + b + ") попадет в область, заданную условием");
                   System.out.println("Значение искомой величины = " +tr);
               }else{
                   System.out.println("Введенная точка с координатами (" + a + "," + b + ") НЕ  попадет в область, заданную условием");
                   System.out.println("Значение искомой величины = " +tr);
               }


          }else{
                String a_a=B.nextLine();
                System.out.println("Введенные данные -- " + a_a + "  не являются целым числом");
            }
        }else {
            String a_a=A.nextLine();
            System.out.println("Введенные данные -- " + a_a + "  не являются целым числом");
        }
    }
}
