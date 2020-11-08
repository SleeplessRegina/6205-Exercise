public class CoinCombination {
    public class Main {

        public static void main(String[] args) {

            // generateAllSubsets("ABC");
            // generatemArySequence(3, 10);
            String[] coinDenominations = {"5", "10", "25"};
            combinationsCoins(coinDenominations, 5);

            // combinations("ABCD", 2);
        }

        private static void generateBinarySequence(int n) {
            if (n <= 0) {
                return;
            }
            int[] result = new int[n];

            generateBinarySequence(result, 0);

        }

        private static void generateBinarySequence(int[] result, int current) {

            if (current == result.length) {
                printArray(result);
                return;
            }

            for (int i = 0; i < 2; i++) {
                result[current] = i;
                generateBinarySequence(result, current + 1);
            }

        }


        private static void generatemArySequence(int n, int m) {
            if (n <= 0) {
                return;
            }
            int[] result = new int[n];

            generatemArySequence(result, m, 0);

        }

        private static void generatemArySequence(int[] result, int m, int current) {

            if (current == result.length) {
                printArray(result);
                return;
            }

            for (int i = 0; i < m; i++) {
                result[current] = i;
                generatemArySequence(result, m, current + 1);
            }

        }

        private static void printArray(int[] result) {
            for (int i : result) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }

        public static void combinations(String str) {
            if (str.length() == 0) {
                return;
            }
            int[] result = new int[str.length()];
            combinations(result, str, 0);

        }

        public static void combinations(int[] result, String str, int current) {

            if (current == str.length()) {
                printCombinations(str, result);
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                result[current] = i;
                combinations(result, str, current + 1);
            }

        }

        private static void printCombinations(String str, int[] result) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(str.charAt(result[i]) + " ");
            }
            System.out.println();
        }

        private static void combinations(String str, int size) {
            if (str.length() == 0 || size <= 0) {
                return;
            }
            int[] result = new int[size];
            combinations(result, size, str, 0);
        }

        private static void combinations(int[] result, int size, String str, int current) {
            if (current == size) {
                printCombinations(str, result);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                result[current] = i;
                combinations(result, size, str, current + 1);
            }
        }

        private static void combinationsCoins(String[] coinDenominations, int numCoins) {
            if (coinDenominations.length == 0 || numCoins <= 0) {
                return;
            }
            int[] result = new int[numCoins];
            combinationsCoins(result, numCoins, coinDenominations, 0);
        }

        private static void combinationsCoins(int[] result, int size, String[] coinDenominations, int current) {
            if (current == size) {
                printStringCombinations(coinDenominations, result);
                return;
            }
            for (int i = 0; i < coinDenominations.length; i++) {
                result[current] = i;
                combinationsCoins(result, size, coinDenominations, current + 1);
            }
        }

        private static void printStringCombinations(String[] coinDenominations, int[] result) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(coinDenominations[result[i]] + " ");
            }
            System.out.println();
        }

        private static void generateAllSubsets(String str) {
            if (str.length() == 0) {
                return;
            }
            int[] result = new int[str.length()];
            generateAllSubsets(result, str, 0);

        }


        private static void generateAllSubsets(int[] result, String str, int current) {
            if (current == str.length()) {
                printSubsets(result, str);
                return;
            }

            for (int i = 0; i < 2; i++) {
                result[current] = i;
                generateAllSubsets(result, str, current + 1);
            }
        }

        private static void printSubsets(int[] result, String str) {

            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < result.length; i++) {
                if (result[i] == 1) {
                    sb.append(str.charAt(i) + " ,");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("}");

            System.out.println(sb.toString());


        }

    }
}
