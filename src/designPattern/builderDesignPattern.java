package designPattern;//package designPattern;
//
//public class User {
//    private  String firstName;
//    private  String lastName;
//    private int age;
//    private String email;
//    private String phone;
//
//    private User(UserBuilder userBuilder) {
//        this.firstName = userBuilder.firstName;
//        this.lastName = userBuilder.lastName;
//        this.age = userBuilder.age;
//        this.email = userBuilder.email;
//        this.phone = userBuilder.phone;
////    }
//
//    public User(User user) {
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
//
//    public static class UserBuilder {
//        private String firstName;
//        private String lastName;
//        private int age;
//        private String email;
//        private String phone;
//
//        public UserBuilder(String ankit, String jibhakate) {
//        }
//    }
//
//    public User(String lastName, String firstName) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//    }
//
//    public User age(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public User email(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public User phone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//
//    // Build method to create a `User` instance
//    public User build() {
//        return new User(this);
//    }
//
//
//}
//
//public class builderDesignPattern {
//    public static void main(String[] args) {
//
//        User user = new User.UserBuilder("Ankit", "Jibhakate")
//                .age(31)
//                .email("ankit@example.com")
//                .phone("1234567890")
//                .build();
//
//        System.out.println(user);
//
//
//    }
//}
