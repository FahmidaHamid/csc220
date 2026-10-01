public class Faculty implements Savable {

    protected int id;
    protected String name;
    protected double salary;
    protected String rank;
    protected String email;

    public Faculty(int id, String name, double salary,
            String rank) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rank = rank;
        // todo: faculty email takes 6 characters from the name and adds the domain
        // "@university.edu", so we used an overloaded version of the generateNewEmail method.
        this.email = EmailGenerator.generateNewEmail(name, "callutheran", 6);
    }

    @Override
    public String toString() {

        return "Faculty ID: " + id
                + "\nFaculty Name: " + name
                + "\nRank: " + rank
                + "\nEmail: " + email
                + "\nSalary: $" + salary;
    }

    /*
     * Faculty uses its own format for saving data.
     * This overrides the default getDataToSave()
     * provided by the Savable interface.
     */
    @Override
    public String getDataToSave() {

        return id + ","
                + name + ","
                + rank + ","
                + email + ","
                + salary;
    }
}
