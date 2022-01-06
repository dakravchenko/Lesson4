package com.daniil;

public class CharacterInLineage2 {
    String race;
    int level;
    boolean isWisard;
    boolean isWarrior;
    String occupation;
    String name;

    void correlationOfLevelAndOccupation(int level){
        if(level >= 0 && level < 20){
            System.out.println("Your occupation might be Elven Wizard or Elven Oracle");
        } else if(level < 40){
            System.out.println("Your occupation might be Elven Elder or Spell Singer");
        } else if(level <= 80){
            System.out.println("Your occupation might be Eva's Saint or Mystic Muse");
        } else{
            System.out.println("put the right number(0-80)");
        }
    }
    void whatToWearAccordingToYourClass(){
        if(isWisard){
            System.out.println("You should wear a robe!");
        }
        else{
            System.out.println("You should wear an armor(light or heavy)!");
        }
    }
    void printCharacter(){
        System.out.println("Name: " + name + " Race: " +  race + occupation + " Level: " + level);
    }
}
