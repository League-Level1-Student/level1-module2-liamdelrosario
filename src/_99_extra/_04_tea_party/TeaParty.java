package _99_extra._04_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isWoman && isKnighted) {
			return "Hello Lady "+name;
		}
		else if(!isWoman && isKnighted) {
			return "Hello Sir "+name;
		}
		else if(isWoman && !isKnighted) {
			return "Hello Ms. "+name;
		}
		else  {
			return "Hello Mr. "+name;
		}
	}
}