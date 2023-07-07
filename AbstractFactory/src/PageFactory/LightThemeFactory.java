package PageFactory;

import Pages.*;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public LoginPage createLoginPage() {
        return new LightLoginPage();
    }

    @Override
    public ProductPage createProductPage() {
        return new LightProductPage();
    }
}
