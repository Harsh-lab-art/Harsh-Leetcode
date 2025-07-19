class Solution 
{
    public List<String> removeSubfolders(String[] folder) 
    {
        Arrays.sort(folder);
        List<String> res=new ArrayList<>();
        String prev="";
        for(String s:folder)
        {
            if(prev.isEmpty()||!s.startsWith(prev+"/"))
            {
                res.add(s);
                prev=s;
            }
        }
        return res;
    }
}
