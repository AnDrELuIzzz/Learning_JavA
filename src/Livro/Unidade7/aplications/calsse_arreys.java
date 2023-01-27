package Learning_Java.src.Livro.Unidade7.aplications;

import java.util.Arrays;

public class calsse_arreys {
    // classifica doubleArray em ordem crescente
    public static void main(String[] args) {
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };

        Arrays.sort(doubleArray);// organiza em ordem cescente
        System.out.printf("%ndoubleArray: ");
        for (double value : doubleArray)
            System.out.printf("%.1f ", value);

        // preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);// fill-> inserir calores o array

        displayArray(filledIntArray, "filledIntArray");

        // copia array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        /*
         * assinatura: public static void arraycopy(Object src, int srcPos, Object dest,
         * Os argumentos src e dest representam os vetores origem e destino,
         * respectivamente (em nosso exemplo,
         * esses vetores chamam-se a e b). O argumento srcPos é a posição inicial no
         * array origem.
         */
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // verifica a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                (b ? "==" : "!="));

        // verifica a igualdade de intArray e filledIntArray
        b = Arrays.equals(intArray, filledIntArray); // equals -> verifica a igualde dos arrays
        System.out.printf("intArray %s filledIntArray%n",
                (b ? "==" : "!="));

        // pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0)
            System.out.printf("Found 5 at element %d in intArray%n", location);
        else
            System.out.println("5 not found in intArray");

        // pesquisa o valor 8763 em intArray
        location = Arrays.binarySearch(intArray, 8763);

        if (location >= 0)
            System.out.printf(
                    "Found 8763 at element %d in intArray%n", location);
        else
            System.out.println("8763 not found in intArray");
    }

    // gera saída de valores em cada array
    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);
        for (int value : array)
            System.out.printf("%d ", value);
    }
}
