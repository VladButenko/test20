
public class Calculator {

    private final String delimiter = ",|\n";

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(delimiter);
        if(isEmpty(input)) {
            return 0;
        }
        if (input.length()==1){
            return stringToInt(input);
        }
        else {
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) throws Exception {

        findDangerousInput(numbers);

        return calculateValue(numbers);

    }

    private int calculateValue(String[] numbers){
        int sum = 0;
        for (String current: numbers) {
            if (stringToInt(current) > 1000){
                continue;
            }
            sum += Integer.parseInt(current);
        }
        return sum;
    }

    private void findDangerousInput(String[] numbers) throws Exception {
        for (String current: numbers) {
            if (Integer.parseInt(current) < 0){
                throw new Exception("Negative input");
            }

        }
    }

    private boolean isEmpty(String input){
        return input.isEmpty();
    }

    private int stringToInt(String input){
        return Integer.parseInt(input);

    }
}
