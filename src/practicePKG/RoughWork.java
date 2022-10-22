package practicePKG;

public class RoughWork {

	public static void main(String[] args) {
		int x = 100;
		int y = 150;
		int z = 190;

		if (x >= y) {
			if (x >= z) {
				if (x == y) {
					System.out.println("x and y are same");
				} else {
					System.out.println("X is greater");
				}
			}
		} else if (y >= x) {
			if (y >= z) {
				if (y == z) {
					System.out.println(" z and y are same");
				} else {
					System.out.println("y is greater");
				}
			} else if (z >= x) {
				if (z >= y) {
					if (z == x) {
						System.out.println(" z and x are same");
					} else {
						System.out.println("z is greater");
					}
				}
			}
		}
	}
}
