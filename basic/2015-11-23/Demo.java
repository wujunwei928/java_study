class Demo
{
	public static void main(String[] args)
	{
		System.out.println("Hello");

		int[] x = new int[3];
		System.out.println(x[1]);

		// print99(9);
	}

	private static void print99(int num)
	{
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println("");
		}
	}
}