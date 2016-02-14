public class Person
{
    String name;
     int age;
     String gender;
     String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    public String toString()
    {

        return getName()+" is a "+getGender()+" aged "+getAge()+" who lives at "+getAddress();

    }
    public static void main(String args[])
    {
        Person person=new Person();
        person.setName("Sagar Mal Shankhala");
        person.setAge(23);
        person.setGender("Male");
        person.setAddress("Rajasthan");

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Gender: "+person.getGender());
        System.out.println("address: "+person.getAddress());



    }

}
