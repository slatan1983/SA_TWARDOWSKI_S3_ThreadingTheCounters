package RippingTheThreads.Interfaces;

public interface Timeable {
    long startTime = 0;
    long endTime = 0;
    long elapsedTime = 0;

    public long getElapsedTime();
}
