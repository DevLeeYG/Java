package privated;

class Coin{
	private int value; //속성 변
	private int count;
	
	Coin(){}
	Coin(int value, int count){
		this.value = value;
		this.count = count;
		
	}
	
	int getValue() {return value;}
	int getCount() {return count;}
	
	void setValue(int value) {
		this.value = value;
	}
	
	void setCount(int count) {
		this.count = count;
	}
	
}

class Purse{
	private String owner;
	private Coin coin[]; //동전 클래스가 지갑클래스에 들어왔네?
	
	Purse(){}
	Purse(String owner, Coin coin[]){
		this.owner = owner;
		this.coin = coin; //코인은 밸류와 카운트로 구분되어있다.
	}
	
	String getOwner() {
		return owner;
	}
	
	Coin[] getCoin() {
		return coin;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	void setCoin(Coin[] coin) {
		this.coin = coin;
	}
	
	
	
}


public class Code127 {
	
	public static void main(String[] args) {
		Coin coin1 = new Coin(500,4); //500원과 카운트 4 그럼 2000원
	    Coin coin2 = new Coin(100,3); //100원 3개 300원
	    Coin coin3 = new Coin(50,6); // 50원 6개 300원
	    Coin coin4 = new Coin(10,7); // 70원
	    
	   Coin coin[] = {coin1, coin2, coin3, coin4}; //코인배열에 객체로4
	   
	   Purse purse = new Purse("Alice", coin);
	   
	   System.out.println(purse.getOwner()+"지갑의 각 동전 갯수");
	   
	   
	   for(int i = 0 ; i<coin.length ; i++){
		  System.out.println(coin[i].getValue()+":" + coin[i].getCount());
	   }
	  
	   	int total = 0;
	   	
	 
	   
	   
	   	
	   		for(int i = 0 ; i<coin.length ; i++) {
	   			total += coin[i].getValue() * coin[i].getCount();
	   			
	}
	   		System.out.println(purse.getOwner() +total);
	   
	
	}
}
