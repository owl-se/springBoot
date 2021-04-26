package com.sprng.boot.googletest;

import com.google.common.util.concurrent.Uninterruptibles;
import com.sprng.boot.SpringBaseTestNG;
import com.sprng.boot.page.google.GooglePage;
import com.sprng.boot.utils.ScreenShotutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest extends SpringBaseTestNG {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotutil screenShotutil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.googlePage.getSearchComponent().search("environment ");
        //this.screenShotutil.takeScreenShot("test.png");
    }
}
