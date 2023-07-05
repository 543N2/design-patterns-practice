import Enums.ThemeType;
import PageFactory.DarkThemeFactory;
import PageFactory.LightThemeFactory;
import PageFactory.ThemeFactory;

public class Application {
    ThemeFactory factory;
    void initialize(ThemeType theme){
        if(theme.equals(ThemeType.LIGHT))
            factory = new LightThemeFactory();
        if(theme.equals(ThemeType.DARK))
            factory = new DarkThemeFactory();
    }
}
