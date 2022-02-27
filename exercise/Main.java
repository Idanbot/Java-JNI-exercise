public class Main {
    public static void main(String[] args) {

        JavaFact fact = new JavaFact();
        JniFact jniFact = new JniFact();

        int num = 20;

        long start = System.currentTimeMillis();

        for(int i = 1; i <= num; i++) {
            System.out.println("Factorial in Java of " + i + " is: " + fact.calculate(i));
        }

        long end = System.currentTimeMillis();

        long timeTakenJava = end - start;



        start = System.currentTimeMillis();

        for(int i = 1; i <= num; i++) {
            System.out.println("Factorial in CPP of " + i + " is: " + jniFact.calculate(i));
        }

        end = System.currentTimeMillis();

        long timeTakenCPP = end - start;

        System.out.println();
        System.out.println("Calculating factorials (1-20) in Java took " + timeTakenJava + "ms");
        System.out.println("Calculating factorials (1-20) in CPP took " + timeTakenCPP + "ms");
        System.out.println("Time taken to calculate in Java is " + (timeTakenJava - timeTakenCPP) + "ms slower than CPP");
        System.out.println("Time impact is " + ((float) timeTakenJava / timeTakenCPP) * 100 + "%");
        System.out.println();
    }
}
