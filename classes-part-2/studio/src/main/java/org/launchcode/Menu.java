package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;
    public String mainCourse;
    public String appetizer;
    public String dessert;
    public String drinks;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizer.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("mainCourse")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder drinks = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("drinks")) {
                drinks.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nThe mamaliga menu\n" + "appetizer" + appetizer.toString() + "\n" +
                "main Course" + mainCourse.toString() + "\n" +
                "dessert" + dessert.toString() + "\n" +
                "drinks" + drinks.toString() + "\n";
    }

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}
//public class Menu {
//    private Date lastUpdated;
//    private ArrayList<MenuItem> items;
//
//    public Menu(Date d, ArrayList<MenuItem> i) {
//        this.lastUpdated = d;
//        this.items = i;
//    }
//
//    public void addItems(MenuItem addedItem) //this is something i did to try and add water to menu items//
//    {
//        this.items.add(addedItem);
//    }
//
//    public void setLastUpdated(Date lastUpdated) {
//
//        this.lastUpdated = lastUpdated;
//    }
//
//    public void setItems(ArrayList<MenuItem> items) {
//        this.items = items;
//    }
//
//    public Date getLastUpdated() {
//        return lastUpdated;
//    }
//
//    public ArrayList<MenuItem> getItems() {
//        return items;
//    }
//}


