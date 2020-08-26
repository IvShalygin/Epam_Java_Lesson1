//Дано вещественное число вида ddd,nnn
//Т.е условие по сути ставится так, что он уже есть и менно такого вида. Следовательно проверку на такое ли это число делать не будем.
//Нужно сделать: поменять местами целую и дробную часть местами для получения числа (это важно) у которого вид nnn,ddd
//при этом помним, что разделение дробной и целой части у нас  -- ","

import java.util.Scanner;
public class Z1_4 {
    public static double pow (double value, double powValue){
        return Math.pow(value,powValue);
    }
    public static void main(String[] args){
       // int a1, a2,a3,a4,a5,a6;
        int b1;
        double b,a0;
        //float a0;
        Scanner A=new Scanner(System.in);
        System.out.println("Введите число действительное число вида ddd,nnn , к примеру 888,666");
        if (A.hasNextDouble()) {
            double a = A.nextFloat();
            b=Math.floor(a);
            System.out.println(" b = " +b);
            a0=Math.rint(1000*(a%b));
            //a0=Math.floor(1000*a0);
            System.out.println(" a0 = " +a0);
            //b1=(int)(pow(10,3)*a);
            b1=(int)(1000*a0);
            float z = (float) (a0+b/pow(10,3));
         /*   b=(int)(a*pow(10,3));
            a1=(int)(b/pow(10,5));//-b%pow(10,5)
            b=b-(int)(a1*pow(10,5));
            a2=(int)(b/pow(10,4));
            b=b-(int)(a2*pow(10,4));
            a3=(int)(b/pow(10,3));
            b=b-(int)(a3*pow(10,3));
            a4=(int)(b/pow(10,2));
            b=b-(int)(a4*pow(10,2));
            System.out.println(" b = " +b);
            a5=(int)(b/pow(10,1));
            b=b-(int)(a5*pow(10,1));
            System.out.println(" b = " +b);
            a6=(int)(b/pow(10,0));
            b=b-(int)(a6*pow(10,0)); */

            System.out.println(" z = " +z);
        } else {
            String a_a=A.nextLine();
            System.out.println("Введенные данные -- " + a_a + "  не являются действительным числом, повторите ввод x");
        }
    }
}
