package Short;

public class PenSelectionSort {

	public static void selectionSort(Pen[] pens) {
		int n = pens.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (pens[j].getCost() < pens[minIndex].getCost()) {
					minIndex = j;
				}
			}

			Pen temp = pens[minIndex];
			pens[minIndex] = pens[i];
			pens[i] = temp;
		}
	}

	public static void printArray(Pen[] pens) {
		for (Pen pen : pens) {
			System.out.println(pen);
		}
	}

	public static void main(String[] args) {
		Pen[] pens = new Pen[5];
		pens[0] = new Pen(1, "Gel", 2.5);
		pens[1] = new Pen(2, "Ballpoint", 1.5);
		pens[2] = new Pen(3, "Fountain", 5.0);
		pens[3] = new Pen(4, "Marker", 3.0);
		pens[4] = new Pen(5, "Rollerball", 2.0);

		printArray(pens);

		selectionSort(pens);

		printArray(pens);
	}
}
