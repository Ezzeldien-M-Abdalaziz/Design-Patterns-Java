import Adapter.NaiveSolution.LegacyWeatherService;
import Adapter.NaiveSolution.TemperatureData;
import Adapter.NaiveSolution.ThirdPartyWeatherService;
import Factory.FactorySolution.CardTypes;
import Factory.FactorySolution.PaymentMethodFactory;
import Factory.FactorySolution.PaymentProcessor;


public class Main {
    public static void main(String[] args) {

        ThirdPartyWeatherService WeatherApi = new ThirdPartyWeatherService();

        LegacyWeatherService legacyWeatherService = new LegacyWeatherService(WeatherApi);

//        System.out.println(legacyWeatherService.getTemperature("cairo" , "egypt"));
        TemperatureData result = legacyWeatherService.getTemperature(111 , 111);
        System.out.println(result.getTemperatureData());





    }
}
