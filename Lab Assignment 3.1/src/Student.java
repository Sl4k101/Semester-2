
class Student {
    private String studentID;
    private String lastName;
    private String firstName;
    private double scoreSelfLatest;
    private double scoreProvidedLatest;
    private String commentsReceivedLatest;
    private String commentsProvidedLatest;

    // no-arg constructor
    public Student() {
    }

    // regular constructor
    public Student(String studentID, String lastName, String firstName,
            double scoreSelfLatest, double scoreProvidedLatest,
            String commentsReceivedLatest, String commentsProvidedLatest) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.scoreSelfLatest = scoreSelfLatest;
        this.scoreProvidedLatest = scoreProvidedLatest;
        this.commentsReceivedLatest = commentsReceivedLatest;
        this.commentsProvidedLatest = commentsProvidedLatest;
    }

    // Accessor methods
    public String getStudentID() {
        return this.studentID;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public double getScoreSelfLatest() {
        return this.scoreSelfLatest;
    }

    public double getScoreProvidedLatest() {
        return this.scoreProvidedLatest;
    }

    public String getCommentsReceivedLatest() {
        return this.commentsReceivedLatest;
    }

    public String getCommentsProvidedLatest() {
        return this.commentsProvidedLatest;
    }

    // Mutator methods
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setScoreSelfLatest(double scoreSelfLatest) {
        this.scoreSelfLatest = scoreSelfLatest;
    }

    public void setScoreProvidedLatest(double scoreProvidedLatest) {
        this.scoreProvidedLatest = scoreProvidedLatest;
    }

    public void setCommentsReceivedLatest(String commentsReceivedLatest) {
        this.commentsReceivedLatest = commentsReceivedLatest;
    }

    public void setCommentsProvidedLatest(String commentsProvidedLatest) {
        this.commentsProvidedLatest = commentsProvidedLatest;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", scoreSelfLatest=" + scoreSelfLatest +
                ", scoreProvidedLatest=" + scoreProvidedLatest +
                ", commentsReceivedLatest='" + commentsReceivedLatest + '\'' +
                ", commentsProvidedLatest='" + commentsProvidedLatest + '\'' +
                '}';
    }
}
