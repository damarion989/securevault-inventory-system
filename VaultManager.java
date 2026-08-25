package com.securevault.core;

public class VaultManager {

    public void selectionSort(VaultItem[] items) {
        int n = items.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (items[j].getItemValue() < items[minIndex].getItemValue()) {
                    minIndex = j;
                }
            }

            VaultItem temp = items[minIndex];
            items[minIndex] = items[i];
            items[i] = temp;
        }
    }
}
