package PageFactory;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Page createLoginPage() {
        return new DarkLoginPage();
    }
    @Override
    public Page createProductPage() {
        return new DarkProductPage();
    }
}
