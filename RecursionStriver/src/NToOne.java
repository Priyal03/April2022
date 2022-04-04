
public class NToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		recursionOne(1, n);

		recursionTwo(n, n);

		backTrackOne(n, n); // start with max number then go till the least and break the recursion. print
						// each stack elements

		backTackTwo(1, n); // start with min number go till end and come back to print from stack
	}

	/*
	 * print 5 to 1
	 */
	private static void recursionTwo(int i, int n) {
		// TODO Auto-generated method stub
		if (i < 1)
			return;

		System.out.println(i);
		recursionTwo(i - 1, n);
	}

	/*
	 * print 1 to 5
	 */
	private static void recursionOne(int i, int n) {
		// TODO Auto-generated method stub
		if (i > n)
			return;

		System.out.println(i);
		recursionOne(i + 1, n);
	}

	/*
	 * print 1 to 5
	 */
	private static void backTrackOne(int i, int n) {
		// TODO Auto-generated method stub
		if (i < 1)
			return;

		backTrackOne(i - 1, n);
		System.out.println(i);
	}

	/*
	 * print 5 to 1
	 */
	private static void backTackTwo(int i, int n) {
		// TODO Auto-generated method stub
		if (i > n)
			return;

		backTackTwo(i + 1, n);
		System.out.println(i);
	}

}
