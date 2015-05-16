package ex10_01;

public class StringChanger {
	
	public String addEscapeSequence(String words)
	{
		char characters[] = new char[words.length()];
		String res = "";
		words.getChars(0, words.length(), characters, 0);
		for(char character : characters){
			if(character == '\n')
			{
				res += "\\n";
			}
			else if(character == '\t')
			{
				res += "\\t";
			}
			else if(character == '\b')
			{
				res += "\\b";
			}
			else if(character == '\r')
			{
				res += "\\r";
			}
			else if(character == '\f')
			{
				res += "\\f";
			}
			else if(character == '\\')
			{
				res += "\\\\";
			}
			else if(character == '\'')
			{
				res += "\\\'";
			}
			else if(character == '\"')
			{
				res += "\\\"";
			}
			else
			{
				res += character;
			}
		}
		return res;
	}
}
