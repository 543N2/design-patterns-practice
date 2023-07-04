import Enums.PageType;
import PageFactory.PageFactory;
import PageFactory.LoginPageFactory;
import PageFactory.ProductPageFactory;

public class Application {
    PageFactory pageFactory;
    public void initialize(PageType pageType) {
        if (pageType.equals(PageType.LOGIN))
            pageFactory = new LoginPageFactory();
        else if (pageType.equals(PageType.PRODUCT))
            pageFactory = new ProductPageFactory();
    }
}

