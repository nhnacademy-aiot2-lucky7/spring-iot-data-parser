package com.nhnacademy.common.parser.impl;

import com.nhnacademy.common.parser.DataParser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 추후 구현 예정...
 */
public final class BinaryDataParser implements DataParser {

    @Override
    public String getFileType() {
        return "";
    }

    @Override
    public boolean matchDataType(String payload) {
        return false;
    }

    @Override
    public Map<String, Object> parsing(String payload) throws IOException {
        return Map.of();
    }

    @Override
    public List<Map<String, Object>> parsing(File file) throws IOException {
        return List.of();
    }
}
