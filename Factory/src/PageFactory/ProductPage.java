package PageFactory;

import Enums.ClickType;
import Enums.PageType;

public class ProductPage extends BasePage {

    private String imageLocator;

    public ProductPage(PageType pageType) {
        super(pageType);
        this.imageLocator = "#img-product";
    }

    @Override
    public void clickElement() {
        System.out.println(ClickType.RIGHT.label + " clicking image with locator '" + this.imageLocator +"' from " + pageType.label + " page.");
    }


}
