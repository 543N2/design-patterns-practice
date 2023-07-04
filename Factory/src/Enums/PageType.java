package Enums;

public enum PageType {
    LOGIN("Login"),
    PRODUCT("Product");
    public final String label;
    PageType(String label){
        this.label = label;
    }
}
