
public class main 
{
public static void main (String[]args)
{
	
	
	
	dice newdice = new dice();
	int Throws=10;
	
	
	for(int i=0 ; i<Throws ; i++)
		newdice.Throw();
	
	System.out.print("History for dice: ");
	newdice.historyprinted();
	System.out.println();
	
	int cardnumber = 2;
	
	card newcard = new card(cardnumber);
	newcard.deal();
	newcard.deal();
	System.out.print("History for" + cardnumber + "Cards: ");
	newcard.historyprinted();
	
}
}
