public class Student {
  private String name;
  private int age;
  private String id;
  private String[] courses;

  public Student(String name, int age, String id, String[] courses) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public Student(String name) {
    name = null;
  }

  public String[] getCourses() { return courses; }
  public String getName() { return name; }
  public String getId() { return id; }
  public int getAge() { return age; }
  public String printCourses() {
    String s = "";
    for (int i = 0; i < courses.length; i++) {
      s += courses[i] + "  ";
    }
    return s;
  }

}