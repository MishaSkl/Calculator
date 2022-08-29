public class Result {
    public static int resultArab(int num1, int num2, String act){

        switch (act){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                 return num1 * num2;
            case "/":
                try {
                    return num1 / num2;
                } catch (ArithmeticException e){
                    throw new ArithmeticException("Деление на нуль");
                }
            default: throw new IllegalArgumentException("Не верное выражение");
        }
    }
}
