package dinosaur;

import arcade.ArcadeAlien;
import arcade.ArcadeMain;

public class Dinosaur extends ArcadeMain {
	public String item;

	public static void levelUp() {
		System.out.println(ai.setenceWrapperFront + character + "가 레벨업 했습니다" + ai.setenceWrapperBack);
	}

	// 이건 spaceship 상점에서 사용할 용도
	public void selectItem(String goods) {
		System.out.println(ai.setenceWrapperFront + item + "를 선택 완료되었습니다" + ai.setenceWrapperBack);
	}

	// 획득한 아이템을 사용관련 함수 및 변화갯수 함수
	public static void move() {
		System.out.println(ai.setenceWrapperFront + character + "가 달린다" + ai.setenceWrapperBack);
	}

	public void catchAlien() {
		System.out.println(ai.setenceWrapperFront + "를 선택 완료되었습니다." + ai.setenceWrapperBack);
	}

	public void attackAlien() {
		System.out.println(ai.setenceWrapperFront + new ArcadeAlien().alien + "을 공격한다." + ai.setenceWrapperBack);
	}

	public void jump() {
		System.out.println(ai.setenceWrapperFront + "가 점프한다." + ai.setenceWrapperBack);
	}
	
	public static void swim() {
		System.out.println(ai.setenceWrapperFront+ character + "가 어푸어푸 수영중이에요" + ai.setenceWrapperBack);
	}
}