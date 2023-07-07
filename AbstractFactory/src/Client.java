import Enums.ThemeType;
import Pages.LoginPage;
import Pages.ProductPage;

public class Client {
    public static void main(String[] args) {

        Application app = new Application();

        app.initialize(ThemeType.LIGHT);
        LoginPage lightLoginPage = app.factory.createLoginPage();
        lightLoginPage.clickElement();
        ProductPage lightProductPage = app.factory.createProductPage();
        lightProductPage.clickElement();

        app.initialize(ThemeType.DARK);
        LoginPage darkLoginPage = app.factory.createLoginPage();
        darkLoginPage.clickElement();
        ProductPage darkProductPage = app.factory.createProductPage();
        darkProductPage.clickElement();
    }
}
