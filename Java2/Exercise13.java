package Java2;

public class Exercise13 {
    public static void main(String[] args) {
        Exercise13 customException =  new Exercise13();
        try{
            customException.getUser();
        }catch(UserNotFoundException e){
            e.printStackTrace();
        }
    }
    String getUser() throws UserNotFoundException{
        throw new UserNotFoundException("User not Found");
    }
}
