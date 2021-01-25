
public class Population {
    public static void main(String[] args) {
        double population = 0;
        int initPopulation = 312032486;
        int years_next = 5;
        double seconds_per_year = 31536000; //60*60*24*365;
        double birth_per_sec = 7;
        double death_per_sec = 13;
        double immigrant_per_sec = 45;
        double newBirth = (seconds_per_year/birth_per_sec) + (seconds_per_year/immigrant_per_sec) - (seconds_per_year/death_per_sec);
        
        population += initPopulation;
        for (int i = 0; i < years_next; i++) {
            population = population + newBirth;
            System.out.println("Year" + (i + 1) + " Population : " + (int)population);
            population = (int)population;
            population = (double)population;
        }

        

    }

}
