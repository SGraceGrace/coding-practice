package practice.design_pattern.example;

public class SubClass extends ParentClass{

  public SubClass(String str) {
    super(str);
  }

  public String msg() {
    System.out.println(getMsg());
    return parentStr;
  }

  public static void main(String[] args) {
    SubClass sb = new SubClass("hi");
    sb.msg();
  }
}
