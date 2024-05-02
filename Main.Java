package Test;

import java.util.Scanner;

import com.umg.dao.TestDao;





public class Test {



		public static void main(String[] args) {
			System.out.println("llena para metros: ");
			Scanner scanner = new Scanner (System.in);
			TestDao.estudiante(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
	TestDao.leerEstudiantes();
			//TestDao.actualizarEstudiante( scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
//TestDao.eliminarEstudiantes(scanner.nextInt());
		}
		

	}


  
