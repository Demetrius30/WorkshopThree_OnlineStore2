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

        loadProductInfo();

        String input;

        do{ System.out.println("Please enter a command ");
            System.out.println("\n1:  Enter type of item: ");
            System.out.println("\n2:  Enter quantity of item of item: ");
            System.out.println("\n3:  Click save items and add to cart below: ");
            System.out.println("\n4:  Exit");
            input = scanner.nextLine();

                switch(input){
                    case "1":
                        typeOfItem();

                }
                }
        }





        try {
            FileReader inventoryFile = new FileReader(("./src/main/java/com/dm/inventory.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





}
class Product{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
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

    private int id;
    private String name;
    private float price;
}
