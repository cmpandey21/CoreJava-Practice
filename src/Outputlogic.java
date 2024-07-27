import java.util.ArrayList;

public class Outputlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
		list.add(String.valueOf(i));
			
		}
		for(int i=8;i<15;i++)
		{
			list.add(String.valueOf(i));
		}
		
		for(int i=0;i<5;i++)
		{
			list.add(String.valueOf(i));
		}
		
		System.out.println(list);
	}

}
