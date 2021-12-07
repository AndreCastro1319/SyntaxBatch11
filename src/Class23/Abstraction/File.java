package Class23.Abstraction;

public abstract class File {
    //Create a class File that will have the following behaviors
    // : open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text,
    // to open .doc file we need Microsoft word to be installed etc.

       abstract void open();

       void edit(){
           System.out.println("Use buttons Command+Edit to edit a file");
       }
       void close(){
           System.out.println("Use buttons Command+Close to close a file");
       }
}
class JavaFile extends File{
    void open(){
        System.out.println("Use buttons Command+Open to open a java.file");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("Use buttons Command+ctrl+Open to open a wrd.file");
    }
}
class PdfFile extends File{
    void open(){
        System.out.println("Use buttons CtrL+Shift+Open to open a pdf.file");
    }
}