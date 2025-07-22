package day2;

public class NestedForLoop {
		public static void main(String[] args) {
			int start=15;
			int end=30;
			for(int i = start; i<=end; i++) {
				for (int j = 1; j<=20; j++) {
					System.out.println(i + "*" +j + "=" + i * j);
				}
				System.out.println();
			}
		}
	}

