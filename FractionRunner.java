public class FractionRunner {
  public static void main(String[] args) {

    //Reference Type = Object Type
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction();

    f1.num = 1;
    f1.den = 2;

    f2.num = 3;
    f2.den = 4;
    

    System.out.println(f1.num+"/"+f1.den);
    f1.multiply(5);
    System.out.println(f1.num+"/"+f1.den);
    f2.multiply(100);
    System.out.println(f2.num+"/"+f2.den);
    f1.multiplyFraction(f2);
    System.out.println(f1.num+"/"+f1.den);
    System.out.println(f2.num+"/"+f2.den);
  }
}
