package oprators;

public class StudentPassedExam {
    public static void main(String[] args) {

        int math = 40;
        int chemistry = 35;
        int bio = 40;
        int physics = 50;

        if ((math >= 40 && chemistry >= 35) || (bio <= 30 && physics >= 50))
            System.out.println("Exam passed");
        else
            System.out.println("failed !!!");
    }
}
