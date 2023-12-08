public abstract class GO implements Comparable<GO>{
    protected double square;
    @Override
    public int compareTo(GO o) {
        return Double.compare(this.square, o.square);
    }

}
