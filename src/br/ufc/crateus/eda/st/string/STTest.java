package br.ufc.crateus.eda.st.string;

public class STTest {

	public static void main(String[] args) {
		
		StringST<String> sst = new StringST<>();
		sst.extractTitle();
		
//		Item 1
		System.out.println(sst.longestPreffixOf("A bela e a fera"));
		
	
//		Item 2
//		for(String title : sst.titlesWithPreffix("As")) {
//			System.out.println(title);
//		}
		
	}
}
