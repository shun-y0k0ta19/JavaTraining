package ex16_04;

import java.lang.annotation.Annotation;

public class ShowAnnotation {
	
	public void showAnnotation(Class<?> cls){
		Annotation[] annotations = cls.getAnnotations();
		for(Annotation annotation : annotations){
			System.out.println(annotation);
		}
	}
	
}
