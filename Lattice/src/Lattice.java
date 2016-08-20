class Lattice {
   private final int gridSize;

   Lattice(final int gridSize) {
      this.gridSize = gridSize + 1;
   }

   int start() {
      final Point[][] grid = new Point[gridSize][gridSize];
      grid[0] = firstRow(gridSize);
      for (int y = 1; y < gridSize; y++) {
         grid[y][0] = new Point(0, grid[y - 1][0].paths());
         for (int x = 1; x < gridSize; x++) {
            grid[y][x] = new Point(grid[y][x - 1].paths(), grid[y - 1][x].paths());
         }
      }
      return grid[gridSize - 1][gridSize - 1].paths();
   }

   private Point[] firstRow(final int gridSize) {
      final Point[] row = new Point[gridSize];
      row[0] = Point.startPoint();
      for (int i = 1; i < gridSize; i++) {
         row[i] = new Point(row[i - 1].paths(), 0);
      }
      return row;
   }
}

class Point {
   final private int paths;

   private Point(final int paths) {
      this.paths = paths;
   }

   Point(final int left, final int above) {
      this.paths = left + above;
   }

   static Point startPoint() {
      return new Point(1);
   }

   int paths() {
      return paths;
   }
}

