
package models;

/**
 *
 * @author joses
 */
public class MealDishes {
    private int quantity;
    private int menuItemsID;
    private int mealsID;
    private String otherDetails;

    public MealDishes(int quantity, int menuItemsID, int mealsID, String otherDetails) {
        this.quantity = quantity;
        this.menuItemsID = menuItemsID;
        this.mealsID = mealsID;
        this.otherDetails = otherDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMenuItemsID() {
        return menuItemsID;
    }

    public void setMenuItemsID(int menuItemsID) {
        this.menuItemsID = menuItemsID;
    }

    public int getMealsID() {
        return mealsID;
    }

    public void setMealsID(int mealsID) {
        this.mealsID = mealsID;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    
}
