package ca.sheridancollege.project.BlackJackClass;

/**
 *
 * @author jbias
 */
public class BJPlayer extends Player{
    private int sum;
    BJPlayer(String name){
        id=name;
	Hand ch = new Hand();
    }
    public int getSum(){
        return sum;
    }
    public void getCard(){
        int value=Hand.getCard();
        sum+=value;
    }
}
