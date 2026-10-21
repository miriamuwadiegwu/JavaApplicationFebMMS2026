public class PopulationGrowth {
    public static void main(String[] args) {
        double startPopulation = 8.2e9;   // current world population (update)
        double growthRate = 0.009;        // yearly growth rate, 0.9% (update)

        double population = startPopulation;

        System.out.printf("%-6s %-22s %-22s%n", "Year", "Population", "Increase");

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;
            System.out.printf("%-6d %-22.0f %-22.0f%n", year, population, increase);
        }

        // year when population doubles
        population = startPopulation;
        int year = 0;
        while (population < 2 * startPopulation) {
            population += population * growthRate;
            year++;
        }
        System.out.println("Population doubles in year " + year);
    }
}
