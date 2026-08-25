package com.securevault.specialty;

import com.securevault.core.VaultItem;

public class FragileItem extends VaultItem {
  private boolean isWrapped;

  public FragileItem(String itemName, double itemValue, boolean isWrapped) {
    super(itemName, itemValue);
    this.isWrapped = isWrapped;
  }

public boolean isWrapped() {
  returen isWrapped;
}


@Override
public String toString() {
  return "Item: " + getItemName() + ", Value: $" + getItemValue() + ", Wrapped: " + isWrapped;
    }
}
