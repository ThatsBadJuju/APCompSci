package Lab3;

import java.util.ArrayList;

public class SuperHeroDriver {
    public static void main(String[] args) {

        //new arraylist with SuperHero objects
        ArrayList<SuperHero> heroes = new ArrayList<>();

        //initializes subclass objects
        SuperHero asteroidMan = new AsteroidMan("Gray", true);
        SuperHero friedEggMan = new FriedEggMan("Yellow", false);
        SuperHero doctorDoom = new DoctorDoom("Green", true);

        //adds objects to arraylist
        heroes.add(asteroidMan);
        heroes.add(friedEggMan);
        heroes.add(doctorDoom);

        //prints out arraylist
        for(SuperHero hero : heroes) {
            System.out.println(hero.getSuitColor());
            System.out.println(hero.isCaped());
            System.out.println(hero.motto());
            System.out.println();
        }

        SuperHero[][] capedHeroes = new SuperHero[3][3];

        //adds caped heroes to 2d array & removes it from arraylist
        int removedItems = 0;
        for(int row = 0; row < capedHeroes.length; row++) {
            for(int col = 0; col < capedHeroes.length; col++) {
                if((row * 3 + col - removedItems) < heroes.size() && (heroes.get(col + row * 3 - removedItems).isCaped())) {
                    capedHeroes[row][col] = heroes.get(col + row * 3 - removedItems);
                    heroes.remove(col + row * 3 - removedItems);
                    removedItems++;
                }
            }
        }

        //prints out 2D array
        System.out.println("\n2D Array: \n");
        for(int row = 0; row < capedHeroes.length; row++) {
            for(int col = 0; col < capedHeroes.length; col++) {
                if(capedHeroes[row][col] != null) {
                    System.out.println(capedHeroes[row][col].getSuitColor());
                    System.out.println(capedHeroes[row][col].isCaped());
                    System.out.println(capedHeroes[row][col].motto());
                    System.out.println();
                }
                else {
                    System.out.println("null\n");
                }
            }
        }

        //prints out changed arraylist
        System.out.println("Finished ArrayList: \n");
        for(SuperHero hero : heroes) {
            System.out.println(hero.getSuitColor());
            System.out.println(hero.isCaped());
            System.out.println(hero.motto());
            System.out.println();
        }
    }
}
