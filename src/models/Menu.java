package models;

/**
 *
 * @author joses
 */
public class Menu {

    // Atributos
    private int menuId;
    private String menuName;
    private String availableFrom;
    private String availableTo;

    // Constructor
    public Menu(int menuId, String menuName, String availableFrom, String availableTo) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }

    // Getters y setters
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(String availableTo) {
        this.availableTo = availableTo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", availableFrom='" + availableFrom + '\'' +
                ", availableTo='" + availableTo + '\'' +
                '}';
    }
}

