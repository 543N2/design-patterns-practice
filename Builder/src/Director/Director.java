package Director;

import Builders.PageBuilder;
import Enums.PageType;
import Enums.WebElementType;
import Pages.LoginPage;
import Pages.Page;
import Pages.ProductPage;
import Pages.WebElement;

public class Director {

    private PageBuilder builder;

    public Director(){}

    public PageBuilder getBuilder() {
        return builder;
    }

    public Director setBuilder(PageBuilder builder){
        this.builder = builder;
        return this;
    }

    public void buildLoginPage() {
        builder.reset()
                .setPageType(PageType.LOGIN)
                .setPageTitle("Login Page")
                .addTextInput(new WebElement("Username", WebElementType.TEXT_INPUT, "Username"))
                .addTextInput(new WebElement("Password", WebElementType.TEXT_INPUT, "Password"))
                .addButton(new WebElement("Login", WebElementType.BUTTON, "Log In"));
    }

    public void buildComputerProductPage() {
        builder.reset()
                .setPageType(PageType.PRODUCT)
                .setPageTitle("Computer Page")
                .addStaticText(new WebElement("Product Name", WebElementType.SPAN, "Computer"))
                .addImage(new WebElement("Image", WebElementType.IMAGE, "pc.png"))
                .addStaticText(new WebElement("Description", WebElementType.SPAN, "The best PC in the room."))
                .addStaticText(new WebElement("Price", WebElementType.SPAN, "$3.000"))
                .addButton(new WebElement("Add to cart", WebElementType.BUTTON, "Buy me!"));
    }

    public void buildCellphoneProductPage() {
        builder.reset()
                .setPageType(PageType.PRODUCT)
                .setPageTitle("Cellphone Page")
                .addStaticText(new WebElement("Product Name", WebElementType.SPAN, "Cellphone"))
                .addImage(new WebElement("Image", WebElementType.IMAGE, "cell.png"))
                .addStaticText(new WebElement("Description", WebElementType.SPAN, "Your brand new phone."))
                .addStaticText(new WebElement("Price", WebElementType.SPAN, "$1.500"))
                .addButton(new WebElement("Add to cart", WebElementType.BUTTON, "Buy me!"));
    }
}
