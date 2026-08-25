package com.securevault.app;

import com.securevault.core.VaultItem;
import com.securevault.core.VaultManager;
import com.securevault.core.InvalidItemValueException;
import com.securevault.specialty.FragileItem;

public class Main {
    public static void main(String[] args) {
        try {
            VaultItem validItem = new VaultItem("Gold Bar", 50000.00);
            System.out.println("Successfully created: " + validItem);
        } catch (InvalidItemValueException e) {
            System.out.println("Error creating item: " + e.getMessage());
        }

        try {
            VaultItem invalidItem = new VaultItem("Fake Diamond", -100.00);
            System.out.println("Successfully created: " + invalidItem);
        } catch (InvalidItemValueException e) {
            System.out.println("Error creating item: " + e.getMessage());
        }

        System.out.println("\n--- Sorting Vault Items ---");
        try {
            VaultItem[] items = new VaultItem[5];
            items[0] = new VaultItem("Gold Bar", 50000.00);
            items[1] = new FragileItem("Antique Vase", 12000.00, true);
            items[2] = new VaultItem("Silver Coin", 25.00);
            items[3] = new FragileItem("Crystal Sculpture", 8500.00, false);
            items[4] = new VaultItem("Diamond Ring", 30000.00);

            VaultManager manager = new VaultManager();
            manager.selectionSort(items);

            System.out.println("Sorted by value (ascending):");
            for (VaultItem item : items) {
                System.out.println(item);
            }
        } catch (InvalidItemValueException e) {
            System.out.println("Error creating item: " + e.getMessage());
        }
    }
}
