class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i=0,j=0,k=0;
        int prev1,prev2,prev3;
        prev1=prev2=prev3=Integer.MIN_VALUE;
        while(i<n1 && j<n2 && k<n3){
            while(i<n1 && A[i]==prev1)
            i++;
            while(j<n2 &&  B[j]==prev2)
            j++;
            while(k<n3 && C[k]==prev3)
            k++;
            if(i<n1 && j<n2 && k<n3){
                if(A[i]==B[j] && B[j]==C[k]){
                    prev1=A[i];
                    prev2=B[j];
                    prev3=C[k];
                    list.add(A[i]);
                    i++;
                    j++;
                    k++;
                }
                else if(A[i]<B[j]){
                    prev1=A[i];
                    i++;
                }
                else if(B[j]<C[k]){
                    prev2=B[j];
                    j++;
                }
                else{
                    prev3=C[k];
                    k++;
                }
            }
        }
        return list;
    }
}
