package edu.cs.ubb;

public class FileExtMgrFactory {

    private static FileExtMgrFactory fileExtMgrFactoryInstance;
    private FileExtMgr fileExtMgr;

    public static FileExtMgrFactory getInstance() {
        if(fileExtMgrFactoryInstance == null)
            fileExtMgrFactoryInstance = new FileExtMgrFactory();
        return fileExtMgrFactoryInstance;
    }

    public FileExtMgr getFileExtMgr() {
        if(fileExtMgr != null) {
            return fileExtMgr;
        } else {
            return new FakeFileExtMgr();
        }
    }

    public void setFileExtensionManager(FileExtMgr fileExtMgr) {
        this.fileExtMgr = fileExtMgr;
    }
}
