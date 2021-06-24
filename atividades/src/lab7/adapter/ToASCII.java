package lab7.adapter;

import java.util.ArrayList;
import java.util.List;

public class ToASCII implements Adapter {

    @Override
    public List<Short> adaptar(String data) {
        List<Short> conversao = new ArrayList<>();
        for (int i = 0; i < data.length(); ++i) {
            char c = data.charAt(i);
            short s = (short) c;
            conversao.add(s);
        }
        return conversao;
    }

}
