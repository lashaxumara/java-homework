package ge.tbc.testautomation.exceptionsStringOperationsRegex;

public class LimitException extends RuntimeException {

    public LimitException(String instantiationLimitReached) {
        super(instantiationLimitReached);
    }
}
