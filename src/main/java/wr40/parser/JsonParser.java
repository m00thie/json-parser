package wr40.parser;

public interface JsonParser {
    String toJson(Object o);
    <T> T parse(String json, Class<T> cls);
}
