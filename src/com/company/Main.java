package com.company;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var colour = "Red";

        var template = "Clothing item: %s, size %s, colour %s, price $%.2f";  
        var itemString = String.format(template, item, size, colour, price);
        System.out.println(itemString);

        var template2 = "%s climbs grade: %s at %s located at %s %d %s.";
        String climberName = "Tommy Tran";
        String climberGrade = "V4+";
        String gymName = "Rocket Climbing Gym";
        String gymSuburb = "Footscray";
        var gymPostCode = 3011;
        String stateCode = "VIC";

        var climbingString = String.format(template2, climberName,
            climberGrade, gymName, gymSuburb, gymPostCode, stateCode);

        System.out.println(climbingString);

    }
}
