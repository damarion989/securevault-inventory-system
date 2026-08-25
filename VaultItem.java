package com.securevault.core;

public class VaultItem {
    private String itemName;
    private double itemValue;

    public VaultItem(String itemName, double itemValue) throws InvalidItemValueException {
        if (itemValue <= 0) {
            throw new InvalidItemValueException("Item value must be greater than $0. Received: $" + itemValue);
        }
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemValue() {
        return itemValue;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Value: $" + itemValue;
    }
}
