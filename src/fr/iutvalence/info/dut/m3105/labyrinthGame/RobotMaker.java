package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class RobotMaker
{
	public static RobotArtificialIntelligence createRobot(int nameRobot) {
		if (nameRobot == 1) {
			return new DumbBotArtificialIntelligence();
		}
		if (nameRobot == 2) {
			return new LesserDumbBotArtificialIntelligence();
		}
		return null;
	}
}
