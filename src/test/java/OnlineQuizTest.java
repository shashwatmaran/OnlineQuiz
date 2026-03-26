import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class OnlineQuizTest {

    @Test
    void testAllCorrect() {
        Map<Integer, String> correct = Map.of(1,"A", 2,"B");
        Map<Integer, String> user = Map.of(1,"A", 2,"B");

        assertEquals(2, OnlineQuiz.evaluateQuiz(correct, user));
    }

    @Test
    void testAllWrong() {
        Map<Integer, String> correct = Map.of(1,"A", 2,"B");
        Map<Integer, String> user = Map.of(1,"C", 2,"D");

        assertEquals(0, OnlineQuiz.evaluateQuiz(correct, user));
    }

    @Test
    void testPartialCorrect() {
        Map<Integer, String> correct = Map.of(1,"A", 2,"B");
        Map<Integer, String> user = Map.of(1,"A", 2,"D");

        assertEquals(1, OnlineQuiz.evaluateQuiz(correct, user));
    }
}