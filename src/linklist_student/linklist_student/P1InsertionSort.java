package Short;

public class PenInsertionSort {

	
	public static void insertionSort(Pen[] pens) {
		int n = pens.length;

		for (int i = 1; i < n; ++i) {
			Pen key = pens[i];
			int j = i - 1;

			while (j >= 0 && pens[j].getPen_id() > key.getPen_id()) {
				pens[j + 1] = pens[j];
				j = j - 1;
			}

			pens[j + 1] = key;
		}
	}

	public static void printArray(Pen[] pens) {
		for (Pen pen : pens) {
			System.out.println(pen);
		}
	}

	public static void main(String[] args) {

		Pen[] pens = new Pen[5];
		pens[0] = new Pen(3, "Gel", 2.5);
		pens[1] = new Pen(1, "Ballpoint", 1.5);
		pens[2] = new Pen(5, "Fountain", 5.0);
		pens[3] = new Pen(4, "Marker", 3.0);
		pens[4] = new Pen(2, "Rollerball", 2.0);

		System.out.println("Array of Pens (Unsorted):");
		printArray(pens);

		insertionSort(pens);

		printArray(pens);
	}
}
