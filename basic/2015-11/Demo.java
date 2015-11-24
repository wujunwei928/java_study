class Demo
{
	public static void main(String[] args)
	{
		System.out.println("Hello");

		int[] arr = new int[3];
		// arr = null;
		System.out.println(arr[1]);

		int[] arr2 = {3, 6, 5, 1, 8, 9};
		printArray(arr2);
		reverseArray(arr2);	//翻转数组
		printArray(arr2);
		selectSort(arr2);	//选择排序
		printArray(arr2);
		bubbleSort(arr2);	//冒泡排序
		printArray(arr2);
		insertSort(arr2);	//插入排序
		printArray(arr2);

		// print99(9);
	}

	/**
	 * 九九乘法表
	 * @param num [description]
	 */
	private static void print99(int num)
	{
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println("");
		}
	}

	/**
	 * 打印数组
	 * @param arr 数组
	 */
	public static void printArray(int[] arr)
	{
		System.out.print('[');
		for (int i=0; i<arr.length; i++) {
			if (i<arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
	}

	/**
	 * int数组选择排序
	 * @param arr init类型的数组
	 */
	private static void selectSort(int[] arr)
	{
		int len = arr.length;
		for (int i=0; i<len-1; i++) {
			for (int j=i+1; j<=len-1; j++) {
				if (arr[i] < arr[j]) {
					// int temp = arr[i];
					// arr[i] = arr[j];
					// arr[j] = temp;
					swap(arr, i, j);
				}
			}
		}
	}

	/**
	 * int数组冒泡排序
	 * @param arr int数组
	 */
	private static void bubbleSort(int[] arr)
	{
		int len = arr.length;
		for (int i=0; i<len-1; i++) {
			for (int j=0; j<len-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					// int temp = arr[j];
					// arr[j] = arr[j+1];
					// arr[j+1] = temp;
					swap(arr, j, j+1);
				}
			}
		}
	}

	/**
	 * int数组插入排序
	 * @param arr int数组
	 */
	private static void insertSort(int[] arr)
	{
		int len = arr.length;
		for (int i=0; i<len-1; i++) {
			for (int j=i+1; j>0; j--) {
				if (arr[j] > arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
	}

	/**
	 * 交换数组两个角标的值的位置
	 * @param arr 数组
	 * @param a   角标值1
	 * @param b   角标值2
	 */
	private static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	 * 翻转数组
	 * @param arr 数组
	 */
	private static void reverseArray(int[] arr)
	{
		for (int start=0,end=arr.length-1; start<end; start++,end--) {
			swap(arr,start,end);
		}
	}




}