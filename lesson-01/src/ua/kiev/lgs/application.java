package ua.kiev.lgs;

public class application {

	public static void main(String[] args) {

		boolean name1 = true;
		byte name2 = 100;
		char name3 = 'w';
		double name4 = 5.5;
		float name5 = 25;
		int name6 = 5;
		long name7 = 48L;
		short name8 = 3;

		System.out.println("Byte =" + Byte.MAX_VALUE);
		System.out.println("Byte =" + Byte.MIN_VALUE);

		System.out.println("Double =" + Double.MAX_VALUE);
		System.out.println("Double =" + Double.MIN_VALUE);

		System.out.println("Float =" + Float.MAX_VALUE);
		System.out.println("Float =" + Float.MIN_VALUE);

		System.out.println("Integer =" + Integer.MAX_VALUE);
		System.out.println("Integer =" + Integer.MIN_VALUE);

		System.out.println("Long =" + Long.MAX_VALUE);
		System.out.println("Long =" + Long.MIN_VALUE);

		System.out.println("Short =" + Short.MAX_VALUE);
		System.out.println("Short =" + Short.MIN_VALUE);

		System.out.println("Character =" + Character.MAX_VALUE);
		System.out.println("Character =" + Character.MIN_VALUE);

		int[] array = { 15, 44, 12, 746, 48, 73, 121, 400, 99, 1, 4 };

		int smallest = array[0];
		int largest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest)
				smallest = array[i];
			if (array[i] > largest)
				largest = array[i];

		}

		System.out.println(smallest);
		System.out.println(largest);

	}

}
