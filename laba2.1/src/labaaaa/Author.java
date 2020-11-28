package labaaaa;

public class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email=email;
        this.gender = gender;

    }
    public Author(String name, String email){
        this.name = name;
        this.email=email;
        this.gender = 'U';

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return   name +
                "(" + gender + ")"+
                " at " + email ;
    }
   
}
