package Pages;

import Enums.ClickType;
import Enums.PageType;

public class ProductPage extends Page {

    private WebElement name;
    private WebElement image;
    private WebElement description;
    private WebElement price;
    private WebElement addToCart;

    public ProductPage(String title, PageType pageType) {
        super(title, pageType);
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public WebElement getImage() {
        return image;
    }

    public void setImage(WebElement image) {
        this.image = image;
    }

    public WebElement getDescription() {
        return description;
    }

    public void setDescription(WebElement description) {
        this.description = description;
    }

    public WebElement getPrice() {
        return price;
    }

    public void setPrice(WebElement price) {
        this.price = price;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public void setAddToCart(WebElement addToCart) {
        this.addToCart = addToCart;
    }
}
