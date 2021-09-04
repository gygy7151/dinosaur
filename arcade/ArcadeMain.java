package arcade;

import java.util.InputMismatchException;
import java.util.Scanner;
//import arcade.Ground;
import arcade.ArcadeAlien;
import dinosaur.DinosaurState;
import spaceship.Spaceship;
import arcade.ArcadeIntro;

public class ArcadeMain{
	public static String character = "Dinosaur"; //캐릭터를 지칭하는 멤버변수.
	public static DinosaurState dn = new DinosaurState();
	public static ArcadeIntro ai = new ArcadeIntro();
	public static int level = 1; // 레벨은 디폴트값은 1부터 시작하고 최대100까지 있다.
	
	public static void main(String[] args) {
		int coin = 0; // 코인은 각 맵에서 공룡이 달리기 시작할때부터 1초당 1코인씩 쌓인다
		int controlKey = 0; // 디폴트값 0은 달리기. 1은 위로
		boolean gameStartKeyValue = false; // 최초 게임접속키. 사용자가 1을 입력해주면 true값이 바뀌면서 게임이 실행된다.
		int inputLimitTimes = 0; // 게입접속시도시 5번이상
		
		// 구분선 for문 
		recycleUnderBar();
			do {
				try {
					
					Scanner input = new Scanner(System.in);
					
					//게임세계관 안내문 출력
					ai.getGameStoryIntro();

					// 유저 입력값은 기본적으로 String타입으로 받는다.
					int _input = input.nextInt();
					
					// do문에선 지역변수만 사용가능 멤버변수 호출안됨
					if( _input != 1) {
						
						System.out.println("잘못된 입력키입니다. 1을 입력해주세요.(남은입력횟수 : "+(4-inputLimitTimes)+"회)");
						inputLimitTimes++;
						
						// 구분선 for문
						recycleUnderBar();
						
					 } else if (_input == 1) {
					
						 gameStartKeyValue = true; // naming revision* ->  Done.
					 
					 } else {
					
						 inputLimitTimes++;
					 }

				} catch( InputMismatchException e) {
				
					System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)");
				
				}
				
				//Do 끝부분, while 시작부분
				} while (!gameStartKeyValue && isValid(inputLimitTimes, 5) && dn.hp != 0); //자꾸오해하면안되는게 종료라는 결과가 실행되지 않기위한 조건이 while문안에 들어가야된다.
					
					if (inputLimitTimes != 5) {
						// 구분선 for문
						recycleUnderBar();
						
						// 게임로딩 함수
						ai.getGameLoading();
						
						System.out.println(ai.setenceWrapperFront+ "Welcome to RunDino" + ai.setenceWrapperBack);
					
					} else if (inputLimitTimes == 5) {
					
						System.out.println(ai.setenceWrapperFront+ "입력횟수를 초과하였습니다. RunDino 아케이드를 종료합니다." + ai.setenceWrapperBack);

					} else {
					
						System.out.println(ai.setenceWrapperFront + "GAME OVER" + ai.setenceWrapperBack);
					}
				
				if(inputLimitTimes < 5) {
					
					chooseArcadeMap();
					
				} else {
					
					System.out.println(ai.setenceWrapperFront+ "Good Bye RunDino" + ai.setenceWrapperBack);					
				}
	
	}
	
	public static boolean isValid(int inputLimitTimes,int times) {
		
		if (inputLimitTimes < times) {
			return true;
		}
		
		return false;
	}
	
	public void setBoardingSpaceship() {

		System.out.println( ai.setenceWrapperFront + "S ▨ P ▤ A ▨ C ▤ E ▨ S ▤ H ▤ I ▤ P" + ai.setenceWrapperBack);
		
		System.out.println( ai.setenceWrapperFront + "B ▨ O ▤ A ▨ R ▤ D ▨ I ▤ N ▤ G" + ai.setenceWrapperBack);

	}
	
	public static void recycleUnderBar() {
		
		// 구분선 for문
		System.out.print("\n");
		for (int i = 0; i < 12; i ++) {
			System.out.print("☆○RAUNDINO○☆§");
		}
		System.out.print("\n");
		
	}
	
	public void setCType() {
		character = new ArcadeDinosaurType().dinosaurType;
	}
	
	public static void chooseArcadeMap() {
			int arcade_map = 0;
			do {
				try {
					// 구분선 for문
					recycleUnderBar();
					
					System.out.println(ai.setenceWrapperFront + "지구별 아케이드맵을 고르세요" + ai.setenceWrapperBack);
					System.out.println(ai.setenceWrapperFront + "Ground : 0, Desert : 1, Ocean : 2, Sky:3 " + ai.setenceWrapperBack);
					
					chooseNumbers();
					
					int arcade_type = new Scanner(System.in).nextInt();
				
					arcade_map = arcade_type;
				
				} catch ( InputMismatchException e) {
					
					System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)"); //왜 if문으로 조건걸었냐..? trycatch문을 넣으면 프로그램이 종료가 되어버리네..?
				
				}
			
			} while (arcade_map != 0 && arcade_map != 1 && arcade_map != 2 && arcade_map != 3);
			
			//땅 : 0, 사막 : 1, 바다 : 2, 하늘:3
			if(arcade_map == 0) {
			
				System.out.println(ai.setenceWrapperFront + "GROUND에 접속중" + ai.setenceWrapperBack);
			
			}else if(arcade_map == 1) {
			
				System.out.println(ai.setenceWrapperFront + "현재 Ground 베타버전만 오픈되어 있습니다. 빠른시일내에 업데이트오픈할께요! 조금만 기다려주세요:)" + ai.setenceWrapperBack);
			
			}else if(arcade_map == 2) {
			
				System.out.println(ai.setenceWrapperFront + "현재 Ground 베타버전만 오픈되어 있습니다. 빠른시일내에 업데이트오픈할께요! 조금만 기다려주세요:)" + ai.setenceWrapperBack);
			
			}else {
				System.out.println(ai.setenceWrapperFront + "현재 Ground 베타버전만 오픈되어 있습니다. 빠른시일내에 업데이트오픈할께요! 조금만 기다려주세요:)" + ai.setenceWrapperBack);
			}
//				new Ground().run(); // 클래스는 다르지만 메소드명이 똑같으면 다른클래스더라도 실행이된다.
				
	}
	
	public static void chooseNumbers() {
		System.out.println(ai.setenceWrapperFront + "원하는 타입을 숫자로 입력시오." + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "what is your choice? : ");
	}
	
	
	public static void wantToPlayNextStage() {
			
		try {
			Scanner user_input = new Scanner(System.in);
			System.out.println(ai.setenceWrapperFront + "level  " + level + " 게임을 계속 진행 하겠습니까? 아니면 종료하시겠습니까?" + ai.setenceWrapperBack);
			System.out.println(ai.setenceWrapperFront + "No : 0  Yes : 1"+ai.setenceWrapperBack);
			chooseNumbers();
			int user_choice = user_input.nextInt();
			
			if (user_choice == 0) {
				
			}else if (user_choice == 1) {
				
			} else {
				
			}
			
		}catch ( InputMismatchException e) {
			
			System.out.println("문자는 입력할 수 없습니다. 숫자로 입력해주세요:)"); //왜 if문으로 조건걸었냐..? trycatch문을 넣으면 프로그램이 종료가 되어버리네..?
		
		}

	}

	
	public static int wantToRestartStage() {
		
		System.out.println(ai.setenceWrapperFront + character + "가 kill되었습니다." + ai.setenceWrapperBack);
		Scanner ask_about_restart = new Scanner(System.in);
		System.out.println(ai.setenceWrapperFront + "게임을 다시 시작하겠습니까? 아니면 다른맵을 선택하시겠습니까?" + ai.setenceWrapperBack);
		System.out.println(ai.setenceWrapperFront + "No : 0  Yes : 1"+ai.setenceWrapperBack);
		chooseNumbers();
		
		int user_choice = ask_about_restart.nextInt();
		
		if (user_choice != 0 && user_choice != 1) {
			System.out.println("0 또는 1만 입력가능합니다.");
		} else {
		}
		
		return user_choice;
		
}
	
	
	

}
