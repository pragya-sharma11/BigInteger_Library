package execution;

import operations.BigIntegerOperations;

import javax.swing.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

enum Choice {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, ANSWER
}

public class BigIntegerExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger result = BigInteger.ZERO;
        JOptionPane.showMessageDialog(
                null,
                "Choose any operation according to the need -: ADD, SUBTRACT, MULTIPLY, DIVIDE, ANSWER ",
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
        switch (choice) {
            case ADD:
                result = add(result);
                break;
            case SUBTRACT:
                result = sub(result);
                break;
            case MULTIPLY:
                result=result==BigInteger.ZERO?BigInteger.ONE:result;
                result = multiply(result);
                break;
            case DIVIDE:
                result = divide(result);
                break;
            case ANSWER:
                JOptionPane.showMessageDialog(
                        null,
                        String.valueOf(result),
                        "ANSWER",
                        JOptionPane.CLOSED_OPTION
                );
                break;
        }
    }

    public static BigInteger add(BigInteger result) {
        LinkedList<BigInteger> list = new LinkedList<>();
        list.add(result);
        BigInteger number = BigInteger.ZERO;
        int i = 0;
        while (i != 1) {
            try {
                number = (new BigInteger((JOptionPane.showInputDialog(
                        null,
                        "Enter the number to be added or write null if u have filled all numbers",
                        "Number",
                        JOptionPane.PLAIN_MESSAGE
                )))
                );
                list.add(number);
            } catch (Exception e) {
                i = 1;
            }
        }
        BigIntegerOperations big = new BigIntegerOperations();

        return big.add(list);
    }

    public static BigInteger sub(BigInteger result) {
        BigInteger number1 = result==BigInteger.ZERO?(new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the number from which other number is subtracted.",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        ):result;
        BigInteger number2 = (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the number to be subtracted",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        );
        BigIntegerOperations big = new BigIntegerOperations();

        return big.subtract(number1, number2);
    }

    private static BigInteger multiply(BigInteger result) {
        LinkedList<BigInteger> list1 = new LinkedList<>();
        list1.add(result);
        BigInteger number = BigInteger.ZERO;
        int i = 0;
        while (i != 1) {
            try {
                number = (new BigInteger((JOptionPane.showInputDialog(
                        null,
                        "Enter the number to be multiplied or write null if u have filled all numbers",
                        "Number",
                        JOptionPane.PLAIN_MESSAGE
                )))
                );
                list1.add(number);
            } catch (Exception e) {
                i = 1;
            }
        }
        BigIntegerOperations big = new BigIntegerOperations();

        return big.multiply(list1);
    }

    private static BigInteger divide(BigInteger result){
        BigInteger number1 = result==BigInteger.ZERO?(new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the quotient",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        ):result;
        BigInteger number2 = (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the divisor",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        );
        BigIntegerOperations big = new BigIntegerOperations();

        return big.divide(number1, number2);
    }

}

