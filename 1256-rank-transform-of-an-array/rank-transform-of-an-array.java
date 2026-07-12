class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr1[]=new int[arr.length];
        int index=0;
        for(int a:arr){
            arr1[index++]=a;
        }
        Arrays.sort(arr1);
        HashMap<Integer,Integer> arrr=new HashMap<>();
        int start=1;
        for(int a:arr1){
            if(!arrr.containsKey(a)){
            arrr.put(a,start);
            start++;}
        }
        int v[]=new int[arr.length];
        int i=0;
        for(int a:arr){
            v[i++]=arrr.get(a);

        }
        return v;
    }
}