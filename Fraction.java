public class Fraction {
  /* When we think of an object we ask ourselves what
  the attributes and behaviours
  */

  //Fields
  int num; //stores numerators
  int den; //stores denominators

  //Constructors
  public void multiply(int a) {
    num = num * a;
  }

  //multiply two fraction
  public void multiplyFraction(Fraction other) {
    num = num*other.num;
    den = den*other.den;
  }

  //Methods


}
