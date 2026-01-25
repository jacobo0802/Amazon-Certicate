package Strings;

public class arrays {
    public static void main(String[] args) {
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the names of superheroes
        System.out.println("Superhero Names:");
        System.out.println(superheroes[0]);
        System.out.println(superheroes[1]);
        System.out.println(superheroes[2]);
        System.out.println(superheroes[3]);
        System.out.println(superheroes[4]);

        // Print the introduction years 
        System.out.println("Introduction Years:");
        System.out.println(introductionYears[0]);
        System.out.println(introductionYears[1]);
        System.out.println(introductionYears[2]);
        System.out.println(introductionYears[3]);
        System.out.println(introductionYears[4]);

        // TODO 3a: print the original name of the third superhero
        System.out.println("Original superheroe at position 3: " + superheroes[2]);
        // TODO 3b: modify the third superhero name
        superheroes[2] = "Thor";
        // TODO 3c: print the modified name of the third superhero
        System.out.println("Modified superheroe at position 3: " + superheroes[2]);

        // TODO 4a: print the original year of introduction of the third superhero
        System.out.println("Original introduction year of the third superhero: " + introductionYears[2]);
        // TODO 4b: modify the year of introduction of the third superhero
        introductionYears[2] = 2011;
        // TODO 4c: print the modified year of introduction of the third superhero
        System.out.println("Modified introduction year of the third superhero: " + introductionYears[2]);

        // TODO 5a: print the length of the array containing superhero names
        int heroes = superheroes.length;
        System.out.println("Length of superhero names array: " + heroes);
        // TODO 5b: print the length of the array containing superhero year of introduction
        System.out.println("Length of introduction years array: " + introductionYears.length); //Los dos metodos funcionan igual. Sin embargo, uno usa menos lineas que otro.
   }
    
}
