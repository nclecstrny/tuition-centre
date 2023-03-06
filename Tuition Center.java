/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        Tutor tutor1 = new Tutor("Marshall", "000203-01-2345", "1, Jalan Bunga, Sungai Buloh", "Bachelor of Computer Science", 5, new Date());
        Tutor tutor2 = new Tutor("Alpha", "010101-01-3456", "29, Jalan Impian, Sungai Buloh", "Master of Applied Chemistry", 3, new Date());
        
        TuitionCenter center1 = new TuitionCenter("123, Jalan Tulip", "Mr. Hayden");
        center1.addTutor(tutor1);
        
        TuitionCenter center2 = new TuitionCenter("32, Jalan Mawar", "Mr. Aryan");
        center2.addTeacher(tutor2);
	
	    Student student1 = new Student("Sarah", "030303-03-0306", "Jalan Bintang, Petaling Jaya", "SMK BB", new score());
	    Student student2 = new Student("Zareef", "030201-03-0305", "Jalan Bulan, Petaling Jaya", "SMK BRP", new score());
	    
	    Bactch B22 = new Batch();
	    B22.batchname= "Batch 22";
	    B22.addstudents(Sarah);
	    
	    Batch B23 = new Batch();
	    B23.batchname= "Batch 23";
	    B23.addstudents(Zareef);
}
    System.out.println("Report");
