import java.util.Scanner;

public class Decorator {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		float hourlyRate;
		boolean anotherRoom = true;

		System.out.println("Please input hourly rate: ");
		hourlyRate = in.nextFloat();
		Job job = new Job(hourlyRate);

		while (anotherRoom == true) {
			System.out.println("Please enter room's area ");
			int area = in.nextInt();
			System.out.println("Please enter room's unit cost ");
			float unitPrice = in.nextFloat();
			System.out.println("Please enter room's decorating time: ");
			int time = in.nextInt();

			System.out.println("Is it tiled room? (n/y) ");
			String answerTiledRoom = in.next();

			Room room;

			if (answerTiledRoom.contentEquals("n")) {
				room = new Room(area, time, unitPrice);
			} else {
				room = new TiledRoom(area, time, unitPrice);
			}
			job.addRoom(room);

			System.out.println("Is it another room? (n/y) ");
			String answerAnother = in.next();
			if (answerAnother.equals("n")) {
				anotherRoom = false;
			} 
			

		}

		System.out.println("The job will cost " + job.calculateCost());
		in.close();
	}
}