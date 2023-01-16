package HAS_A_Relationship.One_To_One.main;

import HAS_A_Relationship.One_To_One.bean.*;

public class Test_2 {

	public static void main(String[] args) {
		Engines engines = new Engines(1999, 1500, 6, 250);
		Models models = new Models("RollsRoyce", "Phantom-vIII", "Merdona-Purple", 120090000);
		models.setEngine(engines);
		models.showDetails();

	}

}
