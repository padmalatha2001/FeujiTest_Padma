package week10_java_padmalatha;

import java.util.stream.IntStream;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		IntStream.rangeClosed(1, 5).forEach(row -> {
			int sp = k - row + 1;
			while (sp-- > 1) {
				System.out.print(" ");
			}
			IntStream.rangeClosed(1, row).forEach(col -> {

				System.out.print("* ");
			});
			System.out.println();
		});

		IntStream.rangeClosed(1, 4).forEach(row -> {
			int sp = row;
			int st = 4 - row + 1;
			while (sp-- >= 1) {
				System.out.print(" ");
			}
			IntStream.rangeClosed(1, st).forEach(col -> {
				System.out.print("* ");
			});
			System.out.println();
		});
	}

}
