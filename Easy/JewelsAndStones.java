public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
		int solution = 0;
		for(char c : S.toCharArray()) {
			if(J.indexOf(c) != -1) {
				solution++;
			}
		}
		return solution;
	}
}
