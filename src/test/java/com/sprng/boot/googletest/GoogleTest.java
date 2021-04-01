package com.sprng.boot.googletest;

import com.sprng.boot.SpringBaseTestNG;
import com.sprng.boot.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNG {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest() {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("spring boot");
    }
}
