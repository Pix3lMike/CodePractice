public class KittyLicks {
	public static void main (String[] args) {
		
		int NumMax = 6;
		int Rand = (int) (Math.random() * NumMax);
		int x = Math.round(Rand);
		
		while (x > 0) {
			String[] wordList = {"hand", "nose", "cheek", "ear", "forehead"};
			int listLength = wordList.length;
			int rand1 = (int) (Math.random() * listLength);
			System.out.println("Kitty licks your" + " " + wordList[rand1]);
			x = x - 1;
		}
		System.out.println("..... ....  ....");
		System.out.println("Kitty walks away now.");
	}
}
