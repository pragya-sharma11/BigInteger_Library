package execution;

import javax.swing.*;
import java.util.Scanner;

public class BigIntegerExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(
                null,
                "Choose any operation according to the need -: ADD, SUBTRACT, MULTIPLY, DIVIDE, EXIT ",
                "SELECTION",
                JOptionPane.PLAIN_MESSAGE
        );
        String inputChoice = JOptionPane.showInputDialog(
                null,
                "Enter Choice",
                "Choice",
                JOptionPane.PLAIN_MESSAGE
        );
        Choice choice = Choice.valueOf(inputChoice);

    }
}

enum Choice{
    ADD, SUBTRACT, MULTIPLY, DIVIDE, EXIT
}
