package edu.cs.ubb;

public class FileExtMgrStub implements FileExtMgr {

    private boolean stubReturn;

    @Override
    public boolean isValidFileName(String fileName) {
        return stubReturn;
    }

    public void setStubReturn(final boolean stubReturn) {
        this.stubReturn = stubReturn;
    }
}
