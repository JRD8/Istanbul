// Modeling Istabul
public class Place{

	//Members
	public String name;

	public int indexNumber; // value between 0-15
	public int shortNumber; // value between 0-15
	public int longNumber; // value between 0-15
	public int availableRubies; // value >= 0
	
	public Array visitingMerchants; // String Array of "B", "Y", etc.
	public Array visitingAssistants; // String Array of "B", "Y", etc.
	
	public boolean governorIsPresent;
	public boolean smugglerIsPresent;
}

public class Player{
	
	// Members
	private int playerIndex; // value between 0-4
	private String name;
	private String color; // B, Y, G, R, W
	
	private int currentLira; // value >= 0
	private int currentRubies; // value >= 0
	private int numberOfAssistants; // value between 4-5
	private int numberOfExtensions; // value between 0-3
	private Array playerBonusCards;
	
	private int currentMerchantLocation; // value between 0-15
	private Array currentAssistantLocations; // an array of 4-5 integers, each between 0-15
	private int familyMemberLocation; // value between 0-15

	private int maxBlue; // value between 2-5
	private int currentBlue; // value between 0-max
	private int maxYellow; // value between 2-5
	private int currentYellow; // value between 0-max
	private int maxGreen; // value between 2-5
	private int currentGreen; // value between 0-max
	private int maxRed; // value between 2-5
	private int currentRed; // value between 0-max

	// Methods
	public void payLiraToBank(int amount){};
	public void payLiraToPlayer(Player receivingPlayer, int amount){};
	public void receiveLiraFromBank(int amount){};

	public void payGoodToBank(String good){};
	public void payGoodToPlayer(Player recevingPlayer, String good){};
	public void receiveGoodFromBank(String good){};

	public boolean move(Place targetIndex) {
		// Breakup movement into 2 individual checks/loops
		// 1st Move
		// prompt targetIndex
		// Determine current row/column from currentIndex
		// Determine target row/column from targetIndex
		// Is target +- 1 unit in same row?  Use division by 4.
		// Is target +1 1 unit in same column?  Use modulo by 4.
		// If not, reprompt
		// If so, move piece
		// Check if Move 1 or 2
		// If Move 2, end
		// If Move 1, prompt to move again?
		// If yes, return to 1st Move and target next tile
		// If no, end.
	};

	public void pickupAssistant(Place place){};
	public void dropoffAssistant(Place place){};

	public int rollDice(){}; // Returns value of 2D6
	
	public int drawBonusCard(){}; // Returns index value of drawn bonus card
	public void discardBonusCard(){};

	public boolean checkSmugglerEncounter(Place place){};
	public boolean checkGovernorEncounter(Place place){};
	public boolean checkMerchantEncounter(Place place){};

	public void resolvePlaceAction(Place place);

}


public class Game{

	// Members
	private int numOfPlayers; // value from 1-5
	private int typeOfSetup; // 0 = regular, 1 = short, 2 = long, 3 = random

	private int governorLocation; // index value from 0-15
	private int smugglerLocation; // index value from 0-15
	private Array familyMemberLocations; // array with numOfPlayers elements, int between 0-15
	private Array merchantLocations; // 5 element array including neutral merchants

	private Array boardMatrix; // 4x4 = 16 element array of place indexes
	// can calculate RowIndex by x / 4
	// can calculate ColumnIndex by x % 4
	
	private Array drawPile; // array of current index of bonus cards
	private Array discardPile; // array of current index of bonus cards
	// "currentPlayerTurn": // how to model?

	// Methods
	public void setupInitialBoard(){};
	public void shuffleBonusCards(){};
	public boolean checkVictory(){};
}

// Methods
public void greatMosqueAction(){};
public void smallMosqueAction(){};
public void postOfficeAction(){};
public void fountainAction(){};
public void greatMarketAction(){};
public void smallMarketAction(){};
public void blackMarketAction(){};
public void fruitWarehouseAction(){};
public void spiceWarehouseAction(){};
public void fabricWarehouseAction(){};
public void policeStationAction(){};
public void caravansaryAction(){};
public void teaHouseAction(){};
public void wainwrightAction(){};
public void gemstoneDealerAction(){};
public void sultansPalaceAction(){};










