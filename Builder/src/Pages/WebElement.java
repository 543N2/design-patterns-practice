package Pages;

import Enums.WebElementType;

public class WebElement {
    private WebElementType type;
    private String name;
    private String value;

    public WebElement(String name, WebElementType type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }



    public WebElementType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void click(){
        System.out.println("Clicked the "+ getName()+ " " + getType() + " element!");
    }

    public void type(String text){
        System.out.println("Typed '"+ text +"' into the " + getName() + " " + getType() + " element!");
    }

    public void hover(){
        System.out.println("Hovered the "+ getName() + " " + getType() + " element!");
    }

}
