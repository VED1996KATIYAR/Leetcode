class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int mod=n%10;
            arr.add(mod);
            n/=10;
        }
        int product=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int pro=arr.get(i)*arr.get(j);
                if(pro>product){
                    product=pro;
                }
            }
        }
        return product;
    }
}