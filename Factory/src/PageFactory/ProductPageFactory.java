package PageFactory;

import Enums.PageType;
import Pages.Page;
import Pages.ProductPage;

public class ProductPageFactory implements PageFactory{
    @Override
    public Page createPage() {
        return new ProductPage(PageType.PRODUCT);
    }
}
