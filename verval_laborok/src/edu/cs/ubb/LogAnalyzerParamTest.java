package edu.cs.ubb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogAnalyzerParamTest {

    private LogAnalyzer logAnalyzer;
    private FileExtMgrStub fileExtensionManager;

    @Parameterized.Parameter
    public String input;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"something.slr", true} ,{ "something.slrr", false }
        });
    }

    @Before
    public void setUp() {
        fileExtensionManager = new FileExtMgrStub();
        logAnalyzer = new LogAnalyzer();
    }

    @Test
    public void test() {
        fileExtensionManager.setStubReturn(expected);
        Assert.assertEquals(expected, logAnalyzer.isValidFileName(input));
    }
}