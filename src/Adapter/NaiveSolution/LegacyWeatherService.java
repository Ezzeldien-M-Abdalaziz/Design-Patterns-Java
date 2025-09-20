package Adapter.NaiveSolution;

public class LegacyWeatherService {

    private final ThirdPartyWeatherService WeatherApi;

    public LegacyWeatherService(ThirdPartyWeatherService WeatherApi) {
        this.WeatherApi = WeatherApi;
    }

    //getTemperature in xml
    public String  getTemperature(String city , String country) {
        return WeatherApi.getTemperature(city, country);
    }


    //getTemperature in json
    public TemperatureData getTemperature(double longitude , double latitude) {
        String temperatureDataInXML = getTemperature(getCityOf(longitude,latitude) , getCountryOf(longitude, latitude));
        return convertXMLDataToJson(temperatureDataInXML);
    }

    private TemperatureData convertXMLDataToJson(String XMLData) {
        System.out.println("Converting XML data to JSON...");
        return new TemperatureData("converted data from xml to json");
    }

    //get city
    private String getCityOf(double longitude, double latitude) {
        System.out.println("Extracting city of longitude: " + longitude + " and latitude: " + latitude);
        return "City";
    }

    //get country
    private String getCountryOf(double longitude, double latitude) {
        System.out.println("Extracting country of longitude: " + longitude + " and latitude: " + latitude);
        return "Country";
    }

}
