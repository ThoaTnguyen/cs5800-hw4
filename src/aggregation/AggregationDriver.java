package aggregation;

public class AggregationDriver {
    public static void main(String[] args) {
        System.out.println("\nAGGREGATION\n");

        Course crs = new Course("CS 5800 - Advanced Software Engineering");

        Instructor inst = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook tb = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        crs.addInstructor(inst);
        crs.addTextbook(tb);
        crs.print();

        System.out.println("\nAGGREGATION - Course (Two Instructors, Two Textbooks)\n");

        Course advCrs = new Course("CS 5800 - Advanced Software Engineering");

        Instructor inst1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor inst2 = new Instructor("Josh", "Cooper", "2-1105");

        Textbook tb1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook tb2 = new Textbook("Coding for Beginner",
                "Yenshun Sun", "Harper-Collinsy");

        advCrs.addInstructor(inst1);
        advCrs.addInstructor(inst2);
        advCrs.addTextbook(tb1);
        advCrs.addTextbook(tb2);
        advCrs.print();
    }
}
