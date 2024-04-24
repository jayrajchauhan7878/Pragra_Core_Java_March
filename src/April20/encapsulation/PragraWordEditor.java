package April20.encapsulation;

public class PragraWordEditor {

    String fileExtension;
    Boolean isEditingAllowed;

    public PragraWordEditor(String fileExtension, Boolean isEditingAllowed) {
        this.fileExtension = fileExtension;
        this.isEditingAllowed = isEditingAllowed;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public Boolean getEditingAllowed() {
        return isEditingAllowed;
    }

    public void printPragraWordEditordDetails(){

        System.out.println("Type of file extension :"+fileExtension);
        System.out.println("Above file is allowed to edit ? "+isEditingAllowed);
    }

    @Override
    public String toString() {
        return "PragraWordEditor{" +
                "fileExtension='" + fileExtension + '\'' +
                ", isEditingAllowed=" + isEditingAllowed +
                '}';
    }
}
