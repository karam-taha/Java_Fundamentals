import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Anti-Hero", "I have this thing where I get older...");
        map.put("STAR WALKIN", "Don't ever say it's over if I'm breathing...");
        map.put("I Ain't Worried", "I don't know what you've been told...");
        map.put("As It Was", "Come on, Harry, we wanna say good night to you!...");

        String val = map.get("STAR WALKIN");

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }
    }
}