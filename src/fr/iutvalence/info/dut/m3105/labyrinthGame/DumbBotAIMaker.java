package fr.iutvalence.info.dut.m3105.labyrinthGame;

public class DumbBotAIMaker implements RobotAIMaker 
{
	public RobotArtificialIntelligence makeRobot() {
		return new DumbBotArtificialIntelligence() ;
	}
}
