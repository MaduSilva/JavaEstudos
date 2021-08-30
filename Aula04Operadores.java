package inicio.estudo.java;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numberOne = 10;
        int numberTwo = 20;
        int resultSum = numberOne + numberTwo;
        double resultDivision = numberOne / (double) numberTwo;
        int resultSubtraction = numberOne - numberTwo;
        int resultMultiplication = numberOne * numberTwo;

        System.out.println(resultSum);
        System.out.println(resultDivision);
        System.out.println(resultDivision);
        System.out.println(resultSubtraction);
        System.out.println(resultMultiplication);

        // % - par ou ímpar, resto
        int remainder  = 20 % 2;
        System.out.println(remainder);

        // <, >, <=, >=, ==, !=

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenEqualToTwenty);

        // && (and), || (or) , ! (not)

        // and
        int ageWorker = 31;
        float salaryWorker = 3500F;
        boolean isInTheLawGreaterThanThirty = ageWorker > 30 && salaryWorker >= 4612;
        boolean isInTheLawLessThanThirty = ageWorker < 30 && salaryWorker >= 3381;
        System.out.println("isInTheLawGreaterThanThirty " +isInTheLawGreaterThanThirty);
        System.out.println("isInTheLawLessThanThirty " + isInTheLawLessThanThirty);

        // or
        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount = 10000;
        float  valuePlaystationFive = 5500F;
        boolean IsPlaystationFiveBuyable = totalValueCheckingAccount > valuePlaystationFive || totalValueSavingsAccount > valuePlaystationFive;
        System.out.println("is the PS5 buyable? " + IsPlaystationFiveBuyable);

        // ! (not)
        double salaryToday = 1800;
        salaryToday += 1000;
        salaryToday -= 500;
        System.out.println(salaryToday);
    }
}
