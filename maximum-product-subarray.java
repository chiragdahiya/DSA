int maxEnd = nums[0];
        int minEnd = nums[0];
        int best = nums[0];

        for(int i=1;i<n;i++){
            int num = nums[i];
            if(num<0){
                int temp = maxEnd;
                maxEnd =  minEnd;
                minEnd = temp;
            }
            maxEnd = Math.max(num,maxEnd*num);
            minEnd = Math.min(num,minEnd*num);
            best = Math.max(best,maxEnd);
        }

        return best;
        
    }
}