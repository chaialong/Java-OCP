package chapter3.second;

public class Crate<T> {
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(){
        this.contents = contents;
    }
}
