package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType("Стрелковое оружие");
        bossWeapon.setWeaponName("Лук Леголаса");
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);

        System.out.println(boss.printInfo());
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setArrowsQuantity(20);
        skeleton1.setHealth(500);
        skeleton1.setDamage(45);
        skeleton1.setWeapon(bossWeapon);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setArrowsQuantity(15);
        skeleton2.setHealth(550);
        skeleton2.setDamage(40);
        skeleton2.setWeapon(bossWeapon);

        System.out.println();
        System.out.println(skeleton1.printInfo());
        System.out.println();
        System.out.println(skeleton2.printInfo());
    }
}
