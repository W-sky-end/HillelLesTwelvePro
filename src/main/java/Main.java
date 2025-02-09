public class Main {
    public static void main(String[] args) {
        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[2]);
        String thirdNumber = args[1];

        double result = 0;

        switch (thirdNumber) {
            case "+":
                result = Calculator.add(firstNumber, secondNumber);
                break;
            case "-":
                result = Calculator.subtract(firstNumber, secondNumber);
                break;
            case "*":
                result = Calculator.multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = Calculator.divide(firstNumber, secondNumber);
                break;
            default:
                break;


        }
        System.out.println("Result :" + result);
    }
}
