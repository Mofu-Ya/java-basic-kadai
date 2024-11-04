package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		// 自分のジャンケンの手を入力する
		String myChoice = jyanken.getMyChoice();
		
		// 対戦相手のジャンケンの手が乱数で選ばれる
		String cpuChoice = jyanken.getRandom();
		
		// ジャンケンの結果を出力する
		jyanken.playGame(myChoice, cpuChoice);

	}

}
