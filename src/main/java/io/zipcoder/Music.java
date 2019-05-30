package io.zipcoder;

public class Music {

    private String[] playList;
    int min1= 0;
    int min2=0;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int count=0;
        int i=startIndex;

            while (!playList[i].equalsIgnoreCase(selection)) {
                count++;
                i++;
            }
            min1 = count;
            i=startIndex;
            count=0;
        while (!playList[i].equalsIgnoreCase(selection)) {
            if(i==0){
                i=playList.length;
            }
            count++;
            i--;
        }
        min2 = count;

        if(min1<min2)
            return min1;
        else
            return min2;

    }
}

