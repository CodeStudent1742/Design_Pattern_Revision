package example2.chesspiece;

public class ColorRepository {
    static Color black = new Color(255,255,255);
    static Color white = new Color(0,0,0);
    public static Color getBlack() {
        return black;
    }
    public static Color getWhite() {
        return white;
    }

}
