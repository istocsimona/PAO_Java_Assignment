package Ex1.Exceptii;

public class FileProcessingException extends RuntimeException {
    public FileProcessingException(String message) {
        super(message);
    }
}
