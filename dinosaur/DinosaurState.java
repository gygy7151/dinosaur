package dinosaur;

public class DinosaurState extends Dinosaur {
	
	public static int hp = 5; //Health Point 약어. 공룡체력. 매 아케이드 시작마다 디폴트값은 5이다.
	public static int atk; // Attack의 약어. 공격력. 캐릭터마다 디폴트값 다름.
	public static int def; // Defense의 약어. 방어력. 캐릭터마다 디폴트값 다름.
	public static int levelGrade = 1; // 디폴트 레벨 1. 숫자가 높을수록 공룡은 이전레벨보다 0.2배 빨리 뛰게 된다. 
	public static int smile = 1; // 공룡 emotion 상태 표시값 //감정표시는 추후 2차 유지보수때 개발예정
	public static int sad = 2; // 공룡 emotion 상태 표시값
	public static int angry = 3; // 공룡 emotion 상태 표시값
	public static int crying = 4; // 공룡 emotion 상태 표시값
	public static String emotion; // 공룡 emotion 상태 표시값

	public static void main(String[] args) {
	}
	
	public void lostHealthPoint() {
		hp = hp - 1;
		System.out.println(ai.setenceWrapperFront+"현재남은목숨♥ : "+hp+"개"+ai.setenceWrapperBack);

		
	}
	//setter function
	public void setHealthPoint() {
		//레벨업그레이드할때마다 health point를 5로 초기화해준다
		hp = 5;
	}
	
	public void setAttackPoint(int settingAtk) {
		//개릭터마다 공격력이 다르다. -> 추후 공격력에 따른 데미지 차감을 달리 적용하는 로직 개발필요.
		atk = settingAtk;
	} 
	
	public void lostAttackPoint() {
		atk = atk - 10;
		System.out.println(ai.setenceWrapperFront + "Attackpoint -10" + ai.setenceWrapperBack );
	}
 	
	
	public static void setDefensePoint(int settingDef) {
		//개릭터마다 방어력이 다르다. -> 추후 공격력에 따른 데미지 차감을 달리 적용하는 로직 개발필요.
		def = settingDef;
		
	}
	
	public void lostDefencePoint() {
		def = def - 10;
		System.out.println(ai.setenceWrapperFront + "Defencepoint -10" + ai.setenceWrapperBack );
	}
	
	public static void setLevelGrade() {
		levelGrade++;
		
	}
	
	public static void setSmile() {
		emotion = "smile";
		System.out.println(">_<");		
	}
	
	public static void setSad() {
		emotion = "sad";
		System.out.println("Hwwwww -3-");		
	}
	
	public static void setAngry() {
		emotion = "smile";
		System.out.println("HUH?! O_O^");
	}

	public static void setCrying() {
		emotion = "smile";
		System.out.println("CRYING!! t_T");		
	}

	
	//getter function
	public static void getHealthPoint() {
		System.out.println(character+"가 hp+1되었습니다.");
		
	}
	
	public static void getAttackPoint() {
		System.out.println(character+"가 atk+1 되었습니다.");
	} 
	
	public static void getDefensePoint() {
		System.out.println(character+"가 df+1 되었습니다.");
		
	}

	
	public static String getEmotion() {
		return emotion;
	}

}
