import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
		Solution sol = new Solution();
		String[] ex1 = {".#...", "..#..", "...#."};
        String[] ex2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] ex3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] ex4 = {"..", "#."};
        
		System.out.println(Arrays.toString(sol.solution(ex1))); // [0, 1, 3, 4]
		System.out.println(Arrays.toString(sol.solution(ex2))); // [1, 3, 5, 8]
		System.out.println(Arrays.toString(sol.solution(ex3))); // [0, 0, 7, 9]
		System.out.println(Arrays.toString(sol.solution(ex4))); // [1, 0, 2, 1]
	}

    public int[] solution(String[] wallpaper) {
    	int lux = 50;
    	int luy = 50;
    	int rdx = 0;
    	int rdy = 0;

        for(int i = 0; i<wallpaper.length; i++) {      
        	for(int j = 0; j<wallpaper[i].length(); j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        			if(i<lux) lux = i;
        			if(j<luy) luy = j;
        			if(i>rdx) rdx = i;        			
        			if(j>rdy) rdy = j;
        		}
        	}
        }
        
        int[] answer = {lux, luy, rdx+1, rdy+1};
        return answer;
    }
}