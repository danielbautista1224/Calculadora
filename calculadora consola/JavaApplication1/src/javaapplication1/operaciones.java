package javaapplication1;
public class operaciones {
    double n1,n2,n3;
final double pi=Math.PI;
    public operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public operaciones(double n1) {
        this.n1 = n1;
    }
  public double suma()
  {
      n3=n1+n2;
      return n3;
  }
  public double resta()
  {
      n3=n1-n2;
      return n3;
  }
  public double multiplicacion()
  {
      n3=n1*n2;
      return n3;
  }
  public double division()
  {
      n3=n1/n2;
      return n3;
  }
  public double potencia()
  {
      n3=Math.pow(n1,n2);
      return n3;
  }
  public double raiz()
  {
      n3=Math.pow(n1,1/n2);
      return n3;
  }
  public double sin()
  {
      n2=Math.toRadians(n1);
      n3=Math.sin(n2);
      return n3; 
  }
  public double cos()
  {
      n2=Math.toRadians(n1);
      n3=Math.cos(n2);
      return n3;
  }
  public double tan()
  {
      n2=Math.toRadians(n1);
      n3=Math.tan(n2);
      return n3;
  }
  public double iva()
  {
      return n1*0.19;
  }
}
