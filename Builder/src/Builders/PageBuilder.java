package Builders;

import Enums.PageType;
import Pages.Page;
import Pages.WebElement;

public interface PageBuilder {
    PageBuilder reset();
    PageBuilder setPageTitle(String title);

    PageBuilder setPageType(PageType pageType);

    PageBuilder addButton(WebElement element);

    PageBuilder addTextInput(WebElement element);

    PageBuilder addStaticText(WebElement element);

    PageBuilder addImage(WebElement element);

}
