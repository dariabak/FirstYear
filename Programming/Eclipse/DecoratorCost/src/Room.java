
public class Room {
	int area, time;
	float unitPrice;
	Room(int area, int time, float unitPrice){
		this.area = area;
		this.time = time;
		this.unitPrice = unitPrice;
	}
	float calculateCost(float hourlyRate){
		return ((time*hourlyRate) + (area*unitPrice));
	}
}