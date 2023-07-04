package PageFactory;

import Enums.PageType;

public abstract class BasePage {

    protected PageType pageType;

    public BasePage(PageType pageType) {
        this.pageType = pageType;
    }

    public void clickElement() {}

}
