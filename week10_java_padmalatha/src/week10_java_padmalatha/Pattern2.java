package week10_java_padmalatha;

import java.util.stream.IntStream;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.rangeClosed(1, 5).forEach(row -> {
			IntStream.rangeClosed(1, 5).forEach(col -> {
				if (row == 1 || col == 1 || row == 5 || col == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			});
			System.out.println();
		});

	}

}
