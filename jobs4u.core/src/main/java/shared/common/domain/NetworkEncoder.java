package shared.common.domain;

import java.util.ArrayList;
import java.util.List;

public class NetworkEncoder {

    public static byte[] getBytes(List<String> stringList) {
        List<Byte> data = new ArrayList<>();
        for (String str : stringList) {
            data.addAll(toByteList(str.getBytes()));
            data.add((byte) 0);
        }
        return toByteArray(data);
    }

    public static List<Byte> toByteList(byte[] data) {
        List<Byte> result = new ArrayList<>();
        for (byte character : data) {
            result.add(character);
        }
        return result;
    }

    public static byte[] toByteArray(List<Byte> data) {
        byte[] result = new byte[data.size()];
        int i = 0;
        for (Byte character : data) {
            result[i] = character;
            i++;
        }
        return result;
    }

    public static List<String> decode(List<Byte> data) {
        List<String> stringList = new ArrayList<>();
        List<Byte> byteList = new ArrayList<>();
        for (Byte character : data) {
            if (character == 0) {
                stringList.add(new String(toByteArray(byteList), 0, byteList.size()));
                byteList = new ArrayList<>();
            } else {
                byteList.add(character);
            }
        }
        if (byteList.size() != 0) {
            stringList.add(new String(toByteArray(byteList), 0, byteList.size()));
        }
        return stringList;
    }
}
