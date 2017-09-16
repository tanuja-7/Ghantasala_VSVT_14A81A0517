import java.util.Date;
import java.lang.IllegalArgumentException;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException(" ");
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 ||(index>=students.length))	
			throw new IllegalArgumentException(" ");
		else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || students.length<=index)
			throw new IllegalArgumentException(" ");
		else
			students[index]=student;
			
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException(" ");
		else
			students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException(" ");
		else
			students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		if(student==null || index<0 || students.length<=index)
			throw new IllegalArgumentException(" ");
		else
			students[index]=student;
	}

	@Override
	public void remove(int index) {
		if(index<0 || students.length<=index)
			throw new IllegalArgumentException(" ");
		else
			students[index]=null;
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException(" ");
		else
		{
			int i;
			for(i=0;i<students.length;i++)
				if(student.equals(students[i]))
				{
					students[i]=null;
				}
			if(i==students.length)
				throw new IllegalArgumentException("Student not exist");		
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || students.length<=index)
			throw new IllegalArgumentException(" ");
		else
		{
			for(int i=index+1;i<students.length;i++)
				students[i]=null;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException(" ");
		else
		{
			int i;
			for(i=0;i<students.length;i++)
			{
				if(students[i].equals(student))
					break;
			}
			for(i++;i<students.length;i++)
				students[i]=null;
			
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || students.length<=index)
			throw new IllegalArgumentException(" ");
		else
		{
			for(int i=0;i<index;i++)
				students[i]=null;
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException(" ");
		else
		{
			int i;
			for(i=0;i<students.length;i++)
			{
				if(students[i].equals(student))
					break;
			}
			for(int j=0;j<i;j++)
				students[j]=null;
			
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
			for(int j=0;j<(students.length-i-1);j++)
				if(students[j].compareTo(students[j+1])>0)
				{
					Student stud=students[j];
					students[j]=students[j+1];
					students[j+1]=stud;
				}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException(" ");
		else
		{
			Student[] stud=new Student[students.length];
			int j=0;
			for(int i=0;i<students.length;i++)
				if(date.compareTo(students[i].getBirthDate())==0)
					stud[j++]=students[i];
			return stud;				
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null || lastDate==null)
			throw new IllegalArgumentException(" ");
		else
		{
			
			Student[] stud=new Student[students.length];
			for(int i=0;i<students.length;i++)
			{	int j=0;
				Date date=students[i].getBirthDate();
				if(date.after(firstDate) && date.before(lastDate))
					stud[j++]=students[i];
				else if((date.compareTo(firstDate)==0) || (date.compareTo(lastDate)==0))
					stud[j++]=students[i];	
			}
			return stud;
		}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
