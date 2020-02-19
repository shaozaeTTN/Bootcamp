package Java2;

public class UserNotFoundException extends Throwable {
    private String message;

    public UserNotFoundException(String message){
        this.message = message;
    }
    @Override
    public String toString(){
        return message;
    }
}
