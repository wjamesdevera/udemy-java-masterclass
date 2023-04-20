package com.devera;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            printMenu();
            System.out.print("Enter a number which you want to do: ");
            quit = processUserAction();
            System.out.println();
            printItems();
        }
        System.out.println("Bye...");
    }

    private static void printItems() {
        System.out.println(groceryList.getGroceryList());
    }

    private static void printMenu() {
        String textBlock = """
                
                Available Actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                """;
        System.out.println(textBlock);
    }

    private static boolean processUserAction() {
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
            case 1 -> {
                addItem();
                return false;
            }
            case 2 -> {
                removeItem();
                return false;
            }
            default -> {
                return true;
            }
        }
    }

    private static void removeItem() {
        System.out.print("Enter the items you want to remove: ");
        groceryList.removeItem(scanner.nextLine().split(","));
    }

    private static void addItem() {
        System.out.print("Enter the items you want to add: ");
        groceryList.addItem(scanner.nextLine().split(","));
    }

}