package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    //    private double releaseDate;

    private final LocalDate releaseDate;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
//        this.whetherNew =whetherNew;
        this.releaseDate = LocalDate.now();
//        this.releaseDate = LocalDate.parse("2001-09-11");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    @Override
    public String toString(){
        String newText = whetherNew() ? " - New" : "";
        return name + newText + "\n" + description + " | $" + price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());

    }
    boolean whetherNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getReleaseDate().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
}

//public class MenuItem {
//    private double price;
//    private String description;
//    private String category;
//    private boolean isNew;
//
//    public MenuItem(double p, String d, String c, boolean iN) {
//        this.price = p;
//        this.description = d;
//        this.category = c;
//        this.isNew = iN;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }
//
//    boolean isNew() {
//        LocalDate today = LocalDate.now();
//    }
//}

