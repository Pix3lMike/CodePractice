public class RandomNumberTest {
	public static void main (String[] args) {
		
		int NumMax = 6;
		int Rand = (int) (Math.random() * NumMax);
		int x = (Math.round(Rand));
		
		while (x > 0) {
			System.out.println(x);
			x = (x - 1);
		}
	}
}