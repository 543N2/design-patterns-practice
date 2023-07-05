import Enums.ThemeType;
import PageFactory.Page;

public class Client {
    public static void main(String[] args) {
        Application app = new Application();

        app.initialize(ThemeType.LIGHT);
        Page lightLoginPage = app.factory.createLoginPage();
        lightLoginPage.clickElement();
        Page lightProductPage = app.factory.createProductPage();
        lightProductPage.clickElement();

        app.initialize(ThemeType.DARK);
        Page darkLoginPage = app.factory.createLoginPage();
        darkLoginPage.clickElement();
        Page darkProductPage = app.factory.createProductPage();
        darkProductPage.clickElement();
    }
}
