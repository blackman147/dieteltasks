package ChapterSevenTest;

import CardGameException.CardGameException;

public class StackUnderflowException extends CardGameException {
    public StackUnderflowException(String message) {
        super(message);
    }
}
