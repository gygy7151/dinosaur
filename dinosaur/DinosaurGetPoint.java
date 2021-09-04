package dinosaur;

public class DinosaurGetPoint extends Dinosaur {
	public static int desertCoin = 0; // 사막코인은 식료품이나 아이템구매시 사용가능.
	public static int marbleStone = 0; // 육지의 돌(stone)과 다름. 우주에서만 채집가능. 1개획득시 +1회득. 아이템제조용.
	public static int unicornHorn = 0; // 하늘에서 유니콘을 kill하면 +1획득. 아이템 및 약제조용.
	public static int unicornHair = 0; // 하늘에서 유니콘을 kill하면 +1획득. 아이템 및 약제조용
	public static int herb = 0; // 디폴트값은 0개. 육지에서 약초 한개를 획득할시 +1된다. 약제조 또는 요리용. 
	public static int treeSap = 0; // 디폴트값은 0개. 육지에서 수액 한개를 획득할시 +1된다. 약 또는 아이템 제조용. 
	public static int rabbitFlash = 0; // 육지에서 토끼몬스터 한마리를 kill하면 +1획득. 요리용
	public static int rabbitHair = 0 ; // 육지에서 토끼몬스터 한마리를 kill하면 +1획득. 아이템 또는 약제조용
	public static int cactus = 0; // 사막에서 선인장몬스터 한마리를 밟아서 kill할때마다 +1획득. 요리 및 약제조용
	public static int glassArticles = 0; //모래사막에서 모래몬스터 한마리 kill할때마다 +1획득. 아이템 및 약제조용
	public static int perl = 0; // 디폴트값은 0개. 바다에서 진주 한개를 획득할시 +1된다. 약 또는 아이템 제조용. 
	public static int mermaidDrop = 0; // 디폴트값은 0개. 인어를 kill할시 +1된다. 약 또는 아이템 제조용. 
	public static int salt = 0; //사해바다에서 블랙쏠트몬스터 kill하면 +1획득. 요리용
	public static int fish = 0; // 바다에서 사냥가능. 몬스터아님. 요리용
	
	public void successForKillingRabbit() {
		rabbitFlash++;
		rabbitHair++;
		System.out.println(ai.setenceWrapperFront + "rabbitFlash를 +1획득하다." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "rabbitHair를 +1획득하다." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "현재수량 rabbitFlash : " + rabbitFlash + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "현재수량 rabbitHair : " + rabbitHair + ai.setenceWrapperBack);
	}
	
	public void successForKillingCactus() {
		cactus++;
		System.out.println(ai.setenceWrapperFront + "cactus를 +1획득하다." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "현재수량 선인장 : " + cactus + ai.setenceWrapperBack);
	}
	
	public void successForKillingUnicorn() {
		unicornHorn++;
		unicornHair++;
		System.out.println(ai.setenceWrapperFront + "unicornHorn를 +1획득하다." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "unicornHair를 +1획득하다." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "현재수량 unicornHorn : " + unicornHorn + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "현재수량 unicornHair : " + unicornHair + ai.setenceWrapperBack);
	}
}
