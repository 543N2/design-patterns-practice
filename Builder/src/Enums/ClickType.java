package Enums;

public enum ClickType {
    LEFT("Left"),
    RIGHT("Right");

    public final String label;
    ClickType(String label){
        this.label = label;
    }
}
