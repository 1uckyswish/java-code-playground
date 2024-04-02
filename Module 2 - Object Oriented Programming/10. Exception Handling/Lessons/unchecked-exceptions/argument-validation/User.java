import java.lang.IllegalAccessException;
public class User {

    private String username;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) { 
     if(age < 0){
        throw new IllegalAccessException("Age cannot be negative");
     }
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if(username == null || username.isBlank()){
            throw new IllegalAccessException("Username cannot be null or blank");
        }
        this.username = username;
    }


}
