package chapterThree;

public class worldPopulationCalculator {
    public static void main(String[] args) {
        long worldPopulation = 780000000;
        double growthRate = 1.05;

        long firstYear = (long) (worldPopulation + (((long)growthRate * worldPopulation)/100));
        long secondYear = (long) (worldPopulation + (((long)growthRate * worldPopulation)/100));
        long thirdYear = (long) (worldPopulation + (((long)growthRate * worldPopulation)/100));
        long fourthYear = (long) (worldPopulation + (((long)growthRate * worldPopulation)/100));
        long fifthYear = (long) (worldPopulation + (((long)growthRate * worldPopulation)/100));

        System.out.println("Estimated population for Year one: " + firstYear);
        System.out.println("Estimated population for Year one: " + secondYear);
        System.out.println("Estimated population for Year one: " + thirdYear);
        System.out.println("Estimated population for Year one: " + fourthYear);
        System.out.println("Estimated population for Year one: " + fifthYear);


    }
}
