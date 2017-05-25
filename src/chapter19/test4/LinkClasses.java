package chapter19.test4;

enum LinkClasses {
	WINKEN{
		void behavior(){
			System.out.println("Behavior1");
		}
	},
	BLINKEN{
		void behavior(){
			System.out.println("Behavior2");
		}
	},
	NOD{
		void behavior(){
			System.out.println("Behavior3");
		}
	};
	abstract void behavior();
}
