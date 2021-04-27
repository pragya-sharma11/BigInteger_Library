package operations;

import java.math.BigInteger;
import java.util.List;

public class BigIntegerOperations {

    public BigInteger add(List<BigInteger> list){
        BigInteger sum=BigInteger.ZERO;
        for (BigInteger bigInteger : list) {
            sum=bigInteger.add(sum);
        }
        return sum;
    }

    public  BigInteger subtract(BigInteger number1, BigInteger number2){
        BigInteger subtract=number1.subtract(number2);
        return  subtract;
    }

    public  BigInteger multiply(List<BigInteger> list){
        BigInteger mul=BigInteger.ONE;
        for (BigInteger bigInteger : list) {
            mul=bigInteger.multiply(mul);
        }
        return mul;
    }

    public  BigInteger divide(BigInteger divisor, BigInteger quotient){
        BigInteger div = quotient.divide(divisor);
        return  div;
    }
}
