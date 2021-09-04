package arcade;

public class ArcadeAlien extends ArcadeMain {
	public static String alien = "에일리언"; //에일리언은ㅇ 토끼외에 블랙쏠트,선인장,모래폭풍,바위,새,유니콘등이 존재
	
	public void attackingAlien() {
		System.out.println(ai.setenceWrapperFront + alien +"이 공격한다." + ai.setenceWrapperBack);
	}
	
	public void damegedAlien() {
		System.out.println(ai.setenceWrapperFront + alien +"이 디노의 공격을 피하지 못했다." + ai.setenceWrapperBack);
	}

	public void failedToAvoidAlien() {
		// TODO Auto-generated method stub
		
	}
	
}
