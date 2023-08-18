import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic {

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        return (courses == null? List.of(): 
                courses.stream().map(String::length).collect(Collectors.toList()));
    }
}