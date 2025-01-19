package week7.day1;

class Sample {
    public static void main(String[] args) {
        String name="apple";
        char[]str=name.toCharArray();
        for(int i=0;i<str.length;i++) {
        	for(int j=i+1;j<str.length;j++) {
        		if(str[i]==str[j]) {
        			System.out.println(str[i]);
        			break;
        		}
        	}
        }
        
        }
    }
