package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class LesserDumbBotAIMaker implements RobotAIMaker
{
	public RobotArtificialIntelligence makeRobot() {
			return new LesserDumbBotArtificialIntelligence();
	}
}
