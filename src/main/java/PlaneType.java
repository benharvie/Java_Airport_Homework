public enum PlaneType {
    BOEING(420),
    CONCORDE(100),
    DREAMLINER(212),
    FOKKER(80);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
