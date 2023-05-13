import school.*;
import school.Course.*;

import school.*;
import courses.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args){
		launch(args);
//		Teacher phil = new Teacher("Phil");
//		Teacher bill = new Teacher("Bill");
//		Teacher lil = new Teacher("Lil");
//		Teacher joe = new Teacher("Joe");
// 		
//		Course[]courses={
//			new NetworkCourse(15,phil),
//			new SwingCourse(20,bill),
//			new APIDesignCourse(30,lil),
//			new PerformanceCourse(5,joe)
//		};
//		Register register = new Register(courses);
//                
//                
//		Student James = new Student("James");
//                Student Jill2 = new Student("Jill2");
//                Student Paul = new Student("Paul");
//                Student Hannah = new Student("Hannah");
//                Student Lewis = new Student("Lewis");
//                Student Simon = new Student("Phil");
//                
//                
//                James.setPreferredCourses(PerformanceCourse.class, SwingCourse.class);
//                Jill2.setPreferredCourses(PerformanceCourse.class, NetworkCourse.class);
//                Paul.setPreferredCourses(NetworkCourse.class, APIDesignCourse.class);
//                Hannah.setPreferredCourses(APIDesignCourse.class, NetworkCourse.class);
//                Lewis.setPreferredCourses(SwingCourse.class, APIDesignCourse.class);
//                Simon.setPreferredCourses(APIDesignCourse.class, NetworkCourse.class);
//                register.register(James, Jill2, Paul, Hannah, Lewis, Simon);
//		
//                /*
//		 * Below is where we test by printing things out
//		 */
//		test(register);
	}
	
	static void test(Register register){
		/*
		 * Print all the students in the school, all the courses in school, and which course each student has
		 */
		System.out.println("Students and their courses:");
		for(Student student : register.getStudents()) {
			if(student!=null) {
				String message = student.getName()+ " is taking";//message will reset for each new student, since we do = and not +=
				
				for(Course course : student.getCourses())
					
                                 try  
        {  
        message+="-" +course.getName(); 
        System.out.println(message);
        }  
            // handling the exception by using Exception class      
        catch(Exception e)  
        {  
             
        } 
				
			}
		}
		
		System.out.println("\nCourses and their students:");
                System.out.println();
		for(Course course : register.getCourses()) {
                    
			String message = course.getName()+" is taken by";
			
			for(Student student : course.getStudents()) {
                             try  
        {  
        message += " - " + student.getName();  
        System.out.println(message);
        }  
            // handling the exception by using Exception class      
        catch(Exception e)  
        {  
             
        } 
				
			}
			
		}
	}

    
}












