package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        public void editMenu() {
//        }

        Menu aMenu = new Menu();

        MenuItem water = new MenuItem("water","A natural savory refreshment", 0.00, "drinks");
        //something i tried to do to try and water to menuItems//
        aMenu.addItem(water);

        MenuItem dobos = new MenuItem("dobos", "A choclate sponge cake dessert.", 5.99, "dessert");
        aMenu.addItem(dobos);

        MenuItem cartofi = new MenuItem("cartofi", "Homemade french fries.",4.99, "appetizer");
        aMenu.addItem(cartofi);

        MenuItem piftele = new MenuItem("piftele", "Homemade meatballs of a more oval shape.",6.99, "main Course");
        aMenu.addItem(piftele);

        MenuItem fanta = new MenuItem("fanta", "A orange soda.",1.49, "drinks");
        aMenu.addItem(fanta);


//        System.out.println(dobos.whetherNew());

        System.out.println(aMenu);

        aMenu.removeItem(water);
        System.out.println(aMenu);

        System.out.println(dobos.equals(cartofi));
    }
}
