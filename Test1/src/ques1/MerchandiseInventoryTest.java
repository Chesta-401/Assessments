package ques1;
import java.io.*;
import java.util.*;

import ques1.Merchandise;
import ques1.MyComparator;



public class MerchandiseInventoryTest {

	public static void main(String[] args) {
		List<Merchandise> al = new ArrayList<>();

		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VE00YM334\\Documents\\milestone\\Test1\\src\\ques1\\input.dat"))){
		String string;
		while((string = br.readLine())!=null) {
		String[] str = string.split(" ");
		Merchandise md=new Merchandise(str[0],Integer.parseInt(str[1]) ,Double.parseDouble(str[2]));
		al.add(md);
		}
		}
		catch(FileNotFoundException e) {

		}
		catch(IOException e) {

		}
		Collections.sort(al,new SortAsPerName());
		System.out.println("sorted List arranged in ascending order of their itemCode");
		display(al);
		Collections.sort(al,new MyComparator());
		System.out.println("Sorted list of the merchandise in decreasing order of their price");
		display(al);



		}



		private static void display(List<Merchandise> al) {
		Iterator<Merchandise> itr = al.iterator();
		while(itr.hasNext()) {
		Merchandise m = (Merchandise)itr.next();
		System.out.println("[ "+ m.getItemCode()+", "+m.getQuantity()+", "+m.getUnitPrice()+" ]");
		}

		}



		

	}


