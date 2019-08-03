package RevisaoPOO;

public interface IRobot {
	void setStartPosition(Position position);
	void setFinalPosition(Position position);
	void printPosition();
	Position getCurrentPosition();
	Position move();

}
