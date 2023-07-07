import Enums.PageType;
import Pages.Page;

public class Client {

    public static void main(String[] args) {

        Application app = new Application();

        app.initialize(PageType.LOGIN);
        Page loginPage = app.pageFactory.createPage();
        loginPage.clickElement();

        app.initialize(PageType.PRODUCT);
        Page productPage = app.pageFactory.createPage();
        productPage.clickElement();
    }
}