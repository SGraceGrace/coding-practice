package practice.design_pattern.example;

public class ParentClass {

   String parentStr;

  public ParentClass(String str) {
    System.out.println(str);
  }

  String getMsg() {
    return "hello parent";
  }
}
