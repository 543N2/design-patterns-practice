package Builders;


import Enums.PageType;
import Pages.ProductPage;
import Pages.Page;
import Pages.WebElement;

public class ProductPageBuilder implements PageBuilder {
    private ProductPage page;

    @Override
    public PageBuilder reset() {
        page = new ProductPage("Product Page", PageType.PRODUCT);
        return this;
    }

    @Override
    public PageBuilder setPageTitle(String title) {
        page.setTitle(title);
        return this;
    }

    @Override
    public PageBuilder setPageType(PageType pageType) {
        page.setPageType(pageType);
        return this;
    }

    @Override
    public PageBuilder addButton(WebElement element) {
        page.setAddToCart(element);
        return this;
    }

    @Override
    public PageBuilder addTextInput(WebElement element) {
        return this;
    }

    @Override
    public PageBuilder addStaticText(WebElement element) {
        if (element.getName().equals("Product Name"))
            page.setName(element);
        else if (element.getName().equals("Description"))
            page.setDescription(element);
        else if (element.getName().equals("Price"))
            page.setPrice(element);
        return this;
    }

    @Override
    public PageBuilder addImage(WebElement element) {
        page.setImage(element);
        return this;
    }

    public ProductPage getPage() {
        System.out.println("\nShowing " + page.getTitle());
        return page;
    }
}
