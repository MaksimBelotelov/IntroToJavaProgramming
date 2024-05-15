package org.example.ch8;
/*
(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
students in increasing order of the number of correct answers.
 */
public class Ex8_3 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correctAnswers = new int[answers.length];
        int[] indexes = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            indexes[i] = i;
            correctAnswers[i] = correctCount;
        }

        sort(indexes, correctAnswers);

        for (int i = 0; i < indexes.length; i++) {
            System.out.println("Student " + indexes[i] + " grade: " + correctAnswers[i]);
        }
    }

    public static void sort(int[] indexes, int[] answers) {
        for(int i = 0; i < answers.length; i++) {
            int min = answers[i];
            int indexMin = i;
            for (int j = i + 1; j < answers.length; j++) {
                if (answers[j] < answers[indexMin]) {
                    min = answers[j];
                    indexMin = j;
                }
            }
            answers[indexMin] = answers[i];
            answers[i] = min;
            int temp = indexes[i];
            indexes[i] = indexes[indexMin];
            indexes[indexMin] = temp;
        }
    }
}