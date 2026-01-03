package opps;

public class ReturnStatment {
    public String getname() {
        return "ankit";
    }

    public String getSurname(String str) {
        return str;
    }

    public static void main(String[] args) {
        ReturnStatment returnStatment = new ReturnStatment();

        System.out.println(returnStatment.getname());

        System.out.println(returnStatment.getSurname("Jibhakate"));
    }
}
