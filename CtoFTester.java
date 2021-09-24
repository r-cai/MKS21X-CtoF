public class CtoFTester {
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(10));
    System.out.println(fahrenheitToCelsius(105));
}

  public static double celsiusToFahrenheit(double c) {
    double fahren = c * (9.0 / 5.0) + 32.0;
    return fahren;
  }

  public static double fahrenheitToCelsius(double f) {
    double cel = (f - 32.0) * (5.0/9.0);
    return cel;
  }

}
