package kodlamaioHomework;

public class StudentManager extends UserManager {
	public void givenIncludedNumber (Student student) {
		System.out.println(student.firstName + " " + student.lastName + " isimli ��rencinin dahil oldu�u e�itim say�s� = " + student.numberOfTrainingsIncluded);
	}
}