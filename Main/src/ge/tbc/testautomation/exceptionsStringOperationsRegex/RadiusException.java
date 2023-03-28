package ge.tbc.testautomation.exceptionsStringOperationsRegex;

public class RadiusException extends RuntimeException {
    public RadiusException(String radiusValueNotValid) {

        super(radiusValueNotValid);
    }
}
