package Builders;

import Enums.PageType;
import Pages.LoginPage;
import Pages.Page;
import Pages.WebElement;

public class LoginPageBuilder implements PageBuilder {
    private LoginPage page;

    @Override
    public PageBuilder reset() {
        page = new LoginPage("Login Page", PageType.LOGIN);
        return this;
    }

    @Override
    public PageBuilder setPageTitle(String title) {
        page.setTitle(title);
        return this;
    }

    @Override
    public PageBuilder setPageType(PageType pageType) {
        page.setPageType(pageType);
        return this;
    }

    @Override
    public PageBuilder addButton(WebElement element) {
        page.setLoginButton(element);
        return this;
    }

    @Override
    public PageBuilder addTextInput(WebElement element) {
        if (element.getName().equals("Username"))
            page.setUserInput(element);
        else if (element.getName().equals("Password"))
            page.setPasswordInput(element);
        return this;
    }

    @Override
    public PageBuilder addStaticText(WebElement element) {
        return this;
    }

    @Override
    public PageBuilder addImage(WebElement element) {
        return this;
    }

    public LoginPage getPage() {
        System.out.println("\nShowing " + page.getTitle());
        return page;
    }
}
