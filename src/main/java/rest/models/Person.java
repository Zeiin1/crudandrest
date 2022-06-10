package rest.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min=2, max=40, message = "name should be between 2 characters and 40")
    private String name;

    @Min(value = 13, message = "you are under 13")
    private int age;

    @Email(message = "email must be valid")
    @NotEmpty(message = "Email should not be empty")
    private String email;
    public Person(){

    }
    public Person(int id, String name,int age,String email)
    {
      this.id=id;
      this.name=name;
      this.age=age;
      this.email=email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
