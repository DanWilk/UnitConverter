package TempConverter;

public class StartCelsius {
    public static void toFahrenheit(double TempToConvert) {
        double FTemp = (TempToConvert * (9.0/5.0)) + 32;
        System.out.printf("%.2f in Celsius is equal to %.2f in Fahrenheit", TempToConvert, FTemp);
    }

    public static void toKelvin(double TempToConvert) {
        double KTemp = TempToConvert + 273.15;
        System.out.printf("%.2f in Celsius is equal to %.2f in Kelvin", TempToConvert, KTemp);
    }
}
