
public class MultiD {
	public static void print1D(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void print2D(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print2D(String[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] compileArrays(int[] x, int[] y, int[] z) {
		int fish[][] = { x, y, z };
		return fish;
	}

	public static String[][] evenArray(String[][] words) {
		int x = 0;
		for(int i = 0; i < words.length; i++){
			if(x > words[i].length){
			x = words[i].length;
			}
		}
		for(int i = 0; i <= x; i++){
			words[i]
		}
	}

	public static boolean stringLength(int[] lens, String[][] words) {

	}

	public static int[] thirdCol(int[][] nums) {
		int a = 0;
		int i = 0;
		int nums2[] = new int[i];
		for (; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (j == 3) {
					nums[i][j] = a;
				}
			}
			a = nums2[i];

		}
		return a;
	}

	public static boolean dupes(String[] words) {
		for (int i = 0; i < words.length; i++) 
			for (int j = 0; j < words.length; j++)
				if (j == i)
					continue;
				else if (words[i] == words[j])
					return true;
			return false;
	}

	public static boolean multiDupes(String[][] words) {
		for(int i = 0; i < words.length; i++)
			for(int j = 0; j < words.length; j++)
				for()
				
	}

	public static int[][] noEvens(int[][] nums) {
		for (int x = 0; x < nums.length; x++) {
			for (int y = 0; y < nums[x].length; y++) {
				if (nums[x][y] % 2 == 0) {
					nums[x][y] = 5;
				} else {

				}
			}
		}
		return nums;
	}

}
