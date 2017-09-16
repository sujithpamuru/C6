import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	/**
	 * student id
	 */

	 Student[] test = new Student[7];
09
        for(int i=0; i<7;i++)
10
        {
11
            Scanner kb = new Scanner(System.in);
12
            System.out.println("What is the Students name?: ");
13
            test[i].setName(kb.nextLine());
14
            System.out.println("What is the Students ID number?: ");
15
            test[i].setIdnum(kb.nextLine());

	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
 System.out.println("Please enter a Firstname , MiddleName & Lastname separated by spaces");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        String[] arr = name.split(" ",3);
        System.out.println(arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	 long val = 1346524199000l;
        Date date=new Date(val);
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");
        String dateText = df2.format(date);
        System.out.println(dateText);
		
		/**
	 * student average mark
	  */

	 int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);






	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}

