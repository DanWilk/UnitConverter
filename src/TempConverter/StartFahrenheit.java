package TempConverter;

public class StartFahrenheit {
    public static void toCelsius(double TempToConvert) {
        double CTemp = (TempToConvert - 32) * (5.0/9.0);
        System.out.printf("%.2f in Fahrenheit is equal to %.2f in Celsius.", TempToConvert, CTemp);
        System.out.println();
    }

    public static void toKelvin(double TempToConvert) {
        double KTemp = ((TempToConvert - 32) * (5.0/9.0)) + 273.15;
        System.out.printf("%.2f in Fahrenheit is equal to %.2f in Kelvin.", TempToConvert, KTemp);
        System.out.println();
    }
}
