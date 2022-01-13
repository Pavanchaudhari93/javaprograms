package interviewpeograms;

public class BlankSpace {
	
	public static void main(String[] args)
	{
		String str = "	 Geeks	 for Geeks	 ";
	
		// Call the replaceAll() method
		str = str.replaceAll("\\s", "");
	
		System.out.println(str);
		
		char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }
        }
        System.out.println(stringBuffer);
	}
}

