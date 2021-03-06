import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.
//
public class DiceBag {
	private List<Token> bag = new ArrayList<Token>();
	
	public void addToken(Token t) {
		bag.add(t);
	}

	public Token drawToken() {
		int upperRange = bag.size();
		Token t = null;
		if (upperRange > 0 ) {
			int die = ThreadLocalRandom.current().nextInt(0, upperRange);
			t = bag.remove(die);
		}
		return t;
	}
	@Override
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
		
		return ret;
	}
}
