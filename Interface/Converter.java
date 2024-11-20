package Interface;


interface Converter {
    double convert(double celsius);
}

abstract class BaseConverter {

    private double celsius;

    // Konstruktor
    public BaseConverter(double celsius) {
        this.celsius = celsius;
    }

    public abstract double convert();

    // Getter metodi: Selsiy darajasini olish
    public double getCelsius() {
        return celsius;
    }
}

// KelvinConverter klassi BaseConverter dan meros oladi
class KelvinConverter extends BaseConverter {
    public KelvinConverter(double celsius) {
        super(celsius);
    }

    @Override
    public double convert() {
        return getCelsius() + 273.15; // Selsiydan Kelvin ga o’tish formulasi
    }
}


class FahrenheitConverter extends BaseConverter {
    public FahrenheitConverter(double celsius) {
        super(celsius);
    }

    @Override
    public double convert() {
        return (getCelsius() * 9/5) + 32; // Selsiydan Farengeyt ga o’tish formulasi
    }
}

// Asosiy klass
class Main {
    public static void main(String[] args) {
        double celsius = 25.0; // Selsiy darajasi

        BaseConverter kelvinConverter = new KelvinConverter(celsius);
        BaseConverter fahrenheitConverter = new FahrenheitConverter(celsius);

        System.out.println(celsius + "°C Kelvin ga: " + kelvinConverter.convert() + " K");
        System.out.println(celsius + "°C Farengeyt ga: " + fahrenheitConverter.convert() + " °F");
    }
}