package PageFactory;

import Enums.PageType;

public class LoginPageFactory implements PageFactory{
    @Override
    public BasePage createPage() {
        return new LoginPage(PageType.LOGIN);
    }
}
