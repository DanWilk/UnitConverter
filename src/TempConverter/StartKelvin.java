package TempConverter;

public class StartKelvin {
    public static void toFahrenheit(double TempToConvert) {
        if(TempToConvert < 0) {
            System.out.println("Kelvin temperature's can not be negative.");
        }
        double FTemp = ((TempToConvert - 273.15) * (9.0/5.0)) + 32;
        System.out.printf("%.2f in Kelvin is equal to %.2f in Fahrenheit.", TempToConvert, FTemp);
    }

    public static void toCelsius(double TempToConvert) {
        if(TempToConvert < 0) {
            System.out.println("Kelvin temperature's can not be negative.");
        }
        double CTemp = TempToConvert - 273.15;
        System.out.printf("%.2f in Kelvin is equal to %.2f in Celsius.", TempToConvert, CTemp);
    }
}
