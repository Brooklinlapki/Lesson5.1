package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss main = new Boss();
        main.setHealth(700);
        main.setDamage(60);
        main.setTypeOfProtection("Абсолютная броня");
        System.out.println("Здоровья босса: " + main.getHealth() + " " + "Урон босса: " + " " +  main.getDamage() + " " +
                "Защита босса : " +   main.getTypeOfProtection());
    }
}
