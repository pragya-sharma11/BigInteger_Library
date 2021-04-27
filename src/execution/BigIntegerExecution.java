package execution;

import operations.BigIntegerOperations;

import javax.swing.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

enum Choice {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, EXIT
}

public class BigIntegerExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger result = BigInteger.ZERO;
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
        switch (choice) {
            case ADD:
                result = add();
                break;
            case SUBTRACT:
                result=sub();
                break;
            case MULTIPLY:
                result=multiply();
                break;
            case EXIT:
                JOptionPane.showMessageDialog(
                        null,
                        "You have choosen to exit.Have a nice day!!",
                        "EXIT",
                        JOptionPane.CLOSED_OPTION
                );
        }
    }

    public static BigInteger add() {
        LinkedList<BigInteger> list = new LinkedList<>();
        BigInteger number =BigInteger.ZERO;
        int i=0;
        while(i!=1){
            try {
                number = (new BigInteger((JOptionPane.showInputDialog(
                        null,
                        "Enter the number to be added or write null if u have filled all numbers",
                        "Number",
                        JOptionPane.PLAIN_MESSAGE
                )))
                );
                list.add(number);
            }
            catch(Exception e ) {
                i=1;
            }
        }
        BigIntegerOperations big = new BigIntegerOperations();

        return big.add(list);
    }

    public static BigInteger sub(){
        BigInteger number1 = (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the number to be added or write null if u have filled all numbers",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        );
        BigInteger number2 = (new BigInteger((JOptionPane.showInputDialog(
                null,
                "Enter the number to be added or write null if u have filled all numbers",
                "Number",
                JOptionPane.PLAIN_MESSAGE
        )))
        );
        BigIntegerOperations big = new BigIntegerOperations();

        return big.subtract(number1,number2);
    }
    private static  BigInteger multiply() {
        LinkedList<BigInteger> list1 = new LinkedList<>();
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
                list1.add(number);
            } catch (Exception e) {
                i = 1;
            }
        }
        BigIntegerOperations big = new BigIntegerOperations();

        return big.multiply(list1);
    }

}

