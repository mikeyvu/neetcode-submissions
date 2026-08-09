class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorOrg = image[sr][sc];

        return helper(image, colorOrg, sr, sc, color);
    }

    public int[][] helper(int[][] image, int colorOrg, int sr, int sc, int color) {
        if (sr >= image.length || sr < 0 || sc >= image[0].length || sc < 0) {
            return image;
        }

        if (image[sr][sc] == color) {
            return image;
        }
        
        if (image[sr][sc] != colorOrg) {
            return image;
        }
        
        image[sr][sc] = color;

        image = helper(image, colorOrg, sr + 1, sc, color);
        image = helper(image, colorOrg, sr - 1, sc, color);
        image = helper(image, colorOrg, sr, sc + 1, color);
        image = helper(image, colorOrg, sr, sc - 1, color);

        return image;
    }
}