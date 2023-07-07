package Pages;

import Enums.ClickType;
import Enums.PageType;

public abstract class Page {

    private String title;
    private PageType pageType;

    public Page(String title, PageType pageType) {
        this.title = title;
        this.pageType = pageType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PageType getPageType() {
        return pageType;
    }

    public void setPageType(PageType pageType) {
        this.pageType = pageType;
    }

}
