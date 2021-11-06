package recognition;

import java.util.ArrayList;
import java.util.Scanner;

public class Analyze {
    public Analyze() {
        ArrayList<InputNode> inputNodes = getInputNodes();
        ArrayList<OutputNode> outputNodes = getOutputNodes(inputNodes);
        System.out.printf("This number is %d", determineNumber(outputNodes));
    }

    private static ArrayList<InputNode> getInputNodes() {
        System.out.println("Input grid:");
        final Scanner scanner = new Scanner(System.in);
        ArrayList<InputNode> inputNodes = new ArrayList<>();
        int rows = 5;
        while (rows > 0) {
            String[] line = scanner.nextLine().split("");
            for (String ch : line) {
                inputNodes.add(new InputNode(ch));
            }
            rows--;
        }
        return inputNodes;
    }

    private static ArrayList<OutputNode> getOutputNodes(ArrayList<InputNode> inputNodes) {
        ArrayList<OutputNode> outputNodes = new ArrayList<>();
        int[][] weights = Weights.getWeights();
        int[] biases = Weights.getBiases();
        for (int index = 0; index < biases.length; index++) {
            outputNodes.add(new OutputNode(inputNodes, weights[index], biases[index]));
        }
        return outputNodes;
    }

    private static int determineNumber(ArrayList<OutputNode> outputNodes) {
        int max = Integer.MIN_VALUE;
        int indexOfMax = -1;
        for (int index = 0; index < outputNodes.size(); index++) {
            int value = outputNodes.get(index).getValue();
            if (value > max) {
                max = value;
                indexOfMax = index;
            }
        }
        return indexOfMax;
    }
}
