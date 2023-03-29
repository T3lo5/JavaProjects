import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {

    private static final Pattern REGEX_ITEM_JSON = Pattern.compile("\"results\":\\[(.*)\\]");
    private static final Pattern REGEX_ITEM = Pattern.compile(String.valueOf(REGEX_ITEM_JSON));
    private static final Pattern REGEX_ATRIBUT_JSON = Pattern.compile("\"(\\w+)\":\"([^\"]*)\"");
    private static final Pattern REGEX_ATRIBUT = Pattern.compile(String.valueOf(REGEX_ATRIBUT_JSON));
    public List<Map<String, String>> parse(String json) {
        Matcher matcher = REGEX_ITEM.matcher(json);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Not find a movie list");
        }

        String[] items = matcher.group(1).split("\\},\\{");
        List<Map<String, String>> data = new ArrayList<>();
        for (String item : items) {
            Map<String, String> itemAtributes = new HashMap<>();

            Matcher atributMatcher = REGEX_ATRIBUT_JSON.matcher(item);
            while (atributMatcher.find()) {
                String atribut = atributMatcher.group(1);
                String value = atributMatcher.group(2);
                itemAtributes.put(atribut, value);
            }
            data.add(itemAtributes);
        }
        return data;
    }
}
