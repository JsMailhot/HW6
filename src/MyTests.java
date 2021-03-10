import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class MyTests {
	private DiceBag myDiceBag;
	@BeforeEach
	void setUp() throws Exception
	{
		myDiceBag = new DiceBag();
	}
	@Test
	void testDieInBag() {
		OrderDie myOrderDie = new OrderDie("USA", "BLUE");
		myDiceBag.addToken(myOrderDie);
		assertEquals(myDiceBag.drawToken(), myOrderDie);
	}
	@Test
	void testDiceBagString() {
		assertEquals(myDiceBag.toString(), " Dice left: 0\n");
	}
	@Test
	void testDiceBagFiveDice() {
		List<Token> myOrderDice = new ArrayList<Token>() {
			{
				add(new OrderDie("UK", "BLUE"));
				add(new OrderDie("UK", "BLUE"));
				add(new OrderDie("UK", "BLUE"));
				add(new OrderDie("USA", "RED"));
				add(new OrderDie("USA", "RED"));
			}
		};
		for(Token t:myOrderDice)
		{
			myDiceBag.addToken(t);
		}
		String res = " Dice left: " + myOrderDice.size() + "\n";
		for (Token t:myOrderDice) {
			res += t.toString() + "\n";
		}
		assertEquals(myDiceBag.toString(), res);
	}
}
