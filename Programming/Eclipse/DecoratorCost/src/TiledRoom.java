
public class TiledRoom extends Room {
	
	TiledRoom (int area, int time, float unitPrice) {
	super(area, time, unitPrice);
	}
	
	@Override
	float calculateCost(float hourlyRate) {
		return super.calculateCost(hourlyRate * 1.5f) + area; //extra for grout
		
		
	}
}
