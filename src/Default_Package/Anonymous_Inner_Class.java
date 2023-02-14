package Default_Package;


interface InterfaceClassI{
	void disPlayI();
	void disPlayII();
}

class ImplCls{
	InterfaceClassI ic = new InterfaceClassI(){
		@Override
		public void disPlayI(){
			System.out.println("Hello I'm 1st method...");
		}
		
		@Override
		public void disPlayII(){
			System.out.println("Hello, I'm 2nd method...");
		}
	};
}

public class Anonymous_Inner_Class {

	public static void main(String[] args) {
		ImplCls ics = new ImplCls();
		ics.ic.disPlayI();
		ics.ic.disPlayII();

	}

}
