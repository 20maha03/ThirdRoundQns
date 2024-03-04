import java.util.ArrayList;
import java.util.List;

public class Folder {

    public String folderName;

    private List<Folder> subFolders = new ArrayList<>();
    private List<String> files = new ArrayList<>();
    public Folder(String name) {
        folderName = name;
    }

    public void createSubFolder(String folderName) {
        if (subFolders.stream().anyMatch(folder -> folder.folderName.equals(folderName))) {
            System.out.println("Folder with the same name already exists. Please try again.");
        } else {
            subFolders.add(new Folder(folderName));
        }
    }

    public void addFile(String fileName) {
        if (files.contains(fileName)) {
            System.out.println("File with the same name already exists. Please try again.");
        } else {
            files.add(fileName);
         }
    }


    public Folder getSubFolder(String folderName) {
        Folder folder = null;
        for(Folder fold : subFolders) {
            if(fold.folderName.equals(folderName)) {
                folder = fold;
                break;
            }
        }

        return folder;
    }

    public void printContents() {
        for(Folder folder: subFolders) {
            System.out.println(folder.folderName);
        }
        for(String file: files) {
            System.out.println(file);
        }
    }

    public void removeFolder(String folderName) {
        int indexOfTheFolderToBeRemoved = -1;

        for(int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).folderName.equals(folderName)){
                indexOfTheFolderToBeRemoved = i;
                break;
            }
        }

        if (indexOfTheFolderToBeRemoved != -1) {
            subFolders.remove(indexOfTheFolderToBeRemoved);
        }
    }
    public void removeFile(String folderName) {
        int indexOfTheFileToBeRemoved = -1;

        for(int i = 0; i < files.size(); i++) {
            if (files.get(i).equals(folderName)){
                indexOfTheFileToBeRemoved = i;
                break;
            }
        }

        if (indexOfTheFileToBeRemoved != -1) {
            files.remove(indexOfTheFileToBeRemoved);
        }
    }

}
