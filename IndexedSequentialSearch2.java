public class IndexedSequentialSearch2 {

    public static void main(String[] args) {
        String[] array = {"Agus", "Budi", "Citra", "Dewi", "Eko", "Fahri", "Gita", "Hani", "Indah", "Joko", "Kiki", "Lia", "Mona", "Nina", "Oki", "Putri", "Rizki", "Sari", "Tono", "Umi"};
        int blockSize = 5;
        String searchValue = "Citra";

        String[] indexArray = createIndexArray(array, blockSize);
        System.out.println("Index Array: " + java.util.Arrays.toString(indexArray));

        int result = indexedSearch(array, indexArray, searchValue, blockSize);
        if (result != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan.");
        }
    }

    public static String[] createIndexArray(String[] array, int blockSize) {
        int numOfIndices = (int) Math.ceil((double) array.length / blockSize);
        String[] indexArray = new String[numOfIndices];

        for (int i = 0; i < numOfIndices; i++) {
            indexArray[i] = array[Math.min(i * blockSize, array.length - 1)];
        }

        return indexArray;
    }

    public static int indexedSearch(String[] array, String[] indexArray, String x, int blockSize) {
        System.out.println("Mulai pencarian...");

        // Mencari dalam indeks
        for (int i = 0; i < indexArray.length; i++) {
            System.out.println("Memeriksa indeks ke-" + i + " dengan nilai " + indexArray[i]);
            if (indexArray[i].compareTo(x) == 0) {
                System.out.println("Elemen ditemukan di indeks array: " + (i * blockSize));
                return i * blockSize;
            }

            if (i == indexArray.length - 1 || indexArray[i + 1].compareTo(x) > 0) {
                int start = i * blockSize;
                int end = Math.min((i + 1) * blockSize, array.length);
                System.out.println("Elemen kemungkinan berada antara indeks " + start + " dan " + end);

                // Pencarian sekuensial dalam blok
                for (int j = start; j < end; j++) {
                    System.out.println("Memeriksa elemen ke-" + j + " dengan nilai " + array[j]);
                    if (array[j].compareTo(x) == 0) {
                        System.out.println("Elemen ditemukan di indeks array: " + j);
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
