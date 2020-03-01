import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        while (left < right)
        {
            if (people[left] + people[right] > limit)
            {
                right = right - 1;
                boat = boat + 1;
            }
            if (people[left] + people[right] <= limit)
            {
                left = left + 1;
                right = right - 1;
                boat = boat + 1;
            }
            if (left == right)
            {
                boat = boat + 1;
                break;
            }

        }
        return boat;
    }
}