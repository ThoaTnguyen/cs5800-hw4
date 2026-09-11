package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String crsNm;
    private final List<Instructor> insts = new ArrayList<>();
    private final List<Textbook> tbs = new ArrayList<>();

    public Course(String crsNm) {
        this.crsNm = crsNm;
    }

    public String getCourseName() {
        return crsNm;
    }

    public void setCourseName(String crsNm) {
        this.crsNm = crsNm;
    }

    public void addInstructor(Instructor inst) {
        insts.add(inst);
    }

    public void addTextbook(Textbook tb) {
        tbs.add(tb);
    }

    public List<Instructor> getInstructors() {
        return insts;
    }

    public List<Textbook> getTextbooks() {
        return tbs;
    }

    public void print() {
        System.out.println("Course: " + crsNm);

        for (Instructor inst : insts) {
            System.out.println("  Instructor: " + inst.getFirstName() + " "
                    + inst.getLastName() + ", Office: " + inst.getOfficeNumber());
        }

        for (Textbook tb : tbs) {
            System.out.println("  Textbook: " + tb.getTitle() + " by " + tb.getAuthor());
        }
    }
}
