import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Sample {

    public static void main(String[] args) {

        Stack<Folder> stack = new Stack<>();

        stack.add(new Folder("root"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello world");
        while (true) {
            System.out.print(">>>");
            String cmd = scanner.nextLine();
            String[] cmdSplit = cmd.split(" ");

            if (cmd.equals("ls")) {
                stack.peek().printContents();
            } else if (cmdSplit[0].equals("cd")) {
                if (cmdSplit.length < 2) {
                    System.out.println("Usage: cd <folder>");
                } else if (!stack.isEmpty()) {
                    String folderToMove = cmdSplit[1];

                    if (folderToMove.equals("..")) {
                        stack.pop();
                        System.out.println("Cannot navigate up, already at the root.");
                    } else {
                        Folder newFolder = stack.peek().getSubFolder(folderToMove);
                        if (newFolder == null) {
                            System.out.println("No such directory");
                        } else {
                            stack.push(newFolder);
                        }
                    }
                }
            } else if (cmdSplit[0].equals("mkdir")) {
                if (cmdSplit.length < 2) {
                    System.out.println("Usage: mkdir <folder>");
                } else {
                    String folderToBeCreated = cmdSplit[1];
                    stack.peek().createSubFolder(folderToBeCreated);
                }
            } else if (cmdSplit[0].equals("rmdir")) {
                if (cmdSplit.length < 2) {
                    System.out.println("Usage: rmdir <folder>");
                } else {
                    String folderToBeRemoved = cmdSplit[1];
                    stack.peek().removeFolder(folderToBeRemoved);
                }
            } else if (cmdSplit[0].equals("pwd")) {
                Iterator<Folder> iterator = stack.iterator();

                while (iterator.hasNext()) {
                    Folder folder = iterator.next();
                    System.out.print(folder.folderName + "/");
                }
                System.out.println();
            } else if (cmdSplit[0].equals("touch")) {
                if (cmdSplit.length < 2) {
                    System.out.println("Usage: touch <file>");
                } else {
                    String fileToBeCreated = cmdSplit[1];
                    stack.peek().addFile(fileToBeCreated);
                }
            } else if (cmdSplit[0].equals("rm")) {
                if (cmdSplit.length < 2) {
                    System.out.println("Usage: rm <file>");
                } else {
                    String fileToBeRemoved = cmdSplit[1];
                    stack.peek().removeFile(fileToBeRemoved);
                }
            }
        }
    }
}
