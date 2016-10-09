package Spring.Hello;

/**
 * Created by AB on 10/9/2016.
 */


public class HelloSpring {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
