package practice.design_pattern.composite_pattern;

public class main {

  public static void main(String[] args) {

    Folder root = new Folder("Root");

    Folder documents =
        new Folder("Documents");

    File resume =
        new File("Resume.pdf");

    File notes =
        new File("Notes.txt");

    documents.add(resume);
    documents.add(notes);

    root.add(documents);

    root.show();
  }
}
