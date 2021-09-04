package alien;

import arcade.ArcadeGround;

public class AlienOfGround extends ArcadeGround {
	
	public static String groundAlienType;
	
	public void setGroundAlienRabbit() {
		groundAlienType = "rabbit"; // 토끼 에일리언
	}
	
	public void setGroundAlienHerb() {
		groundAlienType = "herb"; // 나무 에일리언
	}
	
	String getGroundAlien( ) {
		return groundAlienType;
	}

}
