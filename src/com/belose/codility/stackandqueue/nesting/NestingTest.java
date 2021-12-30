package com.belose.codility.stackandqueue.nesting;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NestingTest {

    private  Nesting nesting;

    @BeforeTest
    public void setup(){
        nesting = new Nesting();
    }

    @DataProvider(name = "test1")
    public Object[][] createTestData(){
        return new Object[][] {
                new Object[] { "()()", 1},
                new Object[] { "(())", 1},
                new Object[] { "())()", 0},
                new Object[] { "()({{{)", 0},
        };
    }

    @Test(dataProvider = "test1")
    public void verifyIsStringProperlyNested(String input, int expected){
        Assert.assertEquals(nesting.isStringProperlyNested(input), expected);
    }

}
