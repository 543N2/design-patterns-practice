package Builders;


import Enums.PageType;
import Pages.ProductPage;
import Pages.Page;
import Pages.WebElement;

public class ProductPageBuilder implements PageBuilder {
    private ProductPage page;

    @Override
    public Page reset() {
        ProductPage builtPage = page;
        page = new ProductPage("Product Page", PageType.PRODUCT);
        return builtPage;
    }

    @Override
    public void setPageTitle(String title) {
        page.setTitle(title);
    }

    @Override
    public void setPageType(PageType pageType) {
        page.setPageType(pageType);
    }

    @Override
    public void addButton(WebElement element) {
        page.setAddToCart(element);
    }

    @Override
    public void addTextInput(WebElement element) {
    }

    @Override
    public void addStaticText(WebElement element) {
        if (element.getName().equals("Product Name"))
            page.setName(element);
        else if (element.getName().equals("Description"))
            page.setDescription(element);
        else if (element.getName().equals("Price"))
            page.setPrice(element);
    }

    @Override
    public void addImage(WebElement element) {
        page.setImage(element);
    }

    public ProductPage getPage() {
        System.out.println("\nShowing " + page.getTitle());
        return page;
    }
}
