
public class CorrectMultiD {
	public static void print1D(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		System.out.println();
	}

	public static void print2D(int[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				if (j + 1 == x[i].length)
					System.out.print(x[i][j] + "\n");
				else
					System.out.print(x[i][j] + " ");
	}

	public static void print2D(String[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				if (j + 1 == x[i].length)
					System.out.print(x[i][j] + "\n");
				else
					System.out.print(x[i][j] + " ");
	}

	public static int[][] compileArrays(int[] x, int[] y, int[] z) {
		return new int[][] { x, y, z };
	}

	public static String[][] evenArray(String[][] x) {
		int num = x[0].length;
		for (int i = 0; i < x.length; i++)
			num = Math.min(x[i].length, num);
		String[][] newArray = new String[x.length][num];
		for (int i = 0; i < newArray.length; i++)
			for (int j = 0; j < newArray[i].length; j++)
				newArray[i][j] = x[i][j];
		return newArray;
	}

	public static boolean stringLength(int[] x, String[][] y) {
		for (int i = 0; i < y.length; i++)
			for (int j = 0; j < y[i].length; j++)
				if (y[j][i].length() != x[i])
					return false;
		return true;
	}

	public static int[] thirdCol(int[][] x) {
		int[] newArray = new int[x.length];
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = x[i][2];
		return newArray;
	}

	public static boolean dupes(String[] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x.length; j++)
				if (j == i)
					continue;
				else if (x[i] == x[j])
					return true;
		return false;
	}

	public static boolean multiDupes(String[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				for (int k = 0; k < x.length; k++)
					for (int l = 0; l < x[k].length; l++)
						if (j == l && i == k)
							continue;
						else if (x[i][j] == x[k][l])
							return true;
		return false;
	}

	public static int[][] noEvens(int[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				if (x[i][j] % 2 == 0)
					x[i][j] = 5;
		return x;
	}
}
