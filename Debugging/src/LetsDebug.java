public class LetsDebug {
  public static void main(String[] args) {
    Student larry = new Student("Larry");
    System.out.println("First character of Larry's name: " + larry.getName().charAt(0));

    String[] courses = {"CSC395", "MAT321", "CSC207"};
    Student medha = new Student("Medha", 5, "00001", courses);
    System.out.println("Medha's courses: " + medha.printCourses());

    Student medhaCpy = new Student("Medha", 5, "00001", courses);
    
    System.out.println("They are the same: " + sameStudent(medha, medhaCpy));
  }

  public static boolean sameStudent(Student a, Student b) {
    return a == b;
  }
}