package practice.design_pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {

  private String name;

  private List<FileSystemItem> children =
      new ArrayList<>();

  public Folder(String name) {
    this.name = name;
  }

  public void add(FileSystemItem item) {
    children.add(item);
  }

  @Override
  public void show() {

    System.out.println(name);

    for(FileSystemItem item : children) {
      item.show();
    }
  }
}
