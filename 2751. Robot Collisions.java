import java.util.*;

class Solution {

    static class Robot {
        int pos, health, idx;
        char dir;

        Robot(int p, int h, char d, int i) {
            pos = p;
            health = h;
            dir = d;
            idx = i;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

        Robot[] robots = new Robot[n];
        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
        }

        // sort by position
        Arrays.sort(robots, (a, b) -> a.pos - b.pos);

        Stack<Robot> stack = new Stack<>();

        for (Robot curr : robots) {

            if (curr.dir == 'R') {
                stack.push(curr);
            } else {
                // curr is 'L'
                while (!stack.isEmpty() && stack.peek().dir == 'R') {

                    Robot top = stack.peek();

                    if (top.health < curr.health) {
                        stack.pop();
                        curr.health--;
                    } 
                    else if (top.health > curr.health) {
                        top.health--;
                        curr.health = 0;
                        break;
                    } 
                    else {
                        stack.pop();
                        curr.health = 0;
                        break;
                    }
                }

                // if survives, just ignore (it continues left)
                // no need to push
            }
        }

        // collect survivors
        List<Robot> survivors = new ArrayList<>();

        for (Robot r : stack) {
            if (r.health > 0) survivors.add(r);
        }

        // ⚠️ IMPORTANT: also include surviving L robots
        for (Robot r : robots) {
            if (r.dir == 'L' && r.health > 0) {
                survivors.add(r);
            }
        }

        // sort by original index
        survivors.sort((a, b) -> a.idx - b.idx);

        List<Integer> result = new ArrayList<>();
        for (Robot r : survivors) {
            result.add(r.health);
        }

        return result;
    }
}
