package appDomain;

import manager.SortManager;
import shape.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Scanner;
import utilities.Debug;import utilities.Debug;

public class AppDriver
{
	private static int base;
	private static int power;
	private static int debugLevel;
	

	// refer to demo001 BasicFileIO.java for a simple example on how to
			// read data from a text file
	public static void main( String[] args ) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		// TODO Auto-generated method stub
		SortManager sm = new SortManager(args);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);


		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests
		long start, stop;
		new AppDriver ().parseArgs(args);
		
		
	

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		System.out.println("Sort by Height (descending):");
		Collections.sort(sm, Collections.reverseOrder());
     	for (Shape s : sm) {
		    System.out.println("\t" + s.getHeight());
		}
		
	
		
		}
		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String
	

	public static void BubbleSort(Shape [] s){
		int n = s.length;
		for (int i = 0; i < n ; i++) {
			for (int j = 1; j< n -i; j++) {
				if(s[j-1] > s[j]) {
					Shape temp = s[j];
					s[j] = s[j-1];
					s[j-1] = temp;
					
				}
			}
		}
		System.out.println("\nSorted Array in ascending order");
		for (int i =0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}
	

	private void parseArgs(String[] args)
	{
		// TODO Auto-generated method stub
		
	}

}
