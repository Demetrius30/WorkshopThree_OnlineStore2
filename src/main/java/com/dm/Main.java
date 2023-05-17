package com.dm;

import java.io.FileReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> product = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        loadProducts();

        String input;

        do {
            System.out.println("Store Home Screen ");
            System.out.println("\t1:  Show Products");
            System.out.println("\t2:  Show Cart");
            System.out.println("\t3:  Exit");
            System.out.print("Command: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    showProducts();
                    break;
                case "2":
                    showCart();
                    break;
                case "3":
                    System.out.print("Exiting");
                    break;
                    default:
                    System.out.print("Invalid input");

            }

                }while(!input.equalsIgnoreCase("3"));
        }
            public static void loadProducts(){

            try{
                FileReader fileReader = new FileReader("./target/classes/com/dm/product.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String input;

                while((input = bufferedReader.readLine()) != null){
                    System.out.print(input);
            }
                    bufferedReader.close();
                }catch (IOException e) {
                e.printStackTrace();
            }
        }

        public  static void homeScreen(){
        System.out.println("Please provide the id, name, and price for the items");
        System.out.println("id: ");
        String id = scanner.nextLine();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Price: ");
        String price = scanner.nextLine();

        }


        public static void showProducts() {
            //displaying all products for user to choose from
            //asking users if they would like to add items

        try{
            loadProducts();
            System.out.print(  "Please enter product id if you would like to add item: ");
            String addItemId = scanner.nextLine();

            System.out.print("  Please enter product name if you would like to add item: ");
            String addItemName = scanner.nextLine();


            System.out.print("  Please enter product price if you would like to add item: ");
            String addItemPrice = scanner.nextLine();


            FileWriter fileWriter = new FileWriter("./target/classes/com/dm/product.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(addItemId + "|" + addItemName + "|" + addItemPrice + "|");
            System.out.print("Item added successfully   ");
            bufferedWriter.close();
        }catch (IOException e){
        System.out.print("Item was not added");
        e.printStackTrace();

    }

        try {
            Scanner scanner1 = new Scanner(System.in);
            ArrayList<String> arrayList = new ArrayList<String>();

                for (int i = 0; i < product.size(); i++) {
                    Product currentProduct = product.get(i);
                    System.out.print("Current Product: " + product.get(i));
                }
                FileReader fileReader = new FileReader("./target/classes/com/dm/product.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String input;

                while ((input = bufferedReader.readLine()) != null) {
                    System.out.print(input);
                }

                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String userInput;
            do {
                System.out.print(" Please enter \"X\" to return back to home screen");
                userInput = scanner.nextLine();
                if (!userInput.equalsIgnoreCase("X")) {
                }
            } while (!userInput.equalsIgnoreCase("X"));
            System.out.print(product);
        }

        public static void showCart() {
            loadProducts();
            String subInput = null;

            do {
                System.out.print("\t1: Please enter \"C\" to proceed to checkout");
                System.out.print("\t2: Please enter \"X\" to go back to home screen");
                System.out.print("Command: ");

                switch (subInput) {
                    case "1":
                        checkout();
                        System.out.print("\t1: Checkout Screen");
                        break;
                    case "2":
                        homeScreen();
                        System.out.print("\t2: Return to home screen");
                        break;
                    default:
                        System.out.print("Invalid input");
                }
            }while(!subInput.equalsIgnoreCase("2"));
        }



            public static void checkout () {
            }


        }