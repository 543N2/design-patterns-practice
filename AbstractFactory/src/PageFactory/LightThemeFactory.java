package PageFactory;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Page createLoginPage() {
        return new LightLoginPage();
    }

    @Override
    public Page createProductPage() {
        return new LightProductPage();
    }
}
