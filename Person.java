package Project2021;
public class Person {

    private String name ="noon";
    private String username = "noon";
    private String phoneNumber = "00000";
    private int age = 0;

    public Person() {}

    public Person(String name, String username, String phoneNumber, int age) {
        this.name = name;
        this.username=username;
        this.phoneNumber = phoneNumber;
        this.age=age;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public String getUserName(){
        return username;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }
    public int getAge(){
        return age;
    }
    public int price(){
        return 0;
    }



}


