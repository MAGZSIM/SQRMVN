import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            " 200, 300 ",
            " 300, 600 ",
            " -200, -300",
            " 10, 99 ",
            " 9, 98 ",
            " 11, 100 ",
            " 0, 50 "

    })
    public void Borders(int min, int max) {
        SQRService service = new SQRService();
        int sqr = service.counter(min, max);
        System.out.println(sqr);
    }
}
