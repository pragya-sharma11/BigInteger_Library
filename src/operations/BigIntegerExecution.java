package operations;

import javax.swing.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class BigIntegerExecution {
    /**
     * This function calculates the values for given operation.
     * we can perform 4 operations in it: - Add, subtract, multiply, delete.
     */
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        BigInteger result = BigInteger.ZERO;
        char symbol = '\0';
        JOptionPane.showMessageDialog(
                null,
                "Choose any operation according to the need -: + for ADD, " +
                        " - for SUBTRACT, * for MULTIPLY, / for DIVIDE, = for ANSWER ",
                "SELECTION",
                JOptionPane.PLAIN_MESSAGE
        );
        do {

            symbol = (JOptionPane.showInputDialog(
                    null,
                    "Enter Choice",
                    "Choice",
                    JOptionPane.PLAIN_MESSAGE
            )).charAt(0);
            label:
            switch (symbol) {
                case '+':
                    result = add(result);
                    break label;
                case '-':
                    result = sub(result);
                    break label;
                case '*':
                    result = result == BigInteger.ZERO ? BigInteger.ONE : result;
                    result = multiply(result);
                    break label;
                case '/':
                    result = divide(result);
                    break label;
                case '=':
                    JOptionPane.showMessageDialog(
                            null,
                            "The result of computation is : " + result,
                            "ANSWER",
                            JOptionPane.CLOSED_OPTION
                    );

            }
        } while (symbol != '=');
        System.out.println(result);
    }

    /**
     * This function takes the values in LinkedList and add all the values of LinkedList
     *
     * @param result
     * @return
     */
    private BigInteger add(BigInteger result) {
        LinkedList<BigInteger> list = new LinkedList<>();
        list.add(result);
        BigInteger number = BigInteger.ZERO;
        int i = 0;
        while (i != 1) {
            try {
                number = (new BigInteger((JOptionPane.showInputDialog(
                        null,
                        "Enter the number to be added or write ok if u have filled all numbers",
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

    /**
     * This function tells you to enter either 1 or 2 values depending on the situation.
     * This will be used to subtract the values.
     *
     * @param result
     * @return
     */
    private BigInteger sub(BigInteger result) {
        BigInteger number1 = result == BigInteger.ZERO ? (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the number from which other number is subtracted.",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        ) : result;
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

    /**
     * This function tell you to enter the values you want to multiply, storing them in LinkedList
     *
     * @param result
     * @return
     */
    private BigInteger multiply(BigInteger result) {
        LinkedList<BigInteger> list1 = new LinkedList<>();
        list1.add(result);
        BigInteger number = BigInteger.ZERO;
        int i = 0;
        while (i != 1) {
            try {
                number = (new BigInteger((JOptionPane.showInputDialog(
                        null,
                        "Enter the number to be multiplied or write ok if u have filled all numbers",
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

    /**
     * This function will ask you to enter either two or one depending upon situation and divide them
     *
     * @param result
     * @return
     */
    private BigInteger divide(BigInteger result) {
        BigInteger number1 = result == BigInteger.ZERO ? (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the quotient",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        ) : result;
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

