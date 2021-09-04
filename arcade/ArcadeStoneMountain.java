package arcade;

import dinosaur.Dinosaur;
import dinosaur.DinosaurMotion;


public class ArcadeStoneMountain extends ArcadeGround {
	private String sprite = "sprite";
	private String coke = "coke";
	private String mountainTop = "mountainTop";
	private String flag = "flag";
	private Dinosaur da = new Dinosaur();
	
	void runOnStoneMountain() {
		
		//에일리언초기화 토끼로
		aog.setGroundAlienRabbit();
		da.move();
		dm.motionOfRunDino();
		aln.attackingAlien();
		aln.damegedAlien();
		dm.motionOfKilledDino();
		ds.lostHealthPoint();
		
		int validForRestart = wantToRestartStage();
		 
		if (validForRestart == 0) {
			System.out.println(ai.setenceWrapperFront + "GAME OVER" + ai.setenceWrapperBack);
		} else {
			runOnStoneMountain();
		}
	}

}
