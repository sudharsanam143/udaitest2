package week3.day1;

public class Palin {

	public static void main(String[] args) {
		String str = "madam";
		
		if(Palin.reverse(str))
		{
			System.out.println("gievn is palidrome");
		}
		else
		{
			System.out.println("Given is not a plaindrome");
		}

}
	static boolean reverse(String str)
	{
          String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		if(rev.equals(str)) {
			return true;
		}
		return false;
	}
	
	}

// attribute based xpath

//  //tagName[@attribute = 'value']

//text based xpath

//tagname[text()='value']


//index based xpath

//(tagname[@attribut='value'])[1]


//    PartialAttributeBased
//    //tagname[contains(@attribute,'partialAttributeValue')]


// PartialTextBased+3

//    //tagname[contains(text(),'partialTextValue')]