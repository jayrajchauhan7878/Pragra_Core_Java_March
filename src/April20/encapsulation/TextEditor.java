package April20.encapsulation;

public class TextEditor {



    String nameOfDocument;
    String extension;

    public TextEditor(String nameOfDocument, String extension) {
        this.nameOfDocument = nameOfDocument;
        this.extension = extension;
    }

    public void printTextEditorDetails(){

        System.out.println(nameOfDocument);
        System.out.println(extension);
    }

    public String getNameOfDocument() {
        return nameOfDocument;
    }

    public void setNameOfDocument(String nameOfDocument) {
        this.nameOfDocument = nameOfDocument;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "nameOfDocument='" + nameOfDocument + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
