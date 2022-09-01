// Inheritance is to use class hierarchies to enable the reuse of functionality.
public class UndergradStudent extends Student implements Major {

    private Double gpa;
    private Integer creditsEarned;
    private String major;

    public UndergradStudent(String firstName, String lastName, String schoolName, Double gpa,
            Integer creditsEarned, String major) {
        super(firstName, lastName, schoolName);
        this.gpa = gpa;
        this.creditsEarned = creditsEarned;
        this.major = major;
    }  

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getCreditsEarned() {
        return creditsEarned;
    }

    public void setCreditsEarned(Integer creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Polymorphism is to override methods to change their behavior
    @Override
    public Integer creditsRemaining(Integer creditsRequired) {
        return creditsRequired - creditsEarned;
    }

    @Override
    public String greeting() {
        return super.greeting() + " My major is " + major + ". My GPA is " + gpa +
                " and I have earned " + creditsEarned + " credits.";
    }

    @Override
    public Boolean isMajorComplete(Integer creditsRequired) {
        return creditsRemaining(creditsRequired) == 0;
    }
    
}
