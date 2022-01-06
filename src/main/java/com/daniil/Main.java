package com.daniil;

public class Main {
    public static void main(String[] args) {
        Flight u23 = new Flight();
        u23.cityOfDeparture = "Moscow";
        u23.cityOfArrival = "Kyiv";
        u23.distance = 1500;
        u23.showPlaces();
        u23.calculatePriceOfExternalFlight();

        CharacterInLineage2 drappi = new CharacterInLineage2();
        drappi.race = "elf";
        drappi.level = 79;
        drappi.isWisard = true;
        drappi.occupation = "Eva's Saint";
        drappi.name = "drappi";
        drappi.correlationOfLevelAndOccupation(drappi.level);
        drappi.printCharacter();
        drappi.whatToWearAccordingToYourClass();
    }
}
