package com.securevault.app;

import com.securevault.core.VaultItem;
import com.securevault.core.InvalidItemValueException;

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
    }
}
