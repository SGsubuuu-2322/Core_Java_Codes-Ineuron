package HAS_A_Relationship.One_To_One.bean;

public class Engines {

	private float cC;
	private float hP;
	private int sT;
	private float mS;
	
	
	public Engines(float cC, float hP, int sT, float mS){
		this.cC = cC;
		this.hP = hP;
		this.sT = sT;
		this.mS = mS;
	}


	public float getcC() {
		return cC;
	}


	public float gethP() {
		return hP;
	}


	public int getsT() {
		return sT;
	}


	public float getmS() {
		return mS;
	}
	
	
	
}
