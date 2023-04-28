package com.dm;

import java.io.FileReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> products = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {

        loadProducts();

        String input;

        do {
            System.out.println("Please enter a command ");
            System.out.println("\n1:  Enter type of item: ");
            System.out.println("\n2:  Enter quantity of item of item: ");
            System.out.println("\n3:  Click save items and add to cart below: ");
            System.out.println("\n4:  Exit");
            System.out.print("Command: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    typeOfItem();
                    break;
                case "2":
                    quantityOfItems();
                    break;
                case "3":
                    saveAndAdd();
                    break;
                System.out.print("Exiting");
                break;
                            default:
                    System.out.print("Invalid input");

            }

                }while(!input.equalsIgnoreCase("3"));
        }
        public static void loadProducts(){
        Product miniProjector = new Product("AV1312", "Mini 1000Lumens Projector", 149.95);
        Product podcast = new Product("AV1412", "XLR Podcast Cardiod Mic", 44.99);
        Product desktop = new Product("CP2012", "Desktop PC Computer Intel Core i5", 139.00)
        Product keyboard = new Product("CP2123", "Wired Backlit Keyboard", 21.99);
        Product mouse = new Product("CP2154", "RGB Wireless Gaming Mouse", 67.45);
        Product teleBoardGame = new Product("GM1032", "Telestrations Board Game", 17.99);
        Product battleBoardGame = new Product("GM1075", "Battleship Board Game", 12.99);
        Product arcade = new Product("GM1148", "Retro Handheld Arcade", 24.45);
        Product usbCable = new Product("PW1255", "USB C to A Cable", 13.95);
        Product solarBattery = new Product("PW1341", "Solar Powered Battery Charge", 19.99);
        Product iphoneCharger = new Product("PW1431", "Wireless Charger iPhone", 12.99);



        }

        public  static void typeOfItem(){
        System.out.println("Please provide the id, name, and price for the items");
        System.out.println("id: ");
        String id = scanner.nextLine();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Price: ");
        String price = scanner.nextLine();

        }


        public static void quantityOfItems(){

        }

        public static void saveAndAdd(){

        }





        try {
            FileReader inventoryFile = new FileReader(("./src/main/java/com/dm/inventory.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





}
class Product{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return double;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private String id;
    private String name;
    private double price;
}
