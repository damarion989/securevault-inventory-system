package com.securevault.core;

public class VaultItem {
  private String itemName;
  private double itemValue;

  public VaultItem(String itemName, double itemValue) {
    this.ItemName = ItemName;
    this.ItemValue = ItemValue;
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
