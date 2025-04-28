package Quiz_App;

import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];

    public QuestionService() {

        questions[0] = new Questions(1, "size of int ?", "1", "2", "4", "8", "4");
        questions[1] = new Questions(2, "size of float ?", "1", "2", "4", "8", "4");
        questions[2] = new Questions(3, "size of long ?", "1", "2", "4", "8", "8");
        questions[3] = new Questions(4, "size of double ?", "1", "2", "4", "8", "8");
        questions[4] = new Questions(5, "size of char ?", "1", "2", "4", "8", "2");
    }

    String[] userans = new String[5];

    public void displayQuestions() {
        int i = 0;
        for (Questions s : questions) {
            System.out.println(s.getId());
            System.out.println(s.getQuestion());
            System.out.println(s.getOpt1());
            System.out.println(s.getOpt2());
            System.out.println(s.getOpt3());
            System.out.println(s.getOpt4());

            Scanner sc = new Scanner(System.in);
            userans[i] = sc.nextLine();
            i++;
        }
    }

    public void displayMarks() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAns().equals(userans[i])) {
                score += 1;
            }
        }
        System.out.println("Your Score is :" + score);
    }

}
