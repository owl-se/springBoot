package com.sprng.boot.page.google;

import com.sprng.boot.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Autowired
    private SearchResult searchResult;

    @Autowired
    private SearchComponent searchComponent;

    @Value("${application.url}")
    private String url;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void goTo() {
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
