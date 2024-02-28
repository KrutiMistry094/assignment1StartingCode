package manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import shape.Shape;

public class SortManager
{
	//attributes
	private Shape [] shapes;
	private String fileName;
	private char compareType;
	private char sortType;
	
	
	public SortManager(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		List<String> fileNames = Arrays.asList("shapes1.txt","shapes2.txt", "shapes3.txt");
		Shape[] shapes = loadShapes(fileNames);
		loadShapes();
	}


	

	private Shape[] loadShapes(List<String> fileNames) throws NoSuchMethodException, SecurityException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		int index = 0;
		for (String fileName : fileNames) {
			try (BufferedReader fin = new BufferedReader(new FileReader(fileName))){
				String line = fin.readLine();
				while (line != null) {
					Object o = null;
					StringTokenizer st = new StringTokenizer(line);
					String className = "shape" + st.nextToken();
					Class<?> cls = Class.forName(className);
					
					if(className.compareTo("shape.Cone" ) == 0) {
					Class<?> paramTypes[] = new Class[2];
					paramTypes[0] = double.class;
					paramTypes[1] = double.class;
					
					Constructor<?> ct = cls.getConstructor(paramTypes);
					Object argList[] = new Object[2];
					argList[0] = Double.valueOf(st.nextToken());
					argList[1] = Double.valueOf(st.nextToken());
					
					o = ct.newInstance(argList);
					
					}
					
					else if(className.compareTo("shape.Cylinder" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else if(className.compareTo("shape.OctagonalPrism" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
						
					
					else if(className.compareTo("shape.PentagonalPrism" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else if(className.compareTo("shape.Prism" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else if(className.compareTo("shape.Pyramid" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else if(className.compareTo("shape.SquarePrism" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else if(className.compareTo("shape.TriangularPrism" ) == 0)
					{
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
						
				    }
					
					else {
						Class<?> paramTypes[] = new Class[2];
						paramTypes[0] = double.class;
						paramTypes[1] = double.class;
						
						Constructor<?> ct = cls.getConstructor(paramTypes);
						Object argList[] = new Object[2];
						argList[0] = Double.valueOf(st.nextToken());
						argList[1] = Double.valueOf(st.nextToken());
						
						o = ct.newInstance(argList);
					}
					
					fileNames.add((String) o);
					line = fin.readLine();	
				}
				
				fin.close();
;
				}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch( FileNotFoundException e )
			{
				e.printStackTrace();
			}
			catch( IOException e )
			{
				e.printStackTrace();
			}
			catch( SecurityException e )
			{
				e.printStackTrace();
			}
			catch( NoSuchMethodException e )
			{
				e.printStackTrace();
			}
			catch( IllegalArgumentException e )
			{
				e.printStackTrace();
			}
			catch( InstantiationException e )
			{
				e.printStackTrace();
			}
			catch( IllegalAccessException e )
			{
				e.printStackTrace();
			}
			catch( InvocationTargetException e )
			{
				e.printStackTrace();
			}
		}
		
		return shapes;
	}




	private Shape[] loadShapes()
	{
		return shapes;
		
	}




//	private Shape[] loadShapes(List<String> fileNames)
//	{
//		
//
//		
//		
//	}
}
