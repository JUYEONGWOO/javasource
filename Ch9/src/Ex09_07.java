
public class Ex09_07 {

	public static void main(String[] args) {
		
		String str ="     ÇÑ±Û    ABCd    efgh        ";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) != ' ') {
				result += str.substring(i,i+1);
				
			}
		}
		
		
		System.out.println("[" + str + "]");
		System.out.println("[" + result + "]");
	}

}
