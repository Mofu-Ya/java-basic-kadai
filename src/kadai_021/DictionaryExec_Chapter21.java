package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();
		
		String[] checkWords = {"apple", "banana", "grape", "orange"};
		
		for(String word : checkWords) {
			if(dict.checkWord(word)) {
				System.out.println(word + ": " + dict.getWord(word));
			} else {
				System.out.println(word + ": 辞書に登録されていませんでした。");
			}
		}
					
	}
    
}
