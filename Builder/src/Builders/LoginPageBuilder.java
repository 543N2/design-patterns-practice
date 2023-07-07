package Builders;

import Enums.PageType;
import Pages.LoginPage;
import Pages.Page;
import Pages.WebElement;

public class LoginPageBuilder implements PageBuilder {
    private LoginPage page;

    @Override
    public Page reset() {
        LoginPage builtPage = page;
        page = new LoginPage("Login Page", PageType.LOGIN);
        return builtPage;
    }

    @Override
    public void setPageTitle(String title) {
        page.setTitle(title);
    }

    @Override
    public void setPageType(PageType pageType) {
        page.setPageType(pageType);
    }

    @Override
    public void addButton(WebElement element) {
        page.setLoginButton(element);
    }

    @Override
    public void addTextInput(WebElement element) {
        if (element.getName().equals("Username"))
            page.setUserInput(element);
        else if (element.getName().equals("Password"))
            page.setPasswordInput(element);
    }

    @Override
    public void addStaticText(WebElement element) {
    }

    @Override
    public void addImage(WebElement element) {
    }

    public LoginPage getPage() {
        System.out.println("\nShowing " + page.getTitle());
        return page;
    }
}
