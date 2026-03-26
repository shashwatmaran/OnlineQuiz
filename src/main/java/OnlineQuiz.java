import java.util.*;

public class OnlineQuiz {

    public static void main(String[] args) {

        // Correct answers
        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");

        // User answers (sample input)
        Map<Integer, String> userAnswers = new HashMap<>();
        userAnswers.put(1, "A");
        userAnswers.put(2, "B");
        userAnswers.put(3, "D");

        int score = evaluateQuiz(correctAnswers, userAnswers);

        System.out.println("Final Score: " + score);
    }

    public static int evaluateQuiz(Map<Integer, String> correct, Map<Integer, String> user) {
        int score = 0;

        for (Integer qId : correct.keySet()) {
            if (user.containsKey(qId) && correct.get(qId).equals(user.get(qId))) {
                score++;
            }
        }

        return score;
    }
}