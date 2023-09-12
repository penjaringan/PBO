public class IndexedSequentialSearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        int blockSize = 5;
        int searchValue = 27;

        int[] indexArray = createIndexArray(array, blockSize);
        System.out.println("Index Array: " + java.util.Arrays.toString(indexArray));

        int result = indexedSearch(array, indexArray, searchValue, blockSize);
        if (result != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan.");
        }
    }

    public static int[] createIndexArray(int[] array, int blockSize) {
        int numOfIndices = (int) Math.ceil((double) array.length / blockSize);
        int[] indexArray = new int[numOfIndices];

        for (int i = 0; i < numOfIndices; i++) {
            indexArray[i] = array[Math.min(i * blockSize, array.length - 1)];
        }

        return indexArray;
    }

    public static int indexedSearch(int[] array, int[] indexArray, int x, int blockSize) {
        System.out.println("Mulai pencarian...");

        for (int i = 0; i < indexArray.length; i++) {
            System.out.println("Memeriksa indeks ke-" + i + " dengan nilai " + indexArray[i]);
            if (indexArray[i] == x) {
                System.out.println("Elemen ditemukan di indeks array: " + (i * blockSize));
                return i * blockSize;
            }

            if (i == indexArray.length - 1 || indexArray[i + 1] > x) {
                int start = i * blockSize;
                int end = Math.min((i + 1) * blockSize, array.length);
                System.out.println("Elemen kemungkinan berada antara indeks " + start + " dan " + end);

                // Pencarian sekuensial dalam blok
                for (int j = start; j < end; j++) {
                    System.out.println("Memeriksa elemen ke-" + j + " dengan nilai " + array[j]);
                    if (array[j] == x) {
                        System.out.println(" Elemen ditemukan di indeks array: " + j);
                        return j;
                    }
                }
                break;
            }
        }
        System.out.println("Pencarian selesai. Elemen tidak ditemukan.");
        return -1;
    }
}
