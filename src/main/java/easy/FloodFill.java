package easy;

/**
 * An image is represented by an m x n integer grid image where image[i][j]
 * represents the pixel value of the image.
 * You are also given three integers sr, sc, and color. You should perform
 * a flood fill on the image starting from the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel, plus any pixels
 * connected 4-directionally to the starting pixel of the same color as the
 * starting pixel, plus any pixels connected 4-directionally to those pixels
 * (also with the same color), and so on. Replace the color of all of
 * the aforementioned pixels with color.
 * Return the modified image after performing the flood fill.
 */
public class FloodFill {

    /**
     * 0 ms, 44.60 MB
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length) {
            return image;
        }
        floodFillHelper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void floodFillHelper(int[][] image, int i, int j, int c, int old) {
        if (i < 0
            || j < 0
            || i >= image.length
            || j >= image[i].length
            || image[i][j] != old
            || image[i][j] == c
        ) {
            return;
        }
        image[i][j] = c;

        floodFillHelper(image, i + 1, j, c, old);
        floodFillHelper(image, i - 1, j, c, old);
        floodFillHelper(image, i, j + 1, c, old);
        floodFillHelper(image, i, j - 1, c, old);
    }
}
