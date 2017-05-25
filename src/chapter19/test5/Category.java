package chapter19.test5;
import static chapter19.test5.Input.ABORT_TRANSACTION;
import static chapter19.test5.Input.CHIPS;
import static chapter19.test5.Input.DIME;
import static chapter19.test5.Input.DOLLAR;
import static chapter19.test5.Input.NICKEL;
import static chapter19.test5.Input.QUARTER;
import static chapter19.test5.Input.SOAP;
import static chapter19.test5.Input.SODA;
import static chapter19.test5.Input.STOP;
import static chapter19.test5.Input.TOOTHPASTE;

import java.util.EnumMap;
public enum Category {
	MONEY(NICKEL,DIME,QUARTER,DOLLAR),
	ITEM_SELECTION(TOOTHPASTE,CHIPS,SODA,SOAP),
	QUIT_TRANSACTION(ABORT_TRANSACTION),
	SHUT_DOWN(STOP);
	private Input[] values;
	Category(Input... types) {
		values = types;
	}
	private static EnumMap<Input,Category> categories = new EnumMap<Input, Category>(Input.class);
	static{
		for(Category c :Category.class.getEnumConstants()){
			for (Input type : c.values) {
				categories.put(type, c);
			}
		}
	}
	public static Category categorize(Input input){
		return categories.get(input);
	}
}
