package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.adapter.DrawerDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	private static Job2dDriver driver = new StubDriver();
	private static DrawerDriverAdapter adapter = new DrawerDriverAdapter();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		FiguresJoe.figureScript1(driver);
		DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
			adapter.operateTo(x, y);
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
			adapter.setPosition(x, y);

		}

	};
}
