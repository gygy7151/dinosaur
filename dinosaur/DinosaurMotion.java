package dinosaur;

public class DinosaurMotion extends Dinosaur {

	String[] runDino = {
		"                     ▲ △ ▲ △ ▲ △ ▲",
		"                  ◁ □□□□_□□□□□□□□□□",
		"                  ◀ □□□□º□□□□□□□□□□□",
		"                  ◁ □□□□□□□□□□□□□□□□",
		"      ▲ △ ▲        ◀ □□□□ ▼ ▼ ▼ ▼ ",
		"      □□□□□ ▲ △      ◁ □□□□□□□□□□",
		"            □□□□ ▲ △ ▲ △ □□□□□",
		"               □□□□□□□□□□□□□□□□□",
		"      DINO RUN    □□□□□□□□□□    □□",
		"                □□□□□□□□        ▼▼",
		"                 □□□□□",
		"   〓〓〓〓〓〓〓〓 □□□□",
		"   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ ▲▲▲"
	};
	
	String[] killedDino = {
			"                     ▲ △ ▲ △ ▲ △ ▲",
			"                  ◁ □□□□□□□□□□□□□□□□",
			"                  ◀ □□□□X□□□□□□□□□□□",
			"                  ◁ □□□□□□□□□□□□□□□□",
			"      ▲ △ ▲        ◀ □□□□ ▼ ▼ ▼ ▼",
			"      □□□□□ ▲ △      ◁ □□□□□□□□□□",
			"            □□□□ ▲ △ ▲ △ □□□□□",
			"               □□□□□□□□□□□□□□□□□",
			"      DINO KILLED □□□□□□□□□□    □□",
			"                □□□□□□□□        ▼▼",
			"                 □□□□□",
			"                   □□□□",
			"                    ▲▲▲"
	};
	
	public void motionOfRunDino() {
        for (int i = 0; i < runDino.length; i++) {
        	System.out.println(runDino[i]);
        }
	}
	
	public void motionOfKilledDino() {
        for (int i = 0; i < killedDino.length; i++) {
        	System.out.println(killedDino[i]);
        }
	}
}
