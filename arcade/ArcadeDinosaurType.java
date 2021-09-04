package arcade;

public class ArcadeDinosaurType extends ArcadeMain {
	//캐릭터 종류별로 이름 셋팅
	public static String dinosaurType;
	public static ArcadeAlien aa = new ArcadeAlien();
	
	
	
	public static void setPteranodon() {
		dinosaurType = "프테라노돈";
		aa.alien = dinosaurType;
	}
	
	public static void setLanosaurus() {
		dinosaurType = "라노사우루스";
		aa.alien = dinosaurType;
	}
	
	public static void setCronosaurus() {
		dinosaurType = "크로노사우루스";
		aa.alien = dinosaurType;
	}

	public static String getCharacter() {
		return aa.alien;
	}
	
}
