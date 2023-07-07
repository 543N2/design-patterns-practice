package Pages;

import Enums.ClickType;
import Enums.PageType;

public class LoginPage extends Page {
    private String buttonLocator;

    public LoginPage(PageType pageType){
        super(pageType);
        this.buttonLocator = "#btn-login";
    }

    @Override
    public void clickElement() {
        System.out.println(ClickType.LEFT.label + " clicking button with locator '" + this.buttonLocator +"' from " + pageType.label + " page.");
    }

}
