public class App {
	public static void main(String[] args) {
		System.out.println("Start:   " + chars.getChar3());
		System.out.println("Exit:   " + chars.getRoad());
		Point2D start = new Point2D(3, 3);
		Point2D exit = new Point2D(12, 13);
		var mg = new MapGenerator();
		mg.setCat(start);
		mg.setExit(exit);
		System.out.println(
				new MapPrinter()
						.mapColor(mg.getMap()));

		var lee = new WaveAlgorithm(mg.getMap());
		lee.Colorize(start);
		lee.getRoad(exit);

		System.out.println(
				new MapPrinter()
						.mapColor(mg.getMap()));
		System.out.println();
	}
}
