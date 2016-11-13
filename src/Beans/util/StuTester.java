package Beans.util;

import Beans.Dao.Student;
import Beans.Dto.StudentDto;

public class StuTester {
	
	public static void main(String[] args) {
	
		StudentDto st = new StudentDto();
		//st.setId(13);
		st.setName("shivu");
		st.setEmil("shivu@dbd.com");
		st.setMarks(33);

		Student st1 = new Student();
		st1.save(st);
	}

}
