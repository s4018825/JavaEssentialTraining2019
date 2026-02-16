package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        for (String string : colours) {
            System.out.println(string);
        }

        List<ClothingItem> items = new ArrayList<>();
        items.add(new Shirt(
                ClothingSize.L,
                19.99,
                3));
        items.add(new Hat(
                ClothingSize.M,
                29.99,
                1));
        
        for (ClothingItem clothingItem : items) {
            displayItemDetails(clothingItem);
        }
    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
