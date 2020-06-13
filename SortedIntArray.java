import java.util.Arrays;

public class SortedIntArray {

	public static void main(String[] args) {

		int[] aArray = { 1, 4, 6, 9, 10 };
		int[] bArray = { 2, 3, 5, 7, 12, 15, 20 };
		int firstArraySize = aArray.length;
		int secondArraySize = bArray.length;
		int bothArraySize = firstArraySize + secondArraySize;
		int[] resultArray = new int[bothArraySize];
		int aArrayIdx = 0, bArrayIdx = 0;

		for (int loopCount = 0; loopCount < bothArraySize; loopCount++) {
			if ((aArrayIdx < firstArraySize) && (bArrayIdx < secondArraySize)) {
				if (aArray[aArrayIdx] < bArray[bArrayIdx]) {
					resultArray[loopCount] = aArray[aArrayIdx];
					aArrayIdx++;
				} else {
					resultArray[loopCount] = bArray[bArrayIdx];
					bArrayIdx++;
				}
			} else if (aArrayIdx < firstArraySize) {
				resultArray[loopCount] = aArray[aArrayIdx];
				aArrayIdx++;
			} else {
				resultArray[loopCount] = bArray[bArrayIdx];
				bArrayIdx++;
			}
		}
		System.out.println("First Array: " + Arrays.toString(aArray));
		System.out.println("Second Array: " + Arrays.toString(bArray));
		System.out.println("Concatenated Sorted Array: " + Arrays.toString(resultArray));
	}
}
