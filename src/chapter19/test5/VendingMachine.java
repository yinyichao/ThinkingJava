package chapter19.test5;

import chapter15.test3.Generator;


public class VendingMachine {
	private static State state = State.RESTING;
	private static int amount = 0;
	private static Input selection = null;
	enum StateDuration{ TRANSIENT}
	enum State{
		RESTING{
			void next(Input input){
				switch(Category.categorize(input)){
					case MONEY:
						amount+= input.amount();
						state = ADDING_MONEY;
						break;
					case SHUT_DOWN:
						state = TERMINAL;
					default:
				}
			}
		},
		ADDING_MONEY{
			
		},
		DISPENSING(StateDuration.TRANSIENT){
			
		},
		GIVING_CHANGE(StateDuration.TRANSIENT){
			
		},
		TERMINAL{
			
		};
		private boolean isTransient = false;
		State(){
			
		}
		State(StateDuration trans){
			isTransient = true;
		}
		void next(Input input){
			throw new RuntimeException("Only call next(Input input) for non-transient states");
		}
		void next(){
			throw new RuntimeException("Only call next() for StateDuration.TRANSIENT states");
		}
		void output(){
			System.out.println(amount);
		}
	}
	static void run(Generator<Input> gen){
		while(state!=State.TERMINAL){
			state.next(gen.next());
			while(state.isTransient)
				state.next();
			state.output();
		}
	}
	public static void main(String[] args) {
		Generator<Input> gen = new RandomInputGenerator();
		if(args.length == 1)
			gen = new FileInputGenerator(args[0]);
			run(gen);
	}
}
