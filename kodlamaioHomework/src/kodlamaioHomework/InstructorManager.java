package kodlamaioHomework;

public class InstructorManager extends UserManager {
	public void givenTrainingsNumber (Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli e�itmenin verdi�i e�itim say�s� = " + instructor.numberOfTrainingsGiven);
	}
}