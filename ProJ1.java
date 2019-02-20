import java.util.InputMismatchException;
import java.util.Scanner;

public class ProJ1 {

    public static void main(String[] args){

        try {


            Scanner assignment = new Scanner(System.in);

            int assignment1, assignment2, assignment3, assignment4, assignment5, assignment6;
            int quiz1, quiz2, quiz3, quiz4, quiz5, quiz6, quiz7, quiz8, quiz9, quiz10, quiz11;
            int project1, project2, project3;
            int assignmentAverage;
            int assignmentSum;
            int projectAverage;
            int projectSum;
            int quizAverage;
            int quizSum;
            double totalScore;
            double assFinalGradePercentage;
            double proFinalGradePercentage;
            double quiFinalGradePercentage;


            System.out.println("Enter your score for assignment 1:");
            assignment1 = assignment.nextInt();

            System.out.println("Enter your score for assignment 2:");
            assignment2 = assignment.nextInt();

            System.out.println("Enter your score for assignment 3:");
            assignment3 = assignment.nextInt();

            System.out.println("Enter your score for assignment 4:");
            assignment4 = assignment.nextInt();

            System.out.println("Enter your score for assignment 5:");
            assignment5 = assignment.nextInt();

            System.out.println("Enter your score for assignment 6:");
            assignment6 = assignment.nextInt();


            Scanner quiz = new Scanner(System.in);
            System.out.println("Enter your score for quiz 1:");
            quiz1 = quiz.nextInt();

            System.out.println("Enter your score for quiz 2:");
            quiz2 = quiz.nextInt();

            System.out.println("Enter your score for quiz 3:");
            quiz3 = quiz.nextInt();

            System.out.println("Enter your score for quiz 4:");
            quiz4 = quiz.nextInt();

            System.out.println("Enter your score for quiz 5:");
            quiz5 = quiz.nextInt();

            System.out.println("Enter your score for quiz 6:");
            quiz6 = quiz.nextInt();

            System.out.println("Enter your score for quiz 7:");
            quiz7 = quiz.nextInt();

            System.out.println("Enter your score for quiz 8:");
            quiz8 = quiz.nextInt();

            System.out.println("Enter your score for quiz 9:");
            quiz9 = quiz.nextInt();

            System.out.println("Enter your score for quiz 10:");
            quiz10 = quiz.nextInt();

            System.out.println("Enter your score for quiz 11:");
            quiz11 = quiz.nextInt();


            Scanner project = new Scanner(System.in);
            System.out.println("Enter your score for project 1:");
            project1 = project.nextInt();

            System.out.println("Enter your score for project 2:");
            project2 = project.nextInt();

            System.out.println("Enter your score for project 3:");
            project3 = project.nextInt();


            assignmentSum = assignment1 + assignment2 + assignment3 + assignment4 + assignment5 + assignment6;
            assignmentAverage = assignmentSum / 6;

            projectSum = project1 + project2 + project3;
            projectAverage = projectSum / 3;

            quizSum = quiz1 + quiz2 + quiz3 + quiz4 + quiz5 + quiz6 + quiz7 + quiz8 + quiz9 + quiz10 + quiz11;
            quizAverage = quizSum / 11;

            assFinalGradePercentage = (assignmentSum / 6) * 0.4;
            proFinalGradePercentage = (projectSum / 3) * 0.4;
            quiFinalGradePercentage = (quizSum / 11) * 0.2;

            totalScore = (quiFinalGradePercentage + proFinalGradePercentage + assFinalGradePercentage);


            System.out.println("Assignment Average is:" + assignmentAverage);
            System.out.println("Quiz Average is:" + quizAverage);
            System.out.println("Project Average is:" + projectAverage);
            System.out.println("Total Score is:" + totalScore);

            if (totalScore < 59) {
                System.out.println("Your final grade is F");
            } else if (totalScore < 70) {
                System.out.println("Your final grade is D");
            } else if (totalScore < 80) {
                System.out.println("Your final grade is C");
            } else if (totalScore < 90) {
                System.out.println("Your final grade is B");
            } else if (totalScore <= 100) {
                System.out.println("Your final grade is A");
            } else {
                System.out.println("That's an invalid grade!!!");
            }
        }catch (InputMismatchException e) {
            System.out.println("INVALID ENTRY!!! - Run it again");

        }


    }

}


