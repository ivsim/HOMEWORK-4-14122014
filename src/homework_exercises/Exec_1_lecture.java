package homework_exercises;

public class Exec_1_lecture {

	public static void main(String[] args) {

		Person person1 = new Person ("John Travolta", 21, "j_trav@gmail.com");
		Person person2 = new Person ("Michael Douglas", 37, "m_doug@yahoo.com");
		Person person3 = new Person ("Merilyn Monroe", 34, "mm@abv.bg");
		
		person1.output();
		System.out.println();
		person3.output();
		System.out.println();
		person2.output();
		System.out.println();
		
	}

}
