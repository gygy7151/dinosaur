package arcade;

import java.util.InputMismatchException;
import java.util.Scanner;

import alien.AlienOfDesert;

public class ArcadeDesert extends ArcadeMain {
	private ArcadeDinosaurType act = new ArcadeDinosaurType();
	public AlienOfDesert aod = new AlienOfDesert();
	public ArcadeAlien aln = new ArcadeAlien();

	void chooseDesertType() {
	int _desertType = 0;
		
		do {
			try {
				// 구분선 for문
				recycleUnderBar();
				System.out.println(ai.setenceWrapperFront+"w ▨ E ▤ L ▨ C ▤ O ▨ M ▤ E ▤ T ▤ O ▤ D ▨ E ▤ S ▤ E ▤ R ▤ T "+ai.setenceWrapperBack);
				System.out.println(ai.setenceWrapperFront+"CoinDesert : 0, SaharaDesert : 1"+ai.setenceWrapperBack);
				chooseNumbers();
				
				
				int _userChoice = new Scanner(System.in).nextInt();
				_desertType = _userChoice;
				
				// 사하라사막은 추후 오픈예정 안내문구
				if (_desertType == 1) {
					System.out.println(ai.setenceWrapperFront + "SaharaDesert는 2021년 9월에 베타버전 오픈예정입니다. 조금만 기다려주세요! 항상 많은 관심과 응원 감사합니다" + ai.setenceWrapperBack);
				}
				
				act.setPteranodon();
				
			} catch ( InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)"); //왜 if문으로 조건걸었냐..? trycatch문을 넣으면 프로그램이 종료가 되어버리네..?
			}
		} while (_desertType != 0);
	}	
	
	
}
