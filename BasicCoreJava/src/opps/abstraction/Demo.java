package opps.abstraction;

public class Demo {

	public static void main(String[] args) 
	{
		ExcelApplication obj=new Sprint3();
		
		
		//Here we can not come to know that where actual implementation is done
		//This is known as abstraction. i.e. we have achieved abstraction here.
		obj.spreadsheet();
		obj.save();
		obj.delete();
		obj.update();
		obj.formating();
		obj.filter();

	}

}
