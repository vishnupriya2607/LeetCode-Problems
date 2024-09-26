import java.util.ArrayList;
import java.util.List;

class MyCalendar {
    List<int[]> events;
    public MyCalendar() {
        events = new ArrayList<>();
    }
    public boolean book(int start, int end) {
        for (int[] event : events) {
            int existingStart = event[0];
            int existingEnd = event[1];
            if (start < existingEnd && end > existingStart) {
                return false;
            }
        }
        events.add(new int[]{start, end});
        return true;
    }
}
