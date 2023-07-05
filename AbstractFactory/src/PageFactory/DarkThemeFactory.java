package PageFactory;

import Pages.*;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public LoginPage createLoginPage() {
        return new DarkLoginPage();
    }
    @Override
    public ProductPage createProductPage() {
        return new DarkProductPage();
    }
}
