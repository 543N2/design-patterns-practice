package Pages;

import Enums.PageType;

public abstract class Page {

    protected PageType pageType;

    public Page(PageType pageType) {
        this.pageType = pageType;
    }

    public void clickElement() {}

}
