package week7.day2;

public class Learn2DArray {
public static void main(String[] args) {
	String[][] timetable = {{"Eng","Math","Phy","Chem","CS"},
							{"Math","Eng","Chem","CS","Phy"},
							{"Phy","Chem","Eng","Math","CS"},
							{"CS","Phy","Math","Eng","Chem"}};
	System.out.println(timetable.length);
	for (int i = 0; i < timetable.length; i++) {
		for (int j = 0; j < timetable[i].length; j++) {
			System.out.println(timetable[i][j]);
		}
	}
}
}
