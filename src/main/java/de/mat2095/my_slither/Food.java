package de.mat2095.my_slither;


class Food {

    final int x, y;
    private final double size;
    private final double rsp;
    private final long spawnTime;
    /**
     * Constructor for the Food class
     * @param  x integer, the x coordinate of the food
     * @param  y the integer, y coordinate of the food
     * @param  size double, the size of the food
     * @param  fastSpawn boolean,
     * @return Description text text text.
     */
    Food(int x, int y, double size, boolean fastSpawn) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.rsp = fastSpawn ? 4 : 1;
        spawnTime = System.currentTimeMillis();
    }
    /**
     * Accessor for size variable
     * @return size
     */
    double getSize() {
        return size;
    }
    /**
     * Calculates the radius of the food
     * @return size if the fillRate is >= 1
     * @return radius if the fillRate is < 1
     */
    double getRadius() {
        double fillRate = rsp * (System.currentTimeMillis() - spawnTime) / 1200;
        if (fillRate >= 1) {
            return size;
        } else {
            return (1 - Math.cos(Math.PI * fillRate)) / 2 * size;
        }
    }
}
