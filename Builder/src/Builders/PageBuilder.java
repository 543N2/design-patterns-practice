package Builders;

import Enums.PageType;
import Pages.Page;
import Pages.WebElement;

public interface PageBuilder {
    Page reset();
    void setPageTitle(String title);

    void setPageType(PageType pageType);

    void addButton(WebElement element);

    void addTextInput(WebElement element);

    void addStaticText(WebElement element);

    void addImage(WebElement element);

}
