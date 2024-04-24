package April20.encapsulation;

public class EditorMain {


    public static void main(String[] args) {


        TextEditor textEditor = new TextEditor("Learn Java",".docx");

        System.out.println("Orignal extension of file");
        String ext = textEditor.getExtension();
        System.out.println("Extension of file is "+ext);

        System.out.println("After modifying :");
        textEditor.setExtension(".pdf");

        String ext1 = textEditor.getExtension();
        System.out.println(ext1);





    }
}
