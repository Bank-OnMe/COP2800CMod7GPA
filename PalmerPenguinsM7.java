// PalmerPenguinsM7.java
// Symone Banks
// 03/02/2026
// Uses SpeciesCounter class to analyze penguin data

public class PalmerPenguinsM7 {

   public static void main(String[] args) {

      // Create an instance of SpeciesCounter
      SpeciesCounter counter = new SpeciesCounter();

      // Read species data
      counter.readSpeciesData();

      counter.initializeSpeciesCount();

      if (counter.isDataEmpty()) {
         System.out.println("Error: No data found.");
         return;
      }

      counter.countSpecies();
      counter.printSpeciesCount();
   }
}
