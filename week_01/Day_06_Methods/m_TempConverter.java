public class m_TempConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        double fahrenheit = celsiusToFahrenheit(0.0);
        double celsius = fahrenheitToCelsius(212.0);

        System.out.println("0.0 Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println("212.0 Fahrenheit = " + celsius + " Celsius");
    }
}