public class JavaFact {

    public long calculate(int num) {
        long result = 1;

        while (num > 1) {
            result *= num;
            num--;
        }

        return result;
    }

}
