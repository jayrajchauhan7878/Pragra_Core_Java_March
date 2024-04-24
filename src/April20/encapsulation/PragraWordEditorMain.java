package April20.encapsulation;

public class PragraWordEditorMain {
    public static void main(String[] args) {

        PragraWordEditor pragraWordEditor = new PragraWordEditor(".pdf",false);

        pragraWordEditor.printPragraWordEditordDetails();

        Boolean editingAllowed = pragraWordEditor.getEditingAllowed();
        System.out.println("This file extension is allowed ? "+editingAllowed);
        String fileExt = pragraWordEditor.getFileExtension();
        System.out.println("File extension : "+fileExt);
    }
}
