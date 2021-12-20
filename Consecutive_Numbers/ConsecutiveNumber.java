package interview;

import java.util.ArrayList;

public class ConsecutiveNumber {

	public static void main(String[] args) {

		ConsecutiveNumber cn = new ConsecutiveNumber();
		int[] number = { -5,-3,-2,-1,0,1,2,1,0,-1,-2,-3,-4,5,6,7 };
		System.out.println("Longest consecutive run: "+cn.solution(number));

	}

	private int solution(int[] A) {
		int count = 1;
		String direction = "";
		// System.out.println(A.length);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] + 1 == A[i + 1]) {
				if (direction.equals("dec")) {
					result.add(count);
					count = 2;
					direction = "inc";
					continue;
				}
				direction = "inc";
				count++;

			} else if (A[i] - 1 == A[i + 1]) {
				if (direction.equals("inc")) {
					result.add(count);
					count = 2;
					direction = "dec";
					continue;
				}
				direction = "dec";
				count++;

			} else {
				result.add(count);
				count = 1;
			}

		}
		result.add(count);
		Integer max = result.stream().mapToInt(v -> v).max().orElseThrow();
		return max;

	}

}
