package nl.codegorilla.CodeGorilla.exercises.dag4.exercise1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private int studentId;
    private String achternaam;
    private String tussenvoegsel;
    private String initialen;
    private String voornaam;

    private String postcode;
    private int huisnummer;

    private List<String> vakken;
    private Map<String, Double> resultaten;

    public Student() {

    }

    public Student(int studentId, String achternaam, String tussenvoegsel, String initialen,
                   String voornaam, String postcode, int huisnummer, List<String> vakken,
                   Map<String, Double> resultaten) {
        this.studentId = studentId;
        this.achternaam = achternaam;
        this.tussenvoegsel = tussenvoegsel;
        this.initialen = initialen;
        this.voornaam = voornaam;
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        this.vakken = vakken;
        this.resultaten = resultaten;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getInitialen() {
        return initialen;
    }

    public void setInitialen(String initialen) {
        this.initialen = initialen;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public List<String> getVakken() {
        return vakken;
    }

    public void setVakken(List<String> vakken) {
        this.vakken = vakken;
    }

    public Map<String, Double> getResultaten() {
        return resultaten;
    }

    public void setResultaten(Map<String, Double> resultaten) {
        this.resultaten = resultaten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() && getHuisnummer() == student.getHuisnummer() && getAchternaam().equals(student.getAchternaam()) && Objects.equals(getTussenvoegsel(), student.getTussenvoegsel()) && getInitialen().equals(student.getInitialen()) && getVoornaam().equals(student.getVoornaam()) && getPostcode().equals(student.getPostcode()) && Objects.equals(getVakken(), student.getVakken()) && Objects.equals(getResultaten(), student.getResultaten());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getAchternaam(), getTussenvoegsel(), getInitialen(), getVoornaam(), getPostcode(), getHuisnummer(), getVakken(), getResultaten());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", achternaam='" + achternaam + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", initialen='" + initialen + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", postcode='" + postcode + '\'' +
                ", huisnummer=" + huisnummer +
                ", vakken=" + vakken +
                ", resultaten=" + resultaten +
                '}';
    }
}
