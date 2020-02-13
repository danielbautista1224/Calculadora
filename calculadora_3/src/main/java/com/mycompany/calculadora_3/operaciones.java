package com.mycompany.calculadora_3;
public class operaciones {
    double n3,n2;
    public operaciones() {}
  public double suma(double num1,double num2)
  {
      n3=num1+num2;
      return n3;
  }
  public double resta(double num1,double num2)
  {
      n3=num1-num2;
      return n3;
  }
  public double multiplicacion(double num1,double num2)
  {
      n3=num1*num2;
      return n3;
  }
  public double division(double num1,double num2)
  {
      n3=num1/num2;
      return n3;
  }
  public double potencia(double num1,double num2)
  {
      n3=Math.pow(num1,num2);
      return n3;
  }
  public double raiz(double num1,double num2)
  {
      n3=Math.pow(num1,1/num2);
      return n3;
  }
  public double sin(double num2)
  {
      n2=Math.toRadians(num2);
      n3=Math.sin(n2);
      return n3; 
  }
  public double cos(double num2)
  {
      n2=Math.toRadians(num2);
      n3=Math.cos(n2);
      return n3;
  }
  public double tan(double num2)
  {
      n2=Math.toRadians(num2);
      n3=Math.tan(n2);
      return n3;
  }
  public double iva(double num2)
  {
      n3=num2*0.19;
      return n3;
  }
}
