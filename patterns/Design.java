package patterns;

public class Design {

	public static void main(String[] args) {
		pattern2(5);
		pattern5(5);

	}
	
	static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
	}
	
	static void pattern5(int n) {
        for (int row = 0; row < 2*n; row++) {
            int TotalColInRow = row > n ? 2*n- row :row;
            for (int col = 0; col <TotalColInRow ; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
        }
}
