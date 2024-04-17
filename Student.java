public class Student  extends Person{
    private String status; // Possible values: "freshman", "sophomore", "junior", "senior"

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}

}
