package chapter3.second.questions;

public class Crate<T> {
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(){
        this.contents = contents;
    }
}
