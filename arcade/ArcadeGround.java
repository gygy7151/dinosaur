package arcade;

import java.util.InputMismatchException;
import java.util.Scanner;

import alien.AlienOfGround;
import dinosaur.DinosaurMotion;
import dinosaur.DinosaurState;

public class ArcadeGround extends ArcadeMain {
	public static AlienOfGround aog = new AlienOfGround();
	private ArcadeDinosaurType act = new ArcadeDinosaurType();
	public ArcadeAlien aln = new ArcadeAlien();
	public DinosaurState ds = new DinosaurState();
	public DinosaurMotion dm = new DinosaurMotion();
	public ArcadeStoneMountain asm =  new ArcadeStoneMountain();
	
	
	void chooseGroundType() {
		int _groundType = 0;
		do {
			try {
				// 구분선 for문 왜구분을하는지 작성해야됨
				recycleUnderBar();
				System.out.println(ai.setenceWrapperFront+"w ▨ E ▤ L ▨ C ▤ O ▨ M ▤ E ▤ T ▤ O ▤ G ▨ R ▤ O ▤ U ▤ N ▤ D"+ai.setenceWrapperBack);
				System.out.println(ai.setenceWrapperFront+"StoneMountain : 0, Forest : 1"+ai.setenceWrapperBack);
				chooseNumbers();
				
				int _userChoice = new Scanner(System.in).nextInt();
				_groundType = _userChoice;
				
				if(_groundType == 1) {
					System.out.println(ai.setenceWrapperFront + "Forest는 2021년 9월에 베타버전 오픈예정입니다. 조금만 기다려주세요! 항상 많은 관심과 응원 감사합니다" + ai.setenceWrapperBack);
				}
				act.setPteranodon();
				asm.wantToRestartStage();
				
			} catch ( InputMismatchException e) {
				System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)"); //왜 if문으로 조건걸었냐..? trycatch문을 넣으면 프로그램이 종료가 되어버리네..?
			}
		} while (_groundType != 0 && _groundType != 0);
		
		new ArcadeStoneMountain().runOnStoneMountain();
	} 

//		System.out.println(ai.setenceWrapperFront + character + "가 달리기 시작한다." + ai.setenceWrapperBack);
	
	//예시
//	public static void run() {
//		System.out.println("Groud method");
//
//				Sky sky = new Sky();
//				System.out.println(sky.getSky() + "씨를 뿌린다.");
//				sky.setDawn();
//				System.out.println(sky.getSky() + "씨를 뿌린다.");
//	}
	
	
	

}
