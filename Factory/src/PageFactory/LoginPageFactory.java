package PageFactory;

import Enums.PageType;
import Pages.LoginPage;
import Pages.Page;

public class LoginPageFactory implements PageFactory{
    @Override
    public Page createPage() {
        return new LoginPage(PageType.LOGIN);
    }
}
