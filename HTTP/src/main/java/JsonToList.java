import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonToList {
    public List<Members> listOfMembers(String jsonArray) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Members>>() {
        }.getType();
        List<Members> gsonList = gson.fromJson(jsonArray, listType);
        return gsonList;
    }
}
