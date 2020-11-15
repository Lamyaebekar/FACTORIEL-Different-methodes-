public class Factoriel51
{ 

public static void main (String args[])
{ 

	int N; 
	Factoriel52 Fact=new Factoriel52();

	N=Integer.parseInt(args[0]); //On convertit String to int gràce à la méthode parseInt
	System.out.println ("Factoriel de "+N+" est : "+Fact.fact(N)) ;
}

}

class Factoriel52{
	
	int fact(int n)
{
	int F=1;
	for(int i=2;i<=n;i++) F*=i;
	return F;
}

	
}
