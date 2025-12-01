package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\GRACE S\\OneDrive\\Documents\\CODING_PRACTICE\\folders\\readme");
//        Files.writeString(path, "This is file practice" + System.lineSeparator(), StandardOpenOption.APPEND);
//        String s = Files.readString(path);
//        System.out.println(s);
        Path directory = Path.of("C:\\Users\\GRACE S\\OneDrive\\Documents\\CODING_PRACTICE\\folders");
        System.out.println(directory);
        var file = Files.list(directory);
        file.forEach(System.out::println);
//        boolean exists = Files.exists(path);
//        FileTime date = Files.getLastModifiedTime(path);
//        UserPrincipal owner = Files.getOwner(path);
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());

//        Path path1 = Files.createTempFile("new", "new_file");
//        System.out.println(path1);

//        Path newFile = Files.createFile(path.getParent().resolve("newFile"));
//        System.out.println(newFile);
//        System.out.println(path);
//        System.out.println(exists);
//        System.out.println(date);
//        System.out.println(owner);

//        Path path1 = Path.of("C:\\Users\\GRACE S\\OneDrive\\Documents\\CODING_PRACTICE\\folders\\").resolve("readme");
//        System.out.println(path1);
//        boolean exist = Files.exists(path1);
//        System.out.println(exist);
    }
}
