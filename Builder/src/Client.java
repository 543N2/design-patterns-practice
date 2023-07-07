import Builders.LoginPageBuilder;
import Builders.ProductPageBuilder;
import Director.Director;
import Pages.LoginPage;
import Pages.ProductPage;

class Client {
    public static void main(String[] args) {

        Director director = new Director();


        // Login Page flows:
        LoginPageBuilder loginPageBuilder = new LoginPageBuilder();

        director.setBuilder(loginPageBuilder).buildLoginPage();
        LoginPage loginPage = loginPageBuilder.getPage();
        loginPage.getUserInput().type("ThisIsMyUsername");
        loginPage.getPasswordInput().type("ThisIsANotTooSecretPassword");
        loginPage.getLoginButton().click();


        // Product Page flows:
        ProductPageBuilder productPageBuilder = new ProductPageBuilder();

        director.setBuilder(productPageBuilder).buildComputerProductPage();
        ProductPage computerPage = productPageBuilder.getPage();
        computerPage.getName().hover();
        computerPage.getImage().hover();

        director.setBuilder(productPageBuilder).buildCellphoneProductPage();
        ProductPage cellphonePage = productPageBuilder.getPage();
        cellphonePage.getName().hover();
        cellphonePage.getImage().click();
        cellphonePage.getPrice().hover();
        cellphonePage.getAddToCart().click();


    }
}