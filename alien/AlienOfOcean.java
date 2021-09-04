package alien;

import arcade.ArcadeOcean;

public class AlienOfOcean extends ArcadeOcean {
	public static String oceanAlienType;
	
	public static void setOceanAlienMermade() {
		oceanAlienType = "mermaid"; // 인어 에일리언
	}
	
	public static void setOceanAlienPerl() {
		oceanAlienType = "perl"; // 진주 에일리언
	}

	public static void setOceanAlienBlackSalt() {
		oceanAlienType = "blacksalt"; // 블랙소금 에일리언
	}
	
	public static void setOceanAlienFish() {
		oceanAlienType = "fish"; // 물고기 에일리언
	}
	
}
