
   

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter StudentNumber: ");
        int StudentNumber = input.nextInt();

        if(StudentNumber <= 0) {
            System.out.print("Enter a valid StudentNumber: ");
            StudentNumber = input.nextInt();
        }
        System.out.print("Enter SubjectNumber: ");
        int SubjectNumber = input.nextInt();

        if(SubjectNumber <= 0) {
            System.out.print("Enter a valid SubjectNumber: ");
           SubjectNumber = input.nextInt();
        }
        int[][] scores = new int[StudentNumber][SubjectNumber];
       
        for (int student = 0; student <StudentNumber; student++) {
            System.out.println("Student " + (student + 1));
        for (int subject = 0; subject < SubjectNumber; subject++) {
              System.out.print("Enter score for subject " + (subject + 1) + " ");                        
            int score = input.nextInt();
            
        if (score < 0 && score > 100) {
            System.out.println("Invalid score!");
            System.out.print("Enter a score between 0 and 100: ");
            score = input.nextInt();
            }
            scores[student][subject] = score;
            
        }  
    
      }   
    }
  }


    

