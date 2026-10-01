public class StudentDemoVersion02 {
 
    public static void main(String[] args) {
        
        Student s1 = new Student("Bob", 1211, 3.8f);
        Student s2 = new Student("Alice", 1222, 3.95f);

        s1.printInfo();
        s2.printInfo();

        SaveDataToAFile.saveDataToAFile("./data", s1.name + "_" + s1.id , s1);
        SaveDataToAFile.saveDataToAFile("./data", s2.name + "_" + s2.id , s2);       
    }
}
