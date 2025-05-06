public class StudentPerformanceCounter {
    double meanScore;

    public static void main(String[] args) {
        Student alex = new Student();
        Student clover = new Student();
        Student samantha = new Student();

        alex.name = "Alex";
        alex.familyName = "Vasquez";
        alex.mathGrade = 45.9;
        alex.geographyGrade = 62.7;

        clover.name = "Clover";
        clover.familyName = "Ewing";
        clover.mathGrade = 32.2;
        clover.geographyGrade = 85.1;

        samantha.name = "Samantha";
        samantha.familyName = "Simpson";
        samantha.mathGrade = 95.4;
        samantha.geographyGrade = 98.8;

        StudentPerformanceCounter scoreMathMethod = new StudentPerformanceCounter();
        scoreMathMethod.meanScoreForMath(alex.mathGrade, clover.mathGrade, samantha.mathGrade);

    }

    void meanScoreForMath(double score1, double score2, double score3) {
        double averageMath;
        averageMath = (score1 + score2 + score3) / 3;
        meanScore = averageMath;
    }
    void printMeanScoreForMath() {
        System.out.println("Het gemiddle is " + meanScore);
    }
}
