package edu.kis.powp.jobs2d.events;

public enum FigureOption {
	FIGURE_JOHN_1("Figure Joe 1"),
	PAT_TERN_1("Pat Tern 1"),
	RECTANGLE_1("Rectangle 1"),
	DIAMOND_1("Diamond 1");

	private final String nameOfFigure;

	FigureOption(String nameOfFigure) {
		this.nameOfFigure = nameOfFigure;
	}

	public String getNameOfFigure() {
		return nameOfFigure;
	}
}
