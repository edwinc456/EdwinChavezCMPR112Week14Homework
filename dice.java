
public class dice implements numhistory

{
private final int historynumber=10;
private int []history = new int [historynumber];
private int myvalue;

public dice()
{
	myvalue=0;
	for(int i =0;i<historynumber;i++)
		history[i]=0;
}

public void Throw()
{
	myvalue= randomnumber();
	thehistory();
}
@Override
public int randomnumber()
{
	int dicesides=(1+(int)Math.random()*6);
	return dicesides;	
}
@Override
public void thehistory()
{
	for(int i =0;i<historynumber;i++)
	{
		if(history[i]==0)
			break;
		System.out.print(history[i] + " ");
	}
	System.out.println();
	
}

public void historyprinted()
{
	for(int i  = 0;i<historynumber;i++)
	{
		if (history[i]==0)
			break;
		System.out.print(history [i] + " ");
	}
}
}
