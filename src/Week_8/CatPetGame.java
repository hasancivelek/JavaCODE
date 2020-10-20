package Week_8;

public class CatPetGame {
	
	private int moodOfCat=0;
	private int hunger=10;
	private int sleep=0;
	
	void info() {
		System.out.println("Mood:" +moodOfCat);
		System.out.println("Hunger: "+hunger);
		System.out.println("Slep: "+sleep);
	}
	
	void feed() {
		hunger--;
		sleep++;
		moodOfCat++;
	}
	void ignore() {
		moodOfCat--;
		sleep--;
		hunger++;
	}
	void play() {
		hunger++;
		sleep++;
		moodOfCat++;
		
		
	}

}
