package ex16_05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface StringAnnotation{
	String value();
}

public class AnnotationClass {

	@StringAnnotation("Field")
	public int anno, ta, tion;

	@StringAnnotation("Field")
	private String cl, as , s;

	@StringAnnotation("Constructor")
	public AnnotationClass() {}

	@StringAnnotation("Method")
	public void function(@StringAnnotation("Argument") int param) {
		@StringAnnotation("Local Variable")
		int local = 0;
		System.out.println(local);
	}
}
