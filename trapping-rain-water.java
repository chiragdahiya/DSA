leftmax = Math.max(leftmax, height[j]);
            }
            for(int j=i;j<n;j++){
                rightmax = Math.max(rightmax, height[j]);
                
            }
         total += Math.min(leftmax,rightmax) - height[i];
        
        
        
        
        
    }
     return total;
   
}
}