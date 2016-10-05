package chapter8;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UriDemo {
    public static void main(String[] args) throws URISyntaxException {
        URI uri1 = new URI("http://www.baidu.com");
        Path path = Paths.get(uri1);
        URI uri = path.toUri();
    }
}
