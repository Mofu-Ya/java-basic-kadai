package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String myChoice;
		
		while (true) {
			// 自分のジャンケンの手を入力する
			System.out.println("じゃんけんします。自分の手を入力してください。");
			System.out.println("r: グー  s:チョキ  p: パー ");
			myChoice = scanner.nextLine();
			
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p") ) {
				// 正しいジャンケンの手である場合
				// ジャンケンクラスを実行するクラスに、自分のジャンケンの手を返す
				break;
			} else {				
				// 正しいジャンケンの手でない場合
				// エラーを出力し、再度相手のジャンケンの手を選ぶ
				System.out.println("入力エラー: 無効な入力です。r か s か p を入力してください。");
			}
			
		}
				
		scanner.close();
		
		return myChoice;
	}
	
	public String getRandom() {
		String cpuChoice = "";
		// 配列にジャンケンの手をセットする
		String[] cpuHand = {"r", "p", "s"};
		
		// 乱数で対戦相手のジャンケンの手を選ぶ
		int num = (int)Math.floor(Math.random() * 3);
		cpuChoice = cpuHand[num];
		
		// ジャンケンクラスを実行するクラスに、対戦相手のジャンケンの手を返す
		
		return cpuChoice;
	
	}
	
	public void playGame(String myChoice, String cpuChoice) {
		HashMap<String, String> jyankenHands  = new HashMap<String, String>();
		jyankenHands.put("r", "グー");
		jyankenHands.put("s", "チョキ");
		jyankenHands.put("p", "パー");
		
		// 自分と対戦相手のジャンケンの手を出力する
		String myHand = jyankenHands.get(myChoice);
		String cpuHand = jyankenHands.get(cpuChoice);
		System.out.println("自分の手：" + myHand + "  対戦相手の手：" + cpuHand);		
		
		// 自分と対戦相手のジャンケンの手を比較する	
		String result;
		if(myHand.equals(cpuHand)) {
			result ="あいこです";
		} else if((myHand.equals("グー") && cpuHand.equals("チョキ")) ||
                (myHand.equals("チョキ") && cpuHand.equals("パー")) ||
                (myHand.equals("パー") && cpuHand.equals("グー"))) {
			result ="自分の勝ちです";
		} else {
			result ="自分の負けです";
		}
		
		// ジャンケンの結果を出力する
		System.out.println("結果：");
		System.out.println(result);
		
	}
}
