package Class23.Abstraction;

public class FileTester {
    public static void main(String[] args) {
      File [] files={new JavaFile(),new WordFile(),new PdfFile()};
        for(File file:files){
            file.edit();
            file.close();
            file.open();

          //  if(file instanceof JavaFile){
           //     ((JavaFile)file).open();
         //   }
        //    if(file instanceof WordFile){
         //       ((WordFile)file).open();
         //   }
         //   if(file instanceof PdfFile){
           //     ((PdfFile)file).open();
          //  }
        }

    }
}
