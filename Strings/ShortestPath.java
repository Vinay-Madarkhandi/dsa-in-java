//Given a route containing 4 directions (E, W, N, S),
//find the shortest path to reach destination.
//"WNEENESENNN"

public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENSNWEESENNN";

        System.out.println(getShortestPath(path));

    }
}
