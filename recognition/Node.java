package recognition;

import java.util.ArrayList;

public abstract class Node {
    public abstract int getValue();
}

/**
 * This class holds the individual elements of the grid we're reading in and returns either a 1 or 0
 */
class InputNode extends Node {
    private final String pixel;

    public InputNode(String pixel) {
        this.pixel = pixel;
    }

    public int getValue() {
        return pixel.equals("X") ? 1 : 0;
    }
}

/**
 * OutputNode does the calculations based on the InputNodes, weights and bias passed in on construction.
 */
class OutputNode extends Node {
    private final ArrayList<InputNode> inputNodes;
    private final int[] weights;
    private final int bias;

    public OutputNode(ArrayList<InputNode> inputNodes, int[] weights, int bias) {
        this.inputNodes = inputNodes;
        this.weights = weights;
        this.bias = bias;
    }

    public int getValue() {
        int output = bias;
        for (int index = 0; index < inputNodes.size(); index++) {
            output += inputNodes.get(index).getValue() * weights[index];
        }
        return output;
    }
}