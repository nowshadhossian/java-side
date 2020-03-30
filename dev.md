Arrays.sort() <br>
Collections.sort()

<br>

####Technique 1
https://www.hackerrank.com/challenges/migratory-birds/

```code
 static int migratoryBirds(int[] birds) {
        /* Get counts of each type */
        int[] count = new int[NUM_TYPES + 1];
        for (int num : birds) {
            count[num]++;
        }
        
        
        int maxIndex = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
```

####Technique 2
