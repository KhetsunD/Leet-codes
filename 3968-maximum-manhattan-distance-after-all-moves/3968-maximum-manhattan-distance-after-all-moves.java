class Solution {
    public int maxDistance(String moves) {
        int y=0;
        int x=0;
        int k=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
            y++;
            else if(moves.charAt(i)=='D')
            y--;
            else if(moves.charAt(i)=='R')
            x++;
            else if(moves.charAt(i)=='L')
            x--;
            else
            k++;
        }
        return Math.abs(x)+Math.abs(y)+k;
    }
}