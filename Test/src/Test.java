import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class A 
{
	public  A() throws IOException
	{
		try
		{
			System.out.println("try");
			throw new IOException();
		}
		catch (IOException e)
		{
			System.out.println("catch");
			
		}
		
	}
}
public class Test {

    public static void main(String[] args) {

       try {
		new A();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

}