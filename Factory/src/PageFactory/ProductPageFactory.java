package PageFactory;

import Enums.PageType;

public class ProductPageFactory implements PageFactory{
    @Override
    public BasePage createPage() {
        return new ProductPage(PageType.PRODUCT);
    }
}
