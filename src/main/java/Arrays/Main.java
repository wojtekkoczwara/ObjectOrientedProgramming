package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ListAndArrayList groceryList = new ListAndArrayList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Press");
        System.out.println("case 0:\n" +
                "                    printInstructions();\n" +
                "                    break;\n" +
                "                case 1:\n" +
                "                    groceryList.printGroceryList();\n" +
                "                    break;\n" +
                "                case 2:\n" +
                "                    addItem();\n" +
                "                    break;\n" +
                "                case 3:\n" +
                "                    modifyItem();\n" +
                "                    break;\n" +
                "                case 4:\n" +
                "                    removeItem();\n" +
                "                    break;\n" +
                "                case 5:\n" +
                "                    searchForItem();\n" +
                "                    break;\n" +
                "                case 6:\n" +
                "                    quit = true;\n" +
                "                    break;");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name: ");
       String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem );
    }

    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}

