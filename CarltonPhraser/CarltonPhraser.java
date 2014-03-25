public class CarltonPhraser {
	public static void main (String[] args) {
		
		String[] wordListOne = {"best", "greatest", "sweetest", "most patient", "smartest", "most loving", "most android programming", "fastest driving, no coning man"};	
		String[] wordListTwo = {"love", "appreciate", "adore", "enjoy", "groove on", "kiss on", "sweet talk to", "tolerate to an extremely high degree"};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		System.out.println("Carlton is the " + "" + wordListOne[rand1] + " " + "and I " + "" + wordListTwo[rand2] + " " + "him!");
	}
}