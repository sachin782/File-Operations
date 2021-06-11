import java.io.*;
class Student implements Serializable {
    public String nm,rn;
    public int marks;
    public double cgpa;
    @Override
    public String toString()
    {
	return "Name = " + this.nm + "\nRoll no = " + this.rn + "\nMarks = " + this.marks +"\nCGPA = " + this.cgpa + "\n";
    }
}
