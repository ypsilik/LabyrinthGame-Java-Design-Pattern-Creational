package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 * @throws LabyrinthException 
	 */
	public static void main(String[] args) throws LabyrinthException
	{
		Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2,0));
		blockPositions.add(new Position(3,0));
		blockPositions.add(new Position(0,1));
		blockPositions.add(new Position(0,2));
		blockPositions.add(new Position(1,2));
		blockPositions.add(new Position(3,2));
		blockPositions.add(new Position(3,3));
		
		System.out.println("Choix du robot \n 1 ==> Dumb \n 2 ==> Lesser (choisir 2 !)");
		Scanner sc = new Scanner(System.in);
		int robot = sc.nextInt();
		
		Labyrinth laby = new LabyrinthBuilder().setWidth(4).setHeight(4).setForbiddenCellPositions(blockPositions).setExitPosition(new Position(-3,1)).getLabyrinth(); 

		new LabyrinthGame(laby, new RobotMaker().createRobot(robot)).play();
	}
}
