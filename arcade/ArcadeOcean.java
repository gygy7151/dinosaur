package arcade;

import java.util.InputMismatchException;
import java.util.Scanner;

import alien.AlienOfOcean;

public class ArcadeOcean extends ArcadeMain {
	// 스토리 래퍼토리를 짜라. sky아케이드가 시작되면 에일리언이 어떻게 공격할지
	private ArcadeDinosaurType act = new ArcadeDinosaurType();
	public AlienOfOcean aoo = new AlienOfOcean();
	public ArcadeAlien aln = new ArcadeAlien();

	void chooseOceanType() {
		int _oceanType = 0;
		do {
			try {
				// 구분선 for문
				recycleUnderBar();
				
				System.out.println(ai.setenceWrapperFront+"w ▨ E ▤ L ▨ C ▤ O ▨ M ▤ E ▤ T ▤ O ▤ O ▨ C ▤ E ▤ A ▤ N"+ai.setenceWrapperBack);
				System.out.println(ai.setenceWrapperFront+"DeadSea : 0, Pacific : 1"+ai.setenceWrapperBack);
				chooseNumbers();
				
				
				int _userChoice = new Scanner(System.in).nextInt();
				_oceanType = _userChoice;
				
				// Pacific태평양은 추후 오픈예정 안내문구
				if (_oceanType == 1) {
					System.out.println(ai.setenceWrapperFront + "Pacific는 2021년 9월에 베타버전 오픈예정입니다. 조금만 기다려주세요! 항상 많은 관심과 응원 감사합니다" + ai.setenceWrapperBack);
				}
				act.setCronosaurus();
				
			} catch ( InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)"); //왜 if문으로 조건걸었냐..? trycatch문을 넣으면 프로그램이 종료가 되어버리네..?
			}
		} while (_oceanType != 0);
	}
	
	
//	public static void approachBigFish() {
//		System.out.println(ai.setenceWrapperFront + "가 근방에 있습니다. 공격하세요!" + ai.setenceWrapperBack);
//	}
//	
//	public static void approachSmallFish() {
//		System.out.println(ai.setenceWrapperFront + "작은 물고기가 다가옵니다 "+ ai.setenceWrapperBack);
//	}
//	
//	

}
