package Pages;

import Enums.PageType;

public class LoginPage extends Page {

    private WebElement userInput;
    private WebElement passwordInput;
    private WebElement loginButton;

    public LoginPage(String title, PageType pageType){
        super(title, pageType);
    }

    public WebElement getUserInput() {
        return userInput;
    }

    public void setUserInput(WebElement userInput) {
        this.userInput = userInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(WebElement passwordInput) {
        this.passwordInput = passwordInput;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }

}
