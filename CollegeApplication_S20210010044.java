import java.util.Arrays;

class Person {

    private String Name;
    private String AADHAR_No;
    private String Gender;
    private Date_of_Birth DOB;

    public Person(String Name, String AADHAR_No, String Gender, Date_of_Birth DOB) {
        this.Name = Name;
        this.AADHAR_No = AADHAR_No;
        this.Gender = Gender;
        this.DOB = DOB;
    }

    public Person() {

    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAADHAR_No(String AADHAR_No) {
        this.AADHAR_No = AADHAR_No;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public String getAADHAR_No() {
        return AADHAR_No;
    }

    public String getGender() {
        return Gender;
    }

    public Date_of_Birth getDOB() {
        return DOB;
    }

    public void setDOB(Date_of_Birth DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "AADHAR_No=" + AADHAR_No + ", DOB=" + DOB + ", Gender=" + Gender + ", Name=" + Name;
    }

    public int CalculateAge() {
        if (DOB.getBorn_month() <= 9 && DOB.getBorn_day() <= 22) {

            return 2022 - DOB.getBorn_year();

        }

        else
            return 2022 - DOB.getBorn_year() - 1;
    }
}

class Date_of_Birth {
    private int born_day;
    private int born_month;
    private int born_year;

    public Date_of_Birth(int born_day, int born_month, int born_year) {
        this.born_day = born_day;
        this.born_month = born_month;
        this.born_year = born_year;
    }

    public Date_of_Birth() {

    }

    public int getBorn_day() {
        return born_day;
    }

    public void setBorn_day(int born_day) {
        this.born_day = born_day;
    }

    public int getBorn_month() {
        return born_month;
    }

    public void setBorn_month(int born_month) {
        this.born_month = born_month;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    @Override
    public String toString() {
        return born_day + ":" + born_month + ":" + born_year;
    }

}

class Student extends Person {

    private String Roll_No;
    private String Institute_Name;
    private String Dept;
    private String Specialization;
    private String[] Subjects = new String[3];
    private String[] Grades = new String[3];

    public Student(String Name, String AADHAR_No, String Gender, Date_of_Birth DOB) {
        super(Name, AADHAR_No, Gender, DOB);
    }

    public Student() {
    };

    public String getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(String roll_No) {
        Roll_No = roll_No;
    }

    public String getInstitute_Name() {
        return Institute_Name;
    }

    public void setInstitute_Name(String institute_Name) {
        Institute_Name = institute_Name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String[] getSubjects() {
        return Subjects;
    }

    public void setSubjects(String[] subjects) {
        Subjects = subjects;
    }

    public String[] getGrades() {
        return Grades;
    }

    public void setGrades(String[] grades) {
        Grades = grades;
    }

    public void Admit_Student(String Name, String AADHAR_No, String Gender, Date_of_Birth Date_of_Birth,
            String Institute_Name) {
        super.setName(Name);
        super.setAADHAR_No(AADHAR_No);
        super.setGender(Gender);
        super.setDOB(Date_of_Birth);
        setInstitute_Name(Institute_Name);
    }

    public void Enroll_student(String dept, String Specialization, String[] Subjects) {
        setDept(dept);
        setSpecialization(Specialization);
        setSubjects(Subjects);
    }

    @Override
    public String toString() {
        return "Student Details:- \nName:- " + super.getName() + "\nAadhar Number:- " + super.getAADHAR_No()
                + "\nGender:- " + super.getGender() + "\nDate of Birth:- " + super.getDOB()
                + "\nAge:- " + super.CalculateAge()
                + "\nInstitute Name:- " + Institute_Name + "\nRoll Number:- " + Roll_No + "\nDept:- " + Dept
                + "\nSpecialization:- " + Specialization + "\nGrades:- " + Arrays.toString(Grades)
                + "\nSubjects:- " + Arrays.toString(Subjects) + "\n";
    }

}

class Faculty extends Person {

    private String Emp_id;
    private String Dept;
    private String Specialization;
    private int Salary;
    private String Institute_Name;

    public Faculty() {

    }

    public Faculty(String Name, String AADHAR_No, String Gender, Date_of_Birth DOB) {
        super(Name, AADHAR_No, Gender, DOB);
    }

    public String getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(String emp_id) {
        Emp_id = emp_id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getInstitute_Name() {
        return Institute_Name;
    }

    public void setInstitute_Name(String institute_Name) {
        Institute_Name = institute_Name;
    }

    public void Join_Faculty(String Name, String AADHAR_No, String Gender, Date_of_Birth DOB, String emp_id,
            String institute_Name) {
        super.setName(Name);
        super.setAADHAR_No(AADHAR_No);
        super.setGender(Gender);
        super.setDOB(DOB);
        setEmp_id(emp_id);
        setInstitute_Name(institute_Name);

    }

    public void Assign_Faculty(int salary, String specialization, String dept) {
        setDept(dept);
        setSpecialization(specialization);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Faculty Details:- \nName:- " + super.getName()
                + "\nAadhar Number:- " + super.getAADHAR_No()
                + "\nGender:- " + super.getGender()
                + "\nDate of Birth:- " + super.getDOB()
                + "\nAge:- " + super.CalculateAge()
                + "\nInstitute_Name:- " + Institute_Name
                + "\nEmployee Id:- " + Emp_id + "\nSalary:- " + Salary
                + "\nDept:- " + Dept + "\nSpecialization:- " + Specialization + "\n";
    }

}

public class CollegeApplication_S20210010044 {
    public static void main(String[] Args) {

        Date_of_Birth d1 = new Date_of_Birth(9, 6, 2004);
        Date_of_Birth d2 = new Date_of_Birth(29, 2, 2003);
        Date_of_Birth d3 = new Date_of_Birth(17, 12, 2003);
        Date_of_Birth d4 = new Date_of_Birth(22, 10, 2004);
        Date_of_Birth d5 = new Date_of_Birth(1, 1, 1989);
        Date_of_Birth d6 = new Date_of_Birth(12, 7, 1990);
        Date_of_Birth d7 = new Date_of_Birth(15, 3, 1984);

        String[] subjects = { "OOP", "RANAC", "DBMS" };
        String[] g1 = { "O", "O", "O" };
        String[] g2 = { "A", "O", "B" };
        String[] g3 = { "B", "A", "O" };
        String[] g4 = { "O", "O", "C" };

        Student[] s = new Student[4];

        Student a = new Student();
        a.Admit_Student("Abhishikth", "324634841109", "Male", d2, "IIIT Sricity");
        a.Enroll_student("CSE", "AIML", subjects);
        a.setRoll_No("S101");
        a.setGrades(g1);
        s[0] = a;

        Student b = new Student();
        b.Admit_Student("Abhi", "345261789765", "Male", d3, "IIIT Sricity");
        b.Enroll_student("CSE", "AIML", subjects);
        b.setRoll_No("S102");
        b.setGrades(g2);
        s[1] = b;

        Student c = new Student();
        c.Admit_Student("Sita", "546738292984", "Female", d4, "IIIT Sricity");
        c.Enroll_student("CSE", "AIML", subjects);
        c.setRoll_No("S103");
        c.setGrades(g3);
        s[2] = c;

        Student d = new Student();
        d.Admit_Student("Gita", "546738290876", "Female", d1, "IIIT Sricity");
        d.Enroll_student("CSE", "AIML", subjects);
        d.setRoll_No("S104");
        d.setGrades(g4);
        s[3] = d;

        for (int i = 0; i < 4; i++) {
            System.out.println(s[i].toString());
        }

        Faculty[] f = new Faculty[3];
        Faculty e = new Faculty();
        e.Join_Faculty("Shatanaa", "234556781234", "Female", d5, "F101", "IIIT SRICITY");
        e.Assign_Faculty(200000, "AIML", "CSE");
        f[0] = e;

        Faculty p = new Faculty();
        p.Join_Faculty("Mainak", "566565655656", "Male", d7, "F102", "IIIT SRICITY");
        p.Assign_Faculty(180000, "AIML", "CSE");
        f[1] = p;

        Faculty g = new Faculty();
        g.Join_Faculty("Priyambada", "784756232340", "Female", d6, "F103", "IIIT SRICITY");
        g.Assign_Faculty(160000, "AIML", "CSE");
        f[2] = g;

        for (int i = 0; i < 3; i++) {
            System.out.println(f[i].toString());
        }

    }
}
