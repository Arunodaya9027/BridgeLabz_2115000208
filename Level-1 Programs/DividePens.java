public class DividePens {
    public static void main(String[] args) {
        int pens = 14;      // Total pens
        int students = 3;       //Total Students
        int penPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
