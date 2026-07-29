class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int a:nums1){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        for (int b:nums2){
            if(map1.containsKey(b)){
                map1.put(b,map1.get(b)+1);
            }else {
                map1.put(b,1);
            }
        }
        int l=nums1.length;
        int r=nums2.length;
        if(l<r){
            for(int a:map1.keySet()){
                if(map.get(a)!=null){
                    map2.put(a,Math.min(map.get(a),map1.get(a)));
                }
            }
        }else{
            for(int a:map.keySet()){
                if(map1.get(a)!=null){
                    map2.put(a,Math.min(map1.get(a),map.get(a)));
                }
            }
        }
        List<Integer> one=new ArrayList<>();
        for(int c:map2.keySet()){
            int d=map2.get(c);
            for(int i=1;i<=d;i++){
                one.add(c);
            }
        }
        int num[]=new int[one.size()];
        for(int i=0;i<one.size();i++){
            num[i]=one.get(i);
        }
        return num;
    }
}