package PatientDetails;

import java.time.LocalDate;

public class BP {

    private int sys;
    private int dia;

    private LocalDate examDate;
    private String term;

    public BP(int sys, int dia, LocalDate examDate, String term){
        this.sys = sys;
        this.dia = dia;
        this.examDate = examDate;
        this.term = term;
    }

    public int getDia() {
        return dia;
    }

    public int getSys() {
        return sys;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public String getTerm() {
        return term;
    }
}
