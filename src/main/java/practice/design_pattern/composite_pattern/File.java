package practice.design_pattern.composite_pattern;

public class File implements FileSystemItem{

  private String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void show() {
    System.out.println(name);
  }
}
