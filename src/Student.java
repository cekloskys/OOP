public class Student {
    
    // Encapsulation is to hide unnecessary details in a class
    // and provide a clear and simple interfaces for working with them.
    private String firstName;
    private String lastName;
    private String schoolName;
    
    public Student(String firstName, String lastName, String schoolName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String greeting() {
        return "Hi, my name is " + firstName + " " + lastName + ". I go to school at " +
            schoolName + ".";
    }
}
