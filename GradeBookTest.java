
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;


public class GradeBookTest {
	GradeBook gradeBookOne;
	GradeBook gradeBookTwo;

	@Before
	public void setUp() throws Exception {
		gradeBookOne = new GradeBook(5);
		gradeBookTwo = new GradeBook(5);
		gradeBookOne.addScore(44.55);
		gradeBookOne.addScore(66.77);
		gradeBookOne.addScore(88.99);
		gradeBookTwo.addScore(45.45);
		gradeBookTwo.addScore(67.67);	
	}

	@After
	public void tearDown() throws Exception {
		gradeBookOne = null;
		gradeBookTwo = null;
	}


	
	@Test
	public void testAddScore() {
		assertEquals(gradeBookOne.toString(),"44.55 66.77 88.99 ");
		assertEquals(gradeBookTwo.toString(),"45.45 67.67 ");
		assertEquals(gradeBookOne.getScoreSize(),3);
		assertEquals(gradeBookTwo.getScoreSize(),2);
	}
	
	
	@Test
	public void testSum() {
		assertEquals(gradeBookOne.sum(),200.31);
		assertEquals(gradeBookTwo.sum(),113.12);
	}
	
	@Test
	public void testMinumum() {
		assertEquals(gradeBookOne.minimum(),44.55);
		assertEquals(gradeBookTwo.minimum(),45.45);
	}
	
	@Test
	public void testFinalScore() {
		assertEquals(gradeBookOne.finalScore(),155.76);
		assertEquals(gradeBookTwo.finalScore(),67.67);
	}
	
}
