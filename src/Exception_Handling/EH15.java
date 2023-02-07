package Exception_Handling;


class Alphite{
	
	public void metAlphhite(){
		
		System.out.println("Connetion is established...");
		try{
			System.out.println("Statement-I");
			System.out.println("Inside Outer try-block...");
			System.out.println("Statement-III");
			
			try {
				System.out.println("Inside Inner try-block...");
				
			}catch(Exception e){
				System.out.println("Inside Inner catch-block...");
			}
			finally {
				System.out.println("Inside Inner finally block...");
			}
			System.out.println("Outside Inner try-catch & finally block...");
			
		}catch(Exception e){
			try {
				System.out.println("Inside Inner catch's try-block...");
				
			}catch(Exception ee){
				System.out.println("Inside Inner catch's catch-block...");
			}
			finally {
				System.out.println("Inside Inner catch's finally block...");
			}
			System.out.println("Outside Inner catch's try-catch & finally block...");
		}
		finally{
			
			try {
				System.out.println("Inside Inner finally's try-block...");
				
			}catch(Exception ee){
				System.out.println("Inside Inner finally's catch-block...");
			}
			finally {
				System.out.println("Inside Inner finally's finally block...");
			}
			System.out.println("Outside Inner finally's try-catch & finally block...");
			
		}
		
		System.out.println("Excecution wents normally...");
		
	}
	
}

public class EH15 {

	public static void main(String[] args) {
		Alphite alp = new Alphite();
		alp.metAlphhite();

	}

}
