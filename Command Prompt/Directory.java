import java.util.*;
public class Directory {
  
  Scanner input = new Scanner (System.in);

  List<String> files;
  List<String> subDirectories;

  public Directory(){
      this.files = new ArrayList<>();
      this.subDirectories = new ArrayList<>();
  }
  public void createTheRirectory (){
      System.out.println("enter the file name");
      String name = input.nextLine();
      files.add(name);
  }

  public void createTheSubRirectory(){
      System.out.println("enter the subdirectory name");
      String name = input.nextLine();
      subDirectories.add(name);
  }
  public void listAll(){
      System.out.println("files:"+getFilesList());
      System.out.println("Directories:"+getDirectoriesList());
  }
  public List<String> getFilesList() {
      List<String> fileName = new ArrayList<>();
      for (String file : files) {
         fileName.add(files);
      }
      return fileName;
  }
  public List<String> getDirectoriesList() {
      List<String> directoryName = new ArrayList<>();
      for (String directory : subDirectories) {
         directoryName.add(subDirectories);
      }
      return directoryName;
  }
  public void deleteFile() {
      System.out.println("enter the index:");
      int fileIndex = input.nextInt();
   
      if (fileIndex >= 0 && fileIndex < files.size()) {
         files.remove(fileIndex);
      }
      else {
         System.out.println("file not found");
      }
  }
  public void deleteDirectories() {
      System.out.println("enter the index:");
      int fileIndex = input.nextInt();
   
      if (fileIndex >= 0 && fileIndex < subDirectories.size()) {
         subDirectories.remove(fileIndex);
      }
      else {
         System.out.println("file not found");
      }
  }
}