import com.google.gson.Gson;
import json.Reconciliation;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Reconciliation reconciliation = new Reconciliation();
        reconciliation.custom_status = "done";
        reconciliation.trx_id = "123";

        List<Reconciliation> list = new ArrayList<>();
        list.add(reconciliation);
        list.add(reconciliation);
        String json = gson.toJson(list);
        System.out.println(json);
    }
}
