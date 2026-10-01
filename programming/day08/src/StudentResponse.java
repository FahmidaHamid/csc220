public class StudentResponse {

    private String status;
    private String message;
    private Student data;

    public StudentResponse(
            String status, String message, Student data) {

        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Student getData() {
        return data;
    }
}