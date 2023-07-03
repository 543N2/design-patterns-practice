package Drivers;

public class WebDriver {
    private static CommercialDriver instance;
    private WebDriver() {}
    public static CommercialDriver getInstance() {
        if (instance == null) {
            instance = new CommercialDriver();
        } else {
            instance.whoAmI();
        }
        return instance;
    }
}
