package daytwo;

public class NestedIfElse {
		public static void main(String[] args) {
			int a = 82;
			int b = 19;
			int c = 42;
			System.out.println("The largest number is");
			if(a >b) {
				if(a>c)
					System.out.println(a);
				else
					System.out.println(c);
			}else {
				if(c>b)
					System.out.println(c);
				else
					System.out.println(b);
			}
		}

	}


