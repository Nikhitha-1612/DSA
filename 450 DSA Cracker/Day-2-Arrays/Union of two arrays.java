class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> s = new HashSet<>(); 
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            s.add(b[j]);
        }
        return s.size();
    }
}
