import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.awt.Point

internal class TicTacToeTest{

    private val ticTacToe = TicTacToe()
    private lateinit var board: Array<Array<String>>

    @BeforeEach
    fun init() {
        val firstLine = arrayOf("","","")
        val secondLine = arrayOf("","","")
        val thirdLine = arrayOf("","","")
        board = arrayOf(firstLine, secondLine, thirdLine)
    }

    @Test
    fun should_return_result_with_empty_board_and_no_result_value(){
        //given
        val player = ""
        val point = Point(0,0)
        val firstLine = arrayOf("","","")
        val secondLine = arrayOf("","","")
        val thirdLine = arrayOf("","","")
        val expectedBoard = arrayOf(firstLine, secondLine, thirdLine)

        val expected = Match(expectedBoard, ResultEnum.NO_RESULT)

        //when
        val result = ticTacToe.callForAction(player, point, board)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun should_return_result_with_x_player_in_expected_position() {
        //given
        val player = "X"
        val point = Point(0,0)

        val firstLine = arrayOf("X","","")
        val secondLine = arrayOf("","","")
        val thirdLine = arrayOf("","","")
        val expectedBoard = arrayOf(firstLine, secondLine, thirdLine)

        val expected = Match(expectedBoard, ResultEnum.NO_RESULT)

        //when
        val result = ticTacToe.callForAction(player, point, board)

        //then
        assertEquals(expected, result)
    }

    @Test
    fun should_retur_correct_board_when_send_several_actions() {
        //given
        val player = "X"
        val point = Point(0,0)
        val firstLine = arrayOf("X","O","")
        val secondLine = arrayOf("","X","O")
        val thirdLine = arrayOf("","O","X")
        val expectedBoard = arrayOf(firstLine, secondLine, thirdLine)


    }

}