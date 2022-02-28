import java.util.Scanner;
import java.util.ArrayList;

   public class UserIDSorting {

      public static int partition(ArrayList<String> userIDs, int i, int k) {

         String pivot = userIDs.get(k);

         int ind = (i-1);

         for (int j=i; j<k; j++) {

            if (userIDs.get(j).compareTo(pivot)<0) {

               ind++;

               String temp = userIDs.get(ind);

                userIDs.set(ind, userIDs.get(j));

               userIDs.set(j, temp);

            }

      }

    String temp = userIDs.get(ind+1);

    userIDs.set(ind+1, userIDs.get(k));

    userIDs.set(k, temp);

    return ind+1;

    }

    public static void quicksort(ArrayList<String> UserIDs, int i, int k) {

    if (i < k) {

      int pi = partition(UserIDs, i, k);

      quicksort(UserIDs, i, pi-1);

      quicksort(UserIDs, pi+1, k);

    }

   }
    public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      ArrayList<String> userIDList = new ArrayList<String>();

      String userID;

      userID = scnr.next();

      while (!userID.equals("-1")) {

      userIDList.add(userID);

      userID = scnr.next();

    } 

// Initial call to quicksort

quicksort(userIDList, 0, userIDList.size() - 1);

   for (int i = 0; i < userIDList.size(); ++i) {

      System.out.println(userIDList.get(i));

      }

   }

}