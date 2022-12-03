package bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        boolean isStart = playerScore1 == playerScore2;
        boolean isEnd = playerScore1 >= 4 || playerScore2 >= 4;
        if (isStart) {
            return getStartGameCalledScore(playerScore1);
        }
        if (isEnd) {
            return getEndGameCallScore(playerScore1, playerScore2);

        }
        return getPlayerCalledScore(playerScore1) + " - " + getPlayerCalledScore(playerScore2);
    }

    private static String getPlayerCalledScore(int tempScore) {
        switch (tempScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }

    private static String getEndGameCallScore(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getStartGameCalledScore(int playerScore1) {
        switch (playerScore1) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }
}
