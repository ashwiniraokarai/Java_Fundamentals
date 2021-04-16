package samples;

public class StringRegionMatch {
	public static void main(String[] args) {
        String searchMe = "Green Ham and Eggs";
        String findMe = "Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        System.out.println(searchMeLength - findMeLength);
        boolean foundIt = false;
        for (int i = 0; 
             i <= (searchMeLength - findMeLength); 
             i++) {
        	
							        	//You don't have to search the entire length of the primary string because
										//the search pointer only needs to point to the beginning index of the region 
										//to be searched. So, you can discount the length of the region from the upper limit
										//of your search. Once the search pointer reaches say, "E" (index 14), the regionMatches
										//will factor-in the "region" portion (length of the match region you provided, which is stored in
										//integer findMeLength
        	
           if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
              foundIt = true;
              System.out.println(i);
              System.out.println(searchMe.substring(i, i + findMeLength));
             // break;
           }
        }
        if (!foundIt)
            System.out.println("No match found.");
    }

}
