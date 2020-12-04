package chapter.l20_12_04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path; // 경로를 객체로
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.net.URI;

public class SR03IteratorNStream {

    public static void main(String[] args) throws URISyntaxException {
        // 텍스트파일, 배열, List등 
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Path path = Paths.get(classLoader.getResourceAsStream("chapter/l20_12_04/Hello.txt").toURI());
        Stream<String> stream = Files.lines(path,Charset.defaultCharset());
        // stream.forEach(x->System.out.println(x)); // 람다방식
        stream.forEach(System.out::println); // 메소드 레퍼런스방식

        File file = path.toFile();
        FileReader fr = new FileReader(file); // 파일을 읽는 빨대(2바이트짜리)
        // 새로운 기능을 추가 (장식)하는패턴 ==> 데코레이션 패턴
        BufferedReader br = new BufferedReader(fr); // 위의 빨대에 추가 
        stream = br.lines();
        stream.forEach(System.out::println);


    }
    
}
