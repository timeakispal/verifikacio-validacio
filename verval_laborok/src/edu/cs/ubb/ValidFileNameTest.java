package edu.cs.ubb;

import org.junit.*;
import org.mockito.*;


public class ValidFileNameTest {

    private static final String validFileName = "filename.slr";
    private static final String invalidFileName = "filename.slrr";

    private FakeFileExtMgr fileExtMgr;
    private TestableLogAnalyzer testableLogAnalyzer;
    private WebService manualWebService;
    private LogAnalyzer logAnalyzer;

    @Before
    public void setUp() throws Exception {
        fileExtMgr = new FakeFileExtMgr();
        manualWebService = new ManualWebService();
        logAnalyzer = new LogAnalyzer();
        logAnalyzer.setWebService(manualWebService);
    }

    @After
    public void tearDown() throws Exception { }

    @Test
    public void isValidFileNameReturnTrue() {
        fileExtMgr.setValid(true);
        testableLogAnalyzer = new TestableLogAnalyzer(fileExtMgr);
        Assert.assertEquals(true, testableLogAnalyzer.isValidFileName(validFileName));
    }

    @Test
    public void isValidFileName_FileNameTooShort_CallManualWebService() {
        logAnalyzer.isValidFileName("qw");
        Assert.assertEquals("assert in the last error", manualWebService.getLastError(), "qw file name is too short!");
    }

    @Test
    public void isValidFileName_FileNameTooShort_CallMockWebService() {
        WebService mockWebService = Mockito.mock(WebService.class);
        logAnalyzer.setWebService(mockWebService);
        logAnalyzer.isValidFileName("er");
        Mockito.verify(mockWebService, Mockito.times(2)).logError("er file name is too short!");
    }

}