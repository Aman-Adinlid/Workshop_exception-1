package se.lexicon.exceptions.workshop.data_access;

public class DuplicateNameException extends Exception {
    private String message;

    public DuplicateNameException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
