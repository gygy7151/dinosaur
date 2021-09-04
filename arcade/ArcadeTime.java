package arcade;

public class ArcadeTime extends ArcadeMain {
	
	private static String timeStatus = "bright"; //bright:낮, dark:밤, dawn:새벽을 의미
	
	public static void setTimeAfternoon(String timeStatus) {
		timeStatus = "afternoon";
	}
	
	public static void setTimeNight(String timeStatus) {
		timeStatus = "night";
	}

	public static void setTimeDawn(String timeStatus) {
		timeStatus = "dawn";
	}
	
	public static String getTimeStatus() {
		return timeStatus;
	}
}
