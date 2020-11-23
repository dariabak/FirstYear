import java.util.ArrayList;
public class Job {
	float hourlyRate;
	ArrayList<Room> allRooms = new ArrayList<Room>();
	Job(float hourlyRate){
		this.hourlyRate = hourlyRate;
	}
	float calculateCost(){
		int sum = 0;
		for (int i = 0; i < allRooms.size(); i++) {
		sum += allRooms.get(i).calculateCost(hourlyRate);
		}
		return sum;
	}
	void addRoom(Room room) {
	allRooms.add(room);
	}
}