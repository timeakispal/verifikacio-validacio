package edu.cs.ubb;

/**
 * Created by Máté Attila-Barna on 2016.03.25.
 */

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
