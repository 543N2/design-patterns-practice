import PageFactory.*;

public class Client {

    public static void main(String[] args) {

        PageFactory loginPageFactory = new LoginPageFactory();
        BasePage loginPage = loginPageFactory.createPage();
        loginPage.clickElement();

        PageFactory productPageFactory = new ProductPageFactory();
        BasePage productPage = productPageFactory.createPage();
        productPage.clickElement();

    }
}