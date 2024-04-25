public class QuizDriver {
    public static void Q1() {
        AdditionQuiz additionQuiz = new AdditionQuiz(5, 9);
        additionQuiz.startQuiz();

        MultiplicationQuiz multiplicationQuiz = new MultiplicationQuiz(5, 9);
        multiplicationQuiz.startQuiz();
    }
}