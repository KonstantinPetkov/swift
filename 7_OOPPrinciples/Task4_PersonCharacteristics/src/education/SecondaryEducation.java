package Task4_PersonCharacteristics;

import java.time.LocalDate;

public class SecondaryEducation extends GradedEducation {
    
    public SecondaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public String getDegree() {
        return "Secondary";
    }
}
