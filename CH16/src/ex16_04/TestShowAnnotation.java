package ex16_04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShowAnnotation {

	@Test
	public void testShowAnnotation() {
		ShowAnnotation test = new ShowAnnotation();
		test.showAnnotation(ex16_04.AnnotationClass.class);
	}

}
