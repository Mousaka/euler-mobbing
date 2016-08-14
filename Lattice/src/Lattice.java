enum Direction {
   RIGHT,
   DOWN
}

class Lattice {
   private int counter = 0;

   //TODO: Fix this. Gives wrong answer too slow
   int start() {
      path(new PathWalker());
      return counter;
   }

   private void path(final PathWalker walker) {
      if (walker.finish()) {
         return;
      }
      if (walker.okMove(Direction.RIGHT)) {
         counter++;
         path(walker.move(Direction.RIGHT));
      }
      if (walker.okMove(Direction.DOWN)) {
         counter++;
         path(walker.move(Direction.DOWN));
      }
   }

   private class PathWalker {
      final int x;
      final int y;

      PathWalker() {
         this(1, 1);
      }

      private PathWalker(final int x, final int y) {
         this.x = x;
         this.y = y;
         //System.out.println("x:"+x+" y:"+y);
      }

      public PathWalker clone(final PathWalker pathWalker) {
         return new PathWalker(pathWalker.x, pathWalker.y);
      }

      boolean finish() {
         return this.x == 20 && this.y == 20;
      }

      PathWalker move(final Direction direction) {
         return direction == Direction.RIGHT ? new PathWalker(x + 1, y) : new PathWalker(x, y + 1);
      }

      public boolean illegalPosition() {

         return x > 20 || y > 20;
      }

      boolean okMove(final Direction direction) {
         return (direction == Direction.RIGHT && x < 20) || (direction == Direction.DOWN && y < 20);
      }
   }
}
