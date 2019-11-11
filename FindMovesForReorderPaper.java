import java.util.ArrayList;
import java.util.Arrays;

public class FindMovesForReorderPaper {

    public static void main(String[] args)
    {
        ArrayList<Integer> o = new ArrayList<Integer>(Arrays.asList(2,3,1,4,5,7,6,8));
        ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        int moves = FindMoves(o, d);
        System.out.println("moves : "+moves);
    }

    public static int FindMoves(ArrayList<Integer> o,ArrayList<Integer> d) {
        ArrayList<Integer> s = new ArrayList<Integer>();
        int moves = 0;
        if (o.equals(d)) {
            return 1;
        } else if (reverseArrayList(o).equals(d)) {
            return o.size();
        } else {
            for (int i = 0; i < o.size(); i++) {
                int itemi = o.get(i);
                int di = d.indexOf(itemi);
                int nextiIndex = i + 1;
                int nextdIndex = di + 1;
                if (nextiIndex < o.size() && nextdIndex < o.size()) {
                    if (o.get(nextiIndex) == d.get(nextdIndex)) {
                        s.add(itemi);
                    } else {
                        s.add(itemi);
                        moves++;
                    }
                } else {
                    s.add(itemi);
                    moves++;
                }
                System.out.println("Moves per item :" + moves);
                System.out.println("S per loop  :" +  s);
            }
            return moves;
        }
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revArrayList.add(alist.get(i));
        }
        return revArrayList;
    }

}
