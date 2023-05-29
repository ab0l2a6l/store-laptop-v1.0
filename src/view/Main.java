package view;

import common.StaticScanner;
import controler.LaptopControler;
import model.entity.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopControler laptopControler = new LaptopControler();

        Scanner input = StaticScanner.getData();

        int requsetForInsert;

        for (; ; ) {
            System.out.println("1.insert");
            System.out.println("2.search");
            requsetForInsert = input.nextInt();
            input.nextLine();
            switch (requsetForInsert) {
                case 1 -> {
                    Laptop laptop = new Laptop();

                    System.out.print("insert laptop name: ");
                    laptop.setLaptopName(input.nextLine());

                    System.out.print("insert id: ");
                    laptop.setId(input.nextLong());

                    laptopControler.sendDataToService(laptop);
                }
                case 2 -> {
                    System.out.print("insert id for search: ");
                    if (laptopControler.sendIdToServiceForSearch(input.nextLong()) == 1)
                        System.out.println("found");
                    else System.out.println("not found");

                }
            }
        }
    }
}
