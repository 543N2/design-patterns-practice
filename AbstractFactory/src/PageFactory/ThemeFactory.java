package PageFactory;

import Pages.LoginPage;
import Pages.ProductPage;

public interface ThemeFactory {
    LoginPage createLoginPage();
    ProductPage createProductPage();
}
