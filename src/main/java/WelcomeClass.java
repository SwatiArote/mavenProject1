/**
 * Created by swati on 5/10/16.
 */
// @Service


public class WelcomeClass{

    private String name;

    public WelcomeClass(String name) {
        this.name = name;
    }

    public void welcomeMsg(){
        System.out.println("Hello...Welcome...."+name);
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
}
