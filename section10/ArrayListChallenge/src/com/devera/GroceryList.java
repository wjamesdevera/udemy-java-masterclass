package com.devera;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GroceryList {
    private ArrayList<String> groceryList;

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void addItem(String[] list) {
        for (String i: list) {
            String trimmed = i.trim();
            if (!findItem(trimmed)) {
                groceryList.add(trimmed);
            }
        }
    }

    public void removeItem(String[] list) {
        groceryList.removeAll(List.of(list));
    }

    private boolean findItem(String name) {
        return groceryList.contains(name);
    }


    public ArrayList<String> getGroceryList() {
        sort();
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    private void sort() {
        groceryList.sort(Comparator.naturalOrder());
    }
}
