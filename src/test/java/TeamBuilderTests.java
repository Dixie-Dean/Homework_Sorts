import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeamBuilderTests {
    TeamBuilder teamBuilder = new TeamBuilder();

    @Test
    public void mergeCorrectResult() {
        //given
        int[] firstTeam = { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 };
        int[] secondTeam = { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 };
        int[] expected = {45, 31, 31, 24, 22, 20, 18, 17, 15, 14};

        //act
        int[] result = teamBuilder.merge(firstTeam, secondTeam);

        //assert
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void mergeResultNotNull() {
        //given
        int[] firstTeam = { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 };
        int[] secondTeam = { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 };

        //act
        int[] result = teamBuilder.merge(firstTeam, secondTeam);

        //assert
        Assertions.assertNotNull(result);
    }
}
