package edu.cs.ubb;


public class LogAnalyzer {

    private WebService webService;

    public boolean isValidFileName(String fileName) {

        if(fileName.length() < 3 && webService != null) {
            webService.logError(fileName + " file name is too short!");
        }
        if(getFileExtMgr() != null) {
            return getFileExtMgr().isValidFileName(fileName);
        }
        return false;
    }

    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    public FileExtMgr getFileExtMgr() {
        return FileExtMgrFactory.getInstance().getFileExtMgr();
    }

}
