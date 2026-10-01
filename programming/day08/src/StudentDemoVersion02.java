public class StudentDemoVersion02 {

        public static void main(String[] args) {

                Student s1 = new Student("Bob", 1211, 3.8f);
                Student s2 = new Student("Alice", 1222, 3.95f);
                Student s3 = new Student("Mark", 3222, 1.95f);

                // System.out.println(s1);
                // System.out.println(s2);
                // System.out.println(s3);

                // Earlier example: saving Student objects to files.
                // Assume there is a folder called "student".

                // SaveDataToAFile.saveDataToAFile(
                // "./student", s1.name + "_" + s1.id, s1);

                // SaveDataToAFile.saveDataToAFile(
                // "./student", s2.name + "_" + s2.id, s2);

                Faculty f1 = new Faculty(
                                1001,
                                "John Smith",
                                85000.0,
                                "Associate Professor");

                // System.out.println(f1);

                // Earlier example: saving a Faculty object to a file.
                // Assume there is a folder called "faculty".

                // SaveDataToAFile.saveDataToAFile(
                // "./faculty", f1.email, f1);

                /*
                 * ApiResponse is a generic class.
                 *
                 * Here, T is Student. Therefore, the data stored
                 * inside these ApiResponse objects must be Student objects.
                 */
                ApiResponse<Student> s1ApiResponse = new ApiResponse<Student>(
                                "active",
                                "good academic standing",
                                s1);

                //System.out.println(s1ApiResponse.getMessage());

                // The same ApiResponse<Student> can hold another Student
                // with a different status/message.
                ApiResponse<Student> s3ApiResponse = new ApiResponse<Student>(
                                "active",
                                "on probation",
                                s3);

                System.out.println(s1ApiResponse.getData()
                                + "\n ==> " + s1ApiResponse.getMessage());

                System.out.println(s3ApiResponse.getData()
                                + "\n ==> " + s3ApiResponse.getMessage());

                /*
                 * We do NOT need to create a separate FacultyResponse class.
                 *
                 * We can reuse ApiResponse by specifying Faculty as its type.
                 * Here, T is Faculty.
                 */
                ApiResponse<Faculty> f1ApiResponse = new ApiResponse<Faculty>(
                                "teaching",
                                "eligible for promotion",
                                f1);

                System.out.println(
                                f1ApiResponse.getData()
                                                + "\n ==> "
                                                + f1ApiResponse.getMessage());
        }
}