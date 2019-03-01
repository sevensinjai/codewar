import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class EnoughIsEnough {

	public static void main(String args[]) {

		int[] niceArray = deleteNth(new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3);
		System.out.println(Arrays.toString(niceArray));

	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		// Code here ;)
		Map<Integer, Integer> checkOccurence = new HashMap<Integer, Integer>();
		ArrayList<Integer> niceSequence = new ArrayList();
		for (int x : elements) {
			int occcurence;
			if (checkOccurence.get(x) == null) {
				occcurence = 0;
			} else {
				occcurence = checkOccurence.get(x);
			}
			occcurence++;
			if (occcurence > maxOccurrences) {
				continue;
			} else {
				checkOccurence.put(x, occcurence);
				niceSequence.add(x);
			}
		}
		int[] niceArray = niceSequence.stream().mapToInt(i -> i).toArray();
		return niceArray;
	}

}