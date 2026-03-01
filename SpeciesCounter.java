// SpeciesCounter.java
// Symone Banks
// 03/02/2026
// Encapsulates penguin species counting logic

public class SpeciesCounter {

   // Private fields for encapsulation
   private String[] speciesData;
   private int[] speciesCount;

   // Constants
   private static final String FILE_NAME = "PalmerPenguins.csv";

   private static final String SP_CHINSTRAP = "Chinstrap";
   private static final String SP_GENTOO = "Gentoo";
   private static final String SP_ADELIE = "Adelie";

   private static final int NUM_SPECIES = 3;

   // Constructor
   public SpeciesCounter() {
      speciesData = new String[0];
      speciesCount = null;
   }

   // 1. Read species data
   public void readSpeciesData() {
      speciesData = CSVReader.readFile(FILE_NAME, 1);
   }

   // 2. Initialize species counter array
   public void initializeSpeciesCount() {
      speciesCount = new int[NUM_SPECIES];
   }

   // 3. Check if dataset is empty
   public boolean isDataEmpty() {
      return speciesData == null || speciesData.length == 0;
   }

   // 4. Count species occurrences
   public void countSpecies() {

      for (int i = 0; i < speciesData.length; i++) {

         if (speciesData[i].equals(SP_CHINSTRAP)) {
            speciesCount[0]++;
         }
         else if (speciesData[i].equals(SP_GENTOO)) {
            speciesCount[1]++;
         }
         else if (speciesData[i].equals(SP_ADELIE)) {
            speciesCount[2]++;
         }
      }
   }

   // 5. Print species totals
   public void printSpeciesCount() {

      System.out.println("Chinstrap count = " + speciesCount[0]);
      System.out.println("Gentoo count = " + speciesCount[1]);
      System.out.println("Adelie count = " + speciesCount[2]);
   }
}
