package recognition;

public class Weights {
    private static final int[] biases = {-1, 6, 1, 0, 2, 0, -1, 3, -2, -1};
    private static final int[][] weights =
            {
                    { // number 0
                            1, 1, 1,
                            1, -1, 1,
                            1, -1, 1,
                            1, -1, 1,
                            1, 1, 1
                    },
                    { // number 1
                            -1, 1, -1,
                            -1, 1, -1,
                            -1, 1, -1,
                            -1, 1, -1,
                            -1, 1, -1
                    },
                    { // number 2
                            1, 1, 1,
                            -1, -1, 1,
                            1, 1, 1,
                            1, -1, -1,
                            1, 1, 1
                    },
                    {   // number 3
                            1, 1, 1,
                            -1, -1, 1,
                            1, 1, 1,
                            -1, -1, 1,
                            1, 1, 1
                    },
                    {   // number 4
                            1, -1, 1,
                            1, -1, 1,
                            1, 1, 1,
                            -1, -1, 1,
                            -1, -1, 1
                    },
                    {   // number 5
                            1, 1, 1,
                            1, -1, -1,
                            1, 1, 1,
                            -1, -1, 1,
                            1, 1, 1
                    },
                    {   // number 6
                            1, 1, 1,
                            1, -1, -1,
                            1, 1, 1,
                            1, -1, 1,
                            1, 1, 1
                    },
                    {   // number 7
                            1, 1, 1,
                            -1, -1, 1,
                            -1, -1, 1,
                            -1, -1, 1,
                            -1, -1, 1
                    },
                    {   // number 8
                            1, 1, 1,
                            1, -1, 1,
                            1, 1, 1,
                            1, -1, 1,
                            1, 1, 1
                    },
                    {   // number 9
                            1, 1, 1,
                            1, -1, 1,
                            1, 1, 1,
                            -1, -1, 1,
                            1, 1, 1
                    }
            };

    public static int[] getBiases() {
        return biases;
    }

    public static int[][] getWeights() {
        return weights;
    }
}
