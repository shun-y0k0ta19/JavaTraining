package ex10_02;

public class StringChanger {
	
	public String addEscapeSequence(String words)
	{
		char characters[] = new char[words.length()];
		String res = "";
		words.getChars(0, words.length(), characters, 0);
		for(char character : characters){
			switch(character){
			case '\n':
				res += "\\n";
				break;
			case '\t':
				res += "\\t";
				break;
			case '\b':
				res += "\\b";
				break;
			case '\r':
				res += "\\r";
				break;
			case '\f':
				res += "\\f";
				break;
			case '\\':
				res += "\\\\";
				break;
			case '\'':
				res += "\\\'";
				break;
			case '\"':
				res += "\\\"";
				break;
			default:
				res += character;
			}
		}
		return res;
	}
}
