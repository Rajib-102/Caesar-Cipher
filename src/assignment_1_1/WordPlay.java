package assignment_1_1;

public class WordPlay{
	static boolean isVowel(char ch){
		if(ch== 'a' || ch == 'A' ||
				ch == 'e' || ch == 'E' ||
				ch == 'i' || ch == 'I' ||
				ch == 'o' || ch == 'O' ||
				ch == 'u' || ch == 'U'){
			return true;
		}
		else{
			return false;
		}
	}
	
	static String replaceVowels(String str, char ch){
		String ret = new String();
		for(int i=0; i<str.length(); i++){
			if(isVowel(str.charAt(i)) == true){
				ret += ch;
			}
			else{
				ret += str.charAt(i);
			}
		}
		return ret;
	}

	static String emphasize(String phrase, char ch){
		String ret = new String();
		for(int i=0; i<phrase.length(); i++){
			if(phrase.charAt(i) == ch){
				if(i%2 == 0){
					ret += '*';
				}
				else{
					ret += '+';
				}
			}
			else{
				ret += phrase.charAt(i);
			}
		}
		return ret;
	}

	public static void main(String[] args){
		System.out.println(replaceVowels("Hello world", '*'));
		System.out.println(emphasize("dna ctgaaactga", 'a'));
	}
}
