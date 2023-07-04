import Enums.PageType;
import PageFactory.*;

public class Client {

    public static void main(String[] args) {

        Application app = new Application();

        app.initialize(PageType.LOGIN);
        BasePage loginPage = app.pageFactory.createPage();
        loginPage.clickElement();

        app.initialize(PageType.PRODUCT);
        BasePage productPage = app.pageFactory.createPage();
        productPage.clickElement();
    }
}