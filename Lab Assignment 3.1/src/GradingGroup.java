
class GradingGroup {
    private Student student1;
    private Student student2;
    private String evaluationDate;
    private String evaluationLabNo;

    // no-arg constructor
    public GradingGroup() {
    }

    // regular constructor
    public GradingGroup(Student student1, Student student2, String evaluationDate, String evaluationLabNo) {
        this.student1 = student1;
        this.student2 = student2;
        this.evaluationDate = evaluationDate;
        this.evaluationLabNo = evaluationLabNo;
    }

    // Accessor methods
    public Student getStudent1() {
        return student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public String getEvaluationDate() {
        return evaluationDate;
    }

    public String getEvaluationLabNo() {
        return evaluationLabNo;
    }

    // Mutator methods
    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public void setEvaluationLabNo(String evaluationLabNo) {
        this.evaluationLabNo = evaluationLabNo;
    }

    // toString method
    public String toString() {
        return "GradingGroup{" +
                "student1=" + student1 +
                ", student2=" + student2 +
                ", evaluationDate='" + evaluationDate + '\'' +
                ", evaluationLabNo='" + evaluationLabNo + '\'' +
                '}';
    }

    // Method to find the top student based on self-score
    public Student findTopStudent() {
        if (student1.getScoreSelfLatest() > student2.getScoreSelfLatest()) {
            return student1;
        } else {
            return student2;
        }
    }
}