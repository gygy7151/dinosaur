package arcade;

public class ArcadeIntro extends ArcadeMain {	
	//세계관 설명하는거
	public static String setenceWrapperFront = "\n ▤▥▨.▧▨▧.▤▥▨.▧▤▥.▨▧▤..꧁༺  ";
	public static String setenceWrapperBack = "༻꧂..▤▥▨.▧▨▧.▤▥▨.▧▤▥.▨▧▤ ";
	
	static void getGameLoading()  {
		
		for ( int i = 0; i < 8; i++) {
			System.out.println( setenceWrapperFront + "R ▨ U ▤ N ▨ D ▤ I ▨ N ▤ O" + setenceWrapperBack);
		}
	}
	
	static void getGameStoryIntro() {
		
		System.out.println(setenceWrapperFront + "런디노 스페이스에 탑승하신 디노 여러분들을 환영합니다. 이 메세지를 읽고 있다면, 이미 2994년 7월 17일이겠군요.."+ setenceWrapperBack);
		
		System.out.println(setenceWrapperFront + "여러분들은 모두 저와 함께 우리 별과 가족, 그리고 동료를 지키기 위해 동참해주셨습니다. 저는 에스텔라데디노의 창조자 크레아도르 입니다"+ setenceWrapperBack);
		
		System.out.println(setenceWrapperFront + "에스텔라데디노는 현재 심각한 자원고갈 및 위기에 마주하고 있습니다. 저희는 긴시간 이 문제를 놓고 고민했습니다."+ setenceWrapperBack);

		System.out.println(setenceWrapperFront + "디노 여러분들이 우리별을 위협하는 지구별의 에이리언들을 물리치고 지구별의 자원을 가져와주시길 바랍니다." + setenceWrapperBack);
						
//		System.out.println( setenceWrapperFront + "DINO 컨트롤키는 {1 : 점프}, {2 : 낙하비행,엎드리기,다이빙} 입니다. " + setenceWrapperBack);
		
		System.out.println(setenceWrapperFront + " 지구별로 헌터게임을 시작하시겠습니까? 출정을 원하시면 1을 누르고 엔터키를 눌러주세요."+ setenceWrapperBack);
				
	}
}
