package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit:");
        String action = sc.nextLine();

        while (!action.equals("exit")) {
            switch (action) {
                case "buy":
                    buyAction();
                    break;
                case "fill":
                    fillAction();
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    printState();
                    break;
                default:
                    System.out.println("Unknown action");
            }

            action = sc.nextLine();


        }

    }

    private static void takeAction() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void fillAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += sc.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += sc.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += sc.nextInt();
    }

    private static void buyAction() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sc = new Scanner(System.in);
        String coffee = sc.nextLine();
        switch (coffee) {
            case "1":
                makeEspresso();
                break;
            case "2":
                makeLatte();
                break;
            case "3":
                makeCappuccino();
                break;
            case "back":
                return;
            default:
                System.out.println("Unknown coffee");
        }
    }

    private static void makeCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, don't enough water!");
            return;
        } else if (milk < 100) {
            System.out.println("Sorry, don't enough milk!");
            return;
        } else if (coffeeBeans < 12) {
            System.out.println("Sorry, don't enough coffee beans!");
            return;
        } else if (cups  == 0) {
            System.out.println("Sorry, don't enough cups!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        water -= 200;
        milk -= 100;
        coffeeBeans -= 12;
        cups--;
        money += 6;
    }

    private static void makeLatte() {

        if (water < 350) {
            System.out.println("Sorry, don't enough water!");
            return;
        } else if (milk < 75) {
            System.out.println("Sorry, don't enough milk!");
            return;
        } else if (coffeeBeans < 20) {
            System.out.println("Sorry, don't enough coffee beans!");
            return;
        } else if (cups  == 0) {
            System.out.println("Sorry, don't enough cups!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        water -= 350;
        milk -= 75;
        coffeeBeans -= 20;
        cups--;
        money += 7;
    }

    private static void makeEspresso() {

        if (water < 250) {
            System.out.println("Sorry, don't enough water!");
            return;
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, don't enough coffee beans!");
            return;
        } else if (cups  == 0) {
            System.out.println("Sorry, don't enough cups!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        water -= 250;
        coffeeBeans -= 16;
        cups--;
        money += 4;
    }

    public static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }
}
