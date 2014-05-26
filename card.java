
public class card implements numhistory
{
	private int [] history;
	private int mycards;
	private int currentcards;
	
public card(int cards)
{
	currentcards=0;
	if(cards>0 && cards<4)
	{
		mycards=cards;
		history = new int[mycards];
	}
	else
	{
		mycards = 0;
		history = new int[0];
	}
	for(int i=0; i<mycards;i++ )
		history[i]=0;
}

public void deal()
{
	int total=0;
	for(int i=0; i<mycards;i++)
		total+=randomnumber();
	mycards=total;
	thehistory();
}
@Override
public int randomnumber()
{
	int cardnumber = (1+(int)Math.random()*10);
	return cardnumber;
}

@Override
public void thehistory()
{
	for(int i =0; i<mycards; i++)
	{
		if(history[i] ==0)
		{
			history[i]=mycards;
			break;
		}
	}
}

public void historyprinted()
{
for(int i =0;i<mycards;i++)
{
	if(history[i]==0)
		break;
	System.out.print(history[i] + " ");
}
System.out.println();
}
}
