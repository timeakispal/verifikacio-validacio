package edu.cs.ubb;


public class FakeFileExtMgr implements FileExtMgr {

    private boolean valid;

    @Override
    public boolean isValidFileName(String fileName) {
        return valid;
    }

    public void setValid(boolean valid){
        this.valid = valid;
    }
}
