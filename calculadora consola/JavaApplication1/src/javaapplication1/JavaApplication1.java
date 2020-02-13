package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion=1;
        double n1,n2;
        boolean condicion=false;
        while(opcion!=0)
        {
        System.out.println("****bienvenido a la calculadora*****");
        System.out.println("opciones:");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        System.out.println("5.potencia b de a");
        System.out.println("6.raiz enecima");
        System.out.println("7.funcion seno");
        System.out.println("8.funcion coseno");
        System.out.println("9.funcion tangente");
        System.out.println("10.iva del 19%");
        System.out.println("digite la operacion que quiere realizar");
        opcion=entrada.nextInt();
        switch(opcion)
        {
            case 1://suma
                System.out.println("digite el primer numero");
                n1=entrada.nextDouble();
                System.out.println("digite el segundo numero");
                n2=entrada.nextDouble();
                operaciones op=new operaciones(n1,n2);
                System.out.println(op.suma());
                break;
               
            case 2://resta
                System.out.println("digite el primer numero");
                n1=entrada.nextDouble();
                System.out.println("digite el segundo numero");
                n2=entrada.nextDouble();
                operaciones op1=new operaciones(n1,n2);
                System.out.println(op1.resta());
               break;
            case 3://mult
                System.out.println("digite el primer numero");
                n1=entrada.nextDouble();
                System.out.println("digite el segundo numero");
                n2=entrada.nextDouble();
                operaciones op2=new operaciones(n1,n2);
                System.out.println(op2.multiplicacion());
               break;
            case 4://div
                System.out.println("digite el primer numero");
                n1=entrada.nextDouble();
                System.out.println("digite el segundo numero");
                n2=entrada.nextDouble();
                while(n2==0)
                {
                    System.out.println("no se puede divir por cero");
                    System.out.println("digite un nuevo divisor");
                    n2=entrada.nextDouble();
                }
                operaciones op3=new operaciones(n1,n2);
                System.out.println(op3.division());
                break;
            case 5://pot
                System.out.println("digite la base");
                n1=entrada.nextDouble();
                System.out.println("digite la potencia");
                n2=entrada.nextDouble();
                operaciones op4=new operaciones(n1,n2);
                System.out.println(op4.potencia());
                break;
            case 6://raiz****
                System.out.println("digite la base");
                n1=entrada.nextDouble();
                System.out.println("digite la raiz que quiere sacar");
                n2=entrada.nextDouble();
                if(n1<0 && n2%2==0)
                {
                    System.out.println("la operacion no es posible");
                    break;
                }else
                {
                    operaciones op5=new operaciones(n1,n2);
                System.out.println(op5.raiz());
                break;
                }
            case 7://sin
                System.out.println("digite el angulo en grados");
                n1=entrada.nextDouble();
                operaciones op6=new operaciones(n1);
                System.out.println(op6.sin());
                break;
            case 8://cos
                System.out.println("digite el anguo en grados");
                n1=entrada.nextDouble();
                operaciones op7=new operaciones(n1);
                System.out.println((int)op7.cos());
                break;
            case 9://tan
                System.out.println("digite el anguo en grados");
                n1=entrada.nextDouble();
                operaciones op8=new operaciones(n1);
                System.out.println(op8.tan());
                break;
            case 10://iva
                System.out.println("digite el numero al cual le quiere sacar el iva");
                n1=entrada.nextDouble();
                operaciones op9=new operaciones(n1);
                System.out.println(op9.iva());
                break;
             } 
        }
    } 
}
