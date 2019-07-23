public class Calculator {
    public static float Calculate(float value1, float value2, char operator){
        switch (operator){
            case '+' : return value1 + value2;
            case '-' : return value1 - value2;
            case '*' : return value1 * value2;
            case '/' :
                if(value2!=0)
                    return value1 / value2;
                else
                    throw  new RuntimeException("Can't division 0");
            default:
                throw new  RuntimeException("Invalide Operator");
        }
    }
}
