package edu.cs.ubb;


public class TestableLogAnalyzer extends LogAnalyzer {

    private FileExtMgr fileExtMgr;

    public TestableLogAnalyzer(FileExtMgr fakeFileExtMgr) {
        this.fileExtMgr = fakeFileExtMgr;
    }

    @Override
    public FileExtMgr getFileExtMgr() {
        return fileExtMgr;
    }

}
