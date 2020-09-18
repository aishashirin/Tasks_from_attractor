package asdfghjkl;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rand = new Random();
            demo demo = new demo();
            cat tom = new cat();
            tom.name = "Tom";
            tom.age = 4;
            tom.breed = "Bengal";
            tom.color = "brown";
            tom.weight = 10.4;
            System.out.print("enter thirst of cat from range:0-100: ");
            tom.setThirst(scanner.nextInt());


            Food Carbonara = new Food();
            Carbonara.name = "Carbonara";
            Carbonara.ingredients.add("Spaghetti");
            Carbonara.ingredients.add("olive oil");
            Carbonara.ingredients.add("chicken");
            Carbonara.ingredients.add("garlic");
            Carbonara.taste = "milky";
            Carbonara.levelOfSatiety = 50;

            Food Apple = new Food();
            Apple.name = "apple";
            Apple.taste = "sweet";
            Apple.levelOfSatiety = 10;

            Food cereals = new Food();
            cereals.name = "cereals";
            cereals.ingredients.add("honey cereals");
            cereals.ingredients.add("milk");
            cereals.taste = "sweet";
            cereals.levelOfSatiety = 20;

            Food Taco = new Food();
            Taco.name = "Taco";
            Taco.ingredients.add("pita");
            Taco.ingredients.add("meat");
            Taco.ingredients.add("jalapeno");
            Taco.ingredients.add("Tabasco sauce");
            Taco.ingredients.add("tomatoes");
            Taco.taste = "hot";
            Taco.levelOfSatiety = 60;

            int x = 0 + rand.nextInt(100 - 0 +1);
            tom.setLevelOfSatiety(x);
            System.out.println("initial level of satiety: " + tom.getLevelOfSatiety());
            int y = 0 + rand.nextInt(100 - 0 +1);
            System.out.println("final level of satiety: " + y);

            if (x < y) {
                while (tom.getLevelOfSatiety() < y) {
                    System.out.println("Enter the number of food to feed your cat:\n 1)Carbonara\n 2)Apple\n 3)cereals\n 4)Taco");

                    int food = scanner.nextInt();
                    switch (food) {
                        case 1:
                            System.out.println(FeedCat(tom, Carbonara));
                            break;
                        case 2:
                            System.out.println(FeedCat(tom, Apple));
                            break;
                        case 3:
                            System.out.println(FeedCat(tom, cereals));
                            break;
                        case 4:
                            System.out.println(FeedCat(tom, Taco));
                            break;
                        default:
                            System.out.println("enter only existing numbers.");
                    }
                }
                if(tom.getLevelOfSatiety() == y){
                    System.out.println("the cat is full.");
                }
                else if (tom.getLevelOfSatiety() > y){
                    System.out.println("cat overfed .");
                }
            }
            else{
                System.out.println("cat needs diet.");
            }

        }

        public static String FeedCat (cat cat,Food food){
            if(cat.getThirst() <50){
                cat.setLevelOfSatiety(food.getLevelOfSatiety() + cat.getLevelOfSatiety());
                return "After feeding cat with " + food.name +" ,cat's level of satiety becomes -->" + cat.getLevelOfSatiety();}
            else
                return "your cat can't eat, because he wants to drink";
        }
    }


