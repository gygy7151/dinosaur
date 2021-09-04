package arcade;

public class ArcadeWeather extends ArcadeMain {
	private static String dayWeather; // clean:맑음, cloudy:흐림, rainy:비, snowy:눈, windy:바람많이붊
	
	
	public static void setDayClean(String dayWeather) {
		dayWeather = "clean";
	}
	
	public static void setDayCloudy(String dayWeather) {
		dayWeather = "cloudy";
	}
	
	public static void setDayRainy(String dayWeather) {
		dayWeather = "rainy";
	}
	
	public static void setDaySnowy(String dayWeather) {
		dayWeather = "snowy";
	}
	
	public static void setDayWindy(String dayWeather) {
		dayWeather = "windy";
	}
	
	
	public static String getDayWeather() {
		return dayWeather;
	}
}
