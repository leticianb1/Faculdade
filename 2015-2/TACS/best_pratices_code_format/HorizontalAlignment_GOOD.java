public class HorizontalAlignment_GOOD {
	private String name = "HorizontalAlignment_BAD";
	private String nickname = "Badass";
	
	public static int sum(int a, int b, int max) throws Exception {
		int sum = a + b;
		if(sum > max) {
			throw new Exception("Max reached");
		}
		return sum;
	}
}
