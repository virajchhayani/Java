class arraymult2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;// n=row ,m=column
		System.out.println("enter size of row");
		n = sc.nextInt();
		System.out.println("enter size of column");
		m = sc.nextInt();
		int a1[][] = new int[n][m];
		System.out.println("enter array element are");
		for (int p = 0; p < n; p++)// loop for row
		{
			for (int q = 0; q < n; q++)// loop for column
			{
				a1[p][q] = sc.nextInt();
			}
		}
		System.out.println("array elements are [" + p + "" + "[" + q + "]" + arr[p][q]);
		// print array element loop
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print("array elements are [" + i + "]" + "[" + j + "]" + a[i][j]);
			}
			System.out.println("");
		}
	}
}
