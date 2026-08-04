import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		    int x=sc.nextInt();
		    sc.nextLine();
		    String str=sc.nextLine();
		    int carlsen=0,chef=0;
		    for(char c: str.toCharArray()) {
		        if(c=='C') carlsen+=2;
		        else if(c=='N') chef+=2;
		        else {
		            carlsen++;
		            chef++;
		        }
		    }
		    if(carlsen>chef) System.out.println(60*x);
		    else if(chef>carlsen) System.out.println(40*x);
		    else System.out.println(x*55);
		}

	}
}
