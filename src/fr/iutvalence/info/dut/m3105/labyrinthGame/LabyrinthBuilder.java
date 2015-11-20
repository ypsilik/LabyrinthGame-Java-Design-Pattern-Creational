package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder
{
	private int width;
	private Position exitPosition;
	private Set<Position> forbiddenCellPositions;
	private int height;

	public LabyrinthBuilder setWidth(int width) throws LabyrinthException
	{
		if (width > 0)
		{
			this.width = width;
			return this;
		}
		throw new LabyrinthException();
	}

	public LabyrinthBuilder setHeight(int height) throws LabyrinthException
	{
		if (height > 0)
		{
			this.height = height;
			return this;
		}
		throw new LabyrinthException();
	}

	public LabyrinthBuilder setForbiddenCellPositions(
			Set<Position> forbiddenCellPositions) throws LabyrinthException
	{
		if (forbiddenCellPositions == null)
		{
			throw new LabyrinthException();
		}
		this.forbiddenCellPositions = forbiddenCellPositions;
		return this;
	}

	public LabyrinthBuilder setExitPosition(Position exitPosition)
			throws LabyrinthException
	{
		if ((exitPosition == null)||(exitPosition.getX() < 0)||(exitPosition.getY() < 0))
		{
			throw new LabyrinthException();
		}
		this.exitPosition = exitPosition;
		return this;
	}

	public Labyrinth getLabyrinth() throws LabyrinthException
	{
		if ((this.exitPosition.getX() > this.width)
				|| (this.exitPosition.getY() > this.height)
				|| (forbiddenCellPositions.contains(this.exitPosition)))
		{
			throw new LabyrinthException();
		}
		for (Position position : forbiddenCellPositions)
		{
			if ((position.getX() > this.width)||(position.getX() < 0)||(position.getY() > this.height)||(position.getY() < 0)) {
				throw new LabyrinthException();
			}
		}
		
		return new Labyrinth(this.width, this.height,
				this.forbiddenCellPositions, this.exitPosition);
	}
}
